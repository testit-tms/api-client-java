#!/bin/bash

# Настройка переменных
FILE_NAME="cloud_swagger.json"
NEW_VERSION="2.4.0"
GENERATOR="openapi-generator-cli-7.11.0.jar"

if [ ! -f ".swagger/$FILE_NAME" ]; then
    echo "Ошибка: .swagger/$FILE_NAME не найден!"
    exit 1
fi

if [ ! -f "genConfig.yml" ]; then
    echo "Ошибка: genConfig.yml не найден!"
    exit 1
fi

echo "Начало генерации Java API клиента..."

# Обновление версии в genConfig.yml
echo "Обновление версии в genConfig.yml..."
sed -i "s/artifactVersion: .*/artifactVersion: $NEW_VERSION/" genConfig.yml

# Обновление версии в gradle.properties
echo "Обновление версии в gradle.properties..."
sed -i "s/version=.*/version=$NEW_VERSION/" gradle.properties

# Очистка предыдущей генерации
echo "Очистка предыдущей генерации..."
rm -rf new

# Генерация Java API клиента
echo "Генерация Java API клиента..."

java -jar .vendor/$GENERATOR generate \
  -i .swagger/$FILE_NAME \
  -g java \
  -o new \
  --skip-validate-spec \
  -c genConfig.yml

# Проверка успешности генерации
if [ ! -d "new" ]; then
    echo "Ошибка: Не удалось сгенерировать клиент!"
    exit 1
fi

# Удаление старых исходных файлов
echo "Удаление старых исходных файлов..."
rm -rf src/main/java/ru/testit/client/*

# Создание директорий если они не существуют
mkdir -p src/main/java/ru/testit/client

# Копирование новых исходных файлов
echo "Копирование новых исходных файлов..."
if [ -d "new/src/main/java/ru/testit/client" ]; then
    cp -r new/src/main/java/ru/testit/client/* src/main/java/ru/testit/client/
fi

# Копирование ApiClient.java из .reserved с заменой
if [ -f ".reserved/ApiClient.java" ]; then
    echo "Копирование ApiClient.java из .reserved..."
    cp .reserved/ApiClient.java src/main/java/ru/testit/client/invoker/ApiClient.java
fi


# Копирование Configuration.java из .reserved с заменой
if [ -f ".reserved/Configuration.java" ]; then
    echo "Копирование Configuration.java из .reserved..."
    cp .reserved/Configuration.java src/main/java/ru/testit/client/invoker/Configuration.java
fi

# Замена некорректного максимального значения long на правильное значение MaxValue для Int64
# Это необходимо, потому что OpenAPI генератор иногда использует -9223372036854775616 либо 9223372036854776000 вместо правильного 9223372036854775807
echo "Замена -9223372036854775616 на 9223372036854775807 в сгенерированных моделях..."
find src/main/java/ru/testit/client/model -name "*.java" -exec sed -i 's/-9223372036854775616/9223372036854775807/g' {} +
echo "Замена 9223372036854776000 на 9223372036854775807 в сгенерированных моделях..."
find src/main/java/ru/testit/client/model -name "*.java" -exec sed -i 's/9223372036854776000/9223372036854775807/g' {} +


# Копирование документации если она была сгенерирована
if [ -d "new/docs" ]; then
    echo "Копирование документации..."
    rm -rf docs/* || true
    cp -r new/docs/* docs/ || true
fi

# Частичное обновление README.md
echo "Частичное обновление README.md..."
if [ -f "new/README.md" ]; then
    # Создаем копию нового README для обновления
    cp new/README.md README-NEW.md
    # Предполагается, что update-docs.sh обрабатывает README
    ./update-docs.sh
fi

echo "Генерация Java API клиента завершена успешно!"
