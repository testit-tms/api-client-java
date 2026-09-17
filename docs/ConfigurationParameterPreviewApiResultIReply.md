

# ConfigurationParameterPreviewApiResultIReply

## oneOf schemas
* [ConfigurationParameterPreviewApiResultCountReply](ConfigurationParameterPreviewApiResultCountReply.md)
* [ConfigurationParameterPreviewApiResultGroupedReply](ConfigurationParameterPreviewApiResultGroupedReply.md)
* [ConfigurationParameterPreviewApiResultReply](ConfigurationParameterPreviewApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.ConfigurationParameterPreviewApiResultIReply;
import ru.testit.client.model.ConfigurationParameterPreviewApiResultCountReply;
import ru.testit.client.model.ConfigurationParameterPreviewApiResultGroupedReply;
import ru.testit.client.model.ConfigurationParameterPreviewApiResultReply;

public class Example {
    public static void main(String[] args) {
        ConfigurationParameterPreviewApiResultIReply exampleConfigurationParameterPreviewApiResultIReply = new ConfigurationParameterPreviewApiResultIReply();

        // create a new ConfigurationParameterPreviewApiResultCountReply
        ConfigurationParameterPreviewApiResultCountReply exampleConfigurationParameterPreviewApiResultCountReply = new ConfigurationParameterPreviewApiResultCountReply();
        // set ConfigurationParameterPreviewApiResultIReply to ConfigurationParameterPreviewApiResultCountReply
        exampleConfigurationParameterPreviewApiResultIReply.setActualInstance(exampleConfigurationParameterPreviewApiResultCountReply);
        // to get back the ConfigurationParameterPreviewApiResultCountReply set earlier
        ConfigurationParameterPreviewApiResultCountReply testConfigurationParameterPreviewApiResultCountReply = (ConfigurationParameterPreviewApiResultCountReply) exampleConfigurationParameterPreviewApiResultIReply.getActualInstance();

        // create a new ConfigurationParameterPreviewApiResultGroupedReply
        ConfigurationParameterPreviewApiResultGroupedReply exampleConfigurationParameterPreviewApiResultGroupedReply = new ConfigurationParameterPreviewApiResultGroupedReply();
        // set ConfigurationParameterPreviewApiResultIReply to ConfigurationParameterPreviewApiResultGroupedReply
        exampleConfigurationParameterPreviewApiResultIReply.setActualInstance(exampleConfigurationParameterPreviewApiResultGroupedReply);
        // to get back the ConfigurationParameterPreviewApiResultGroupedReply set earlier
        ConfigurationParameterPreviewApiResultGroupedReply testConfigurationParameterPreviewApiResultGroupedReply = (ConfigurationParameterPreviewApiResultGroupedReply) exampleConfigurationParameterPreviewApiResultIReply.getActualInstance();

        // create a new ConfigurationParameterPreviewApiResultReply
        ConfigurationParameterPreviewApiResultReply exampleConfigurationParameterPreviewApiResultReply = new ConfigurationParameterPreviewApiResultReply();
        // set ConfigurationParameterPreviewApiResultIReply to ConfigurationParameterPreviewApiResultReply
        exampleConfigurationParameterPreviewApiResultIReply.setActualInstance(exampleConfigurationParameterPreviewApiResultReply);
        // to get back the ConfigurationParameterPreviewApiResultReply set earlier
        ConfigurationParameterPreviewApiResultReply testConfigurationParameterPreviewApiResultReply = (ConfigurationParameterPreviewApiResultReply) exampleConfigurationParameterPreviewApiResultIReply.getActualInstance();
    }
}
```


