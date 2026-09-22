

# ProjectShortApiResultIReply

## oneOf schemas
* [ProjectShortApiResultCountReply](ProjectShortApiResultCountReply.md)
* [ProjectShortApiResultGroupedReply](ProjectShortApiResultGroupedReply.md)
* [ProjectShortApiResultReply](ProjectShortApiResultReply.md)

## Example
```java
// Import classes:
import ru.testit.client.model.ProjectShortApiResultIReply;
import ru.testit.client.model.ProjectShortApiResultCountReply;
import ru.testit.client.model.ProjectShortApiResultGroupedReply;
import ru.testit.client.model.ProjectShortApiResultReply;

public class Example {
    public static void main(String[] args) {
        ProjectShortApiResultIReply exampleProjectShortApiResultIReply = new ProjectShortApiResultIReply();

        // create a new ProjectShortApiResultCountReply
        ProjectShortApiResultCountReply exampleProjectShortApiResultCountReply = new ProjectShortApiResultCountReply();
        // set ProjectShortApiResultIReply to ProjectShortApiResultCountReply
        exampleProjectShortApiResultIReply.setActualInstance(exampleProjectShortApiResultCountReply);
        // to get back the ProjectShortApiResultCountReply set earlier
        ProjectShortApiResultCountReply testProjectShortApiResultCountReply = (ProjectShortApiResultCountReply) exampleProjectShortApiResultIReply.getActualInstance();

        // create a new ProjectShortApiResultGroupedReply
        ProjectShortApiResultGroupedReply exampleProjectShortApiResultGroupedReply = new ProjectShortApiResultGroupedReply();
        // set ProjectShortApiResultIReply to ProjectShortApiResultGroupedReply
        exampleProjectShortApiResultIReply.setActualInstance(exampleProjectShortApiResultGroupedReply);
        // to get back the ProjectShortApiResultGroupedReply set earlier
        ProjectShortApiResultGroupedReply testProjectShortApiResultGroupedReply = (ProjectShortApiResultGroupedReply) exampleProjectShortApiResultIReply.getActualInstance();

        // create a new ProjectShortApiResultReply
        ProjectShortApiResultReply exampleProjectShortApiResultReply = new ProjectShortApiResultReply();
        // set ProjectShortApiResultIReply to ProjectShortApiResultReply
        exampleProjectShortApiResultIReply.setActualInstance(exampleProjectShortApiResultReply);
        // to get back the ProjectShortApiResultReply set earlier
        ProjectShortApiResultReply testProjectShortApiResultReply = (ProjectShortApiResultReply) exampleProjectShortApiResultIReply.getActualInstance();
    }
}
```


