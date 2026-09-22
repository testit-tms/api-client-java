

# WorkflowShortApiResultIReply

## oneOf schemas
* [WorkflowShortApiResultCountReply](WorkflowShortApiResultCountReply.md)
* [WorkflowShortApiResultGroupedReply](WorkflowShortApiResultGroupedReply.md)
* [WorkflowShortApiResultReply](WorkflowShortApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.WorkflowShortApiResultIReply;
import ru.testit.client.model.WorkflowShortApiResultCountReply;
import ru.testit.client.model.WorkflowShortApiResultGroupedReply;
import ru.testit.client.model.WorkflowShortApiResultReply;

public class Example {
    public static void main(String[] args) {
        WorkflowShortApiResultIReply exampleWorkflowShortApiResultIReply = new WorkflowShortApiResultIReply();

        // create a new WorkflowShortApiResultCountReply
        WorkflowShortApiResultCountReply exampleWorkflowShortApiResultCountReply = new WorkflowShortApiResultCountReply();
        // set WorkflowShortApiResultIReply to WorkflowShortApiResultCountReply
        exampleWorkflowShortApiResultIReply.setActualInstance(exampleWorkflowShortApiResultCountReply);
        // to get back the WorkflowShortApiResultCountReply set earlier
        WorkflowShortApiResultCountReply testWorkflowShortApiResultCountReply = (WorkflowShortApiResultCountReply) exampleWorkflowShortApiResultIReply.getActualInstance();

        // create a new WorkflowShortApiResultGroupedReply
        WorkflowShortApiResultGroupedReply exampleWorkflowShortApiResultGroupedReply = new WorkflowShortApiResultGroupedReply();
        // set WorkflowShortApiResultIReply to WorkflowShortApiResultGroupedReply
        exampleWorkflowShortApiResultIReply.setActualInstance(exampleWorkflowShortApiResultGroupedReply);
        // to get back the WorkflowShortApiResultGroupedReply set earlier
        WorkflowShortApiResultGroupedReply testWorkflowShortApiResultGroupedReply = (WorkflowShortApiResultGroupedReply) exampleWorkflowShortApiResultIReply.getActualInstance();

        // create a new WorkflowShortApiResultReply
        WorkflowShortApiResultReply exampleWorkflowShortApiResultReply = new WorkflowShortApiResultReply();
        // set WorkflowShortApiResultIReply to WorkflowShortApiResultReply
        exampleWorkflowShortApiResultIReply.setActualInstance(exampleWorkflowShortApiResultReply);
        // to get back the WorkflowShortApiResultReply set earlier
        WorkflowShortApiResultReply testWorkflowShortApiResultReply = (WorkflowShortApiResultReply) exampleWorkflowShortApiResultIReply.getActualInstance();
    }
}
```


