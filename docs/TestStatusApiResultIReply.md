

# TestStatusApiResultIReply

## oneOf schemas
* [TestStatusApiResultCountReply](TestStatusApiResultCountReply.md)
* [TestStatusApiResultGroupedReply](TestStatusApiResultGroupedReply.md)
* [TestStatusApiResultReply](TestStatusApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.TestStatusApiResultIReply;
import ru.testit.client.model.TestStatusApiResultCountReply;
import ru.testit.client.model.TestStatusApiResultGroupedReply;
import ru.testit.client.model.TestStatusApiResultReply;

public class Example {
    public static void main(String[] args) {
        TestStatusApiResultIReply exampleTestStatusApiResultIReply = new TestStatusApiResultIReply();

        // create a new TestStatusApiResultCountReply
        TestStatusApiResultCountReply exampleTestStatusApiResultCountReply = new TestStatusApiResultCountReply();
        // set TestStatusApiResultIReply to TestStatusApiResultCountReply
        exampleTestStatusApiResultIReply.setActualInstance(exampleTestStatusApiResultCountReply);
        // to get back the TestStatusApiResultCountReply set earlier
        TestStatusApiResultCountReply testTestStatusApiResultCountReply = (TestStatusApiResultCountReply) exampleTestStatusApiResultIReply.getActualInstance();

        // create a new TestStatusApiResultGroupedReply
        TestStatusApiResultGroupedReply exampleTestStatusApiResultGroupedReply = new TestStatusApiResultGroupedReply();
        // set TestStatusApiResultIReply to TestStatusApiResultGroupedReply
        exampleTestStatusApiResultIReply.setActualInstance(exampleTestStatusApiResultGroupedReply);
        // to get back the TestStatusApiResultGroupedReply set earlier
        TestStatusApiResultGroupedReply testTestStatusApiResultGroupedReply = (TestStatusApiResultGroupedReply) exampleTestStatusApiResultIReply.getActualInstance();

        // create a new TestStatusApiResultReply
        TestStatusApiResultReply exampleTestStatusApiResultReply = new TestStatusApiResultReply();
        // set TestStatusApiResultIReply to TestStatusApiResultReply
        exampleTestStatusApiResultIReply.setActualInstance(exampleTestStatusApiResultReply);
        // to get back the TestStatusApiResultReply set earlier
        TestStatusApiResultReply testTestStatusApiResultReply = (TestStatusApiResultReply) exampleTestStatusApiResultIReply.getActualInstance();
    }
}
```


