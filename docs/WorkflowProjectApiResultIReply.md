

# WorkflowProjectApiResultIReply

## oneOf schemas
* [WorkflowProjectApiResultCountReply](WorkflowProjectApiResultCountReply.md)
* [WorkflowProjectApiResultGroupedReply](WorkflowProjectApiResultGroupedReply.md)
* [WorkflowProjectApiResultReply](WorkflowProjectApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.WorkflowProjectApiResultIReply;
import ru.testit.client.model.WorkflowProjectApiResultCountReply;
import ru.testit.client.model.WorkflowProjectApiResultGroupedReply;
import ru.testit.client.model.WorkflowProjectApiResultReply;

public class Example {
    public static void main(String[] args) {
        WorkflowProjectApiResultIReply exampleWorkflowProjectApiResultIReply = new WorkflowProjectApiResultIReply();

        // create a new WorkflowProjectApiResultCountReply
        WorkflowProjectApiResultCountReply exampleWorkflowProjectApiResultCountReply = new WorkflowProjectApiResultCountReply();
        // set WorkflowProjectApiResultIReply to WorkflowProjectApiResultCountReply
        exampleWorkflowProjectApiResultIReply.setActualInstance(exampleWorkflowProjectApiResultCountReply);
        // to get back the WorkflowProjectApiResultCountReply set earlier
        WorkflowProjectApiResultCountReply testWorkflowProjectApiResultCountReply = (WorkflowProjectApiResultCountReply) exampleWorkflowProjectApiResultIReply.getActualInstance();

        // create a new WorkflowProjectApiResultGroupedReply
        WorkflowProjectApiResultGroupedReply exampleWorkflowProjectApiResultGroupedReply = new WorkflowProjectApiResultGroupedReply();
        // set WorkflowProjectApiResultIReply to WorkflowProjectApiResultGroupedReply
        exampleWorkflowProjectApiResultIReply.setActualInstance(exampleWorkflowProjectApiResultGroupedReply);
        // to get back the WorkflowProjectApiResultGroupedReply set earlier
        WorkflowProjectApiResultGroupedReply testWorkflowProjectApiResultGroupedReply = (WorkflowProjectApiResultGroupedReply) exampleWorkflowProjectApiResultIReply.getActualInstance();

        // create a new WorkflowProjectApiResultReply
        WorkflowProjectApiResultReply exampleWorkflowProjectApiResultReply = new WorkflowProjectApiResultReply();
        // set WorkflowProjectApiResultIReply to WorkflowProjectApiResultReply
        exampleWorkflowProjectApiResultIReply.setActualInstance(exampleWorkflowProjectApiResultReply);
        // to get back the WorkflowProjectApiResultReply set earlier
        WorkflowProjectApiResultReply testWorkflowProjectApiResultReply = (WorkflowProjectApiResultReply) exampleWorkflowProjectApiResultIReply.getActualInstance();
    }
}
```


