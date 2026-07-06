

# ExternalIssueApiFieldSuggestionIReply

## oneOf schemas
* [ExternalIssueApiFieldSuggestionGroupedReply](ExternalIssueApiFieldSuggestionGroupedReply.md)
* [ExternalIssueApiFieldSuggestionReply](ExternalIssueApiFieldSuggestionReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.ExternalIssueApiFieldSuggestionIReply;
import ru.testit.client.model.ExternalIssueApiFieldSuggestionGroupedReply;
import ru.testit.client.model.ExternalIssueApiFieldSuggestionReply;

public class Example {
    public static void main(String[] args) {
        ExternalIssueApiFieldSuggestionIReply exampleExternalIssueApiFieldSuggestionIReply = new ExternalIssueApiFieldSuggestionIReply();

        // create a new ExternalIssueApiFieldSuggestionGroupedReply
        ExternalIssueApiFieldSuggestionGroupedReply exampleExternalIssueApiFieldSuggestionGroupedReply = new ExternalIssueApiFieldSuggestionGroupedReply();
        // set ExternalIssueApiFieldSuggestionIReply to ExternalIssueApiFieldSuggestionGroupedReply
        exampleExternalIssueApiFieldSuggestionIReply.setActualInstance(exampleExternalIssueApiFieldSuggestionGroupedReply);
        // to get back the ExternalIssueApiFieldSuggestionGroupedReply set earlier
        ExternalIssueApiFieldSuggestionGroupedReply testExternalIssueApiFieldSuggestionGroupedReply = (ExternalIssueApiFieldSuggestionGroupedReply) exampleExternalIssueApiFieldSuggestionIReply.getActualInstance();

        // create a new ExternalIssueApiFieldSuggestionReply
        ExternalIssueApiFieldSuggestionReply exampleExternalIssueApiFieldSuggestionReply = new ExternalIssueApiFieldSuggestionReply();
        // set ExternalIssueApiFieldSuggestionIReply to ExternalIssueApiFieldSuggestionReply
        exampleExternalIssueApiFieldSuggestionIReply.setActualInstance(exampleExternalIssueApiFieldSuggestionReply);
        // to get back the ExternalIssueApiFieldSuggestionReply set earlier
        ExternalIssueApiFieldSuggestionReply testExternalIssueApiFieldSuggestionReply = (ExternalIssueApiFieldSuggestionReply) exampleExternalIssueApiFieldSuggestionIReply.getActualInstance();
    }
}
```


