

# AIServiceModelApiResultIReply

## oneOf schemas
* [AIServiceModelApiResultGroupedReply](AIServiceModelApiResultGroupedReply.md)
* [AIServiceModelApiResultReply](AIServiceModelApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.AIServiceModelApiResultIReply;
import ru.testit.client.model.AIServiceModelApiResultGroupedReply;
import ru.testit.client.model.AIServiceModelApiResultReply;

public class Example {
    public static void main(String[] args) {
        AIServiceModelApiResultIReply exampleAIServiceModelApiResultIReply = new AIServiceModelApiResultIReply();

        // create a new AIServiceModelApiResultGroupedReply
        AIServiceModelApiResultGroupedReply exampleAIServiceModelApiResultGroupedReply = new AIServiceModelApiResultGroupedReply();
        // set AIServiceModelApiResultIReply to AIServiceModelApiResultGroupedReply
        exampleAIServiceModelApiResultIReply.setActualInstance(exampleAIServiceModelApiResultGroupedReply);
        // to get back the AIServiceModelApiResultGroupedReply set earlier
        AIServiceModelApiResultGroupedReply testAIServiceModelApiResultGroupedReply = (AIServiceModelApiResultGroupedReply) exampleAIServiceModelApiResultIReply.getActualInstance();

        // create a new AIServiceModelApiResultReply
        AIServiceModelApiResultReply exampleAIServiceModelApiResultReply = new AIServiceModelApiResultReply();
        // set AIServiceModelApiResultIReply to AIServiceModelApiResultReply
        exampleAIServiceModelApiResultIReply.setActualInstance(exampleAIServiceModelApiResultReply);
        // to get back the AIServiceModelApiResultReply set earlier
        AIServiceModelApiResultReply testAIServiceModelApiResultReply = (AIServiceModelApiResultReply) exampleAIServiceModelApiResultIReply.getActualInstance();
    }
}
```


