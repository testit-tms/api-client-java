

# IFilter

## oneOf schemas
* [CollectionFilter](CollectionFilter.md)
* [CompositeFilter](CompositeFilter.md)
* [Filter](Filter.md)

## Example
```java
// Import classes:
import ru.testit.client.model.IFilter;
import ru.testit.client.model.CollectionFilter;
import ru.testit.client.model.CompositeFilter;
import ru.testit.client.model.Filter;

public class Example {
    public static void main(String[] args) {
        IFilter exampleIFilter = new IFilter();

        // create a new CollectionFilter
        CollectionFilter exampleCollectionFilter = new CollectionFilter();
        // set IFilter to CollectionFilter
        exampleIFilter.setActualInstance(exampleCollectionFilter);
        // to get back the CollectionFilter set earlier
        CollectionFilter testCollectionFilter = (CollectionFilter) exampleIFilter.getActualInstance();

        // create a new CompositeFilter
        CompositeFilter exampleCompositeFilter = new CompositeFilter();
        // set IFilter to CompositeFilter
        exampleIFilter.setActualInstance(exampleCompositeFilter);
        // to get back the CompositeFilter set earlier
        CompositeFilter testCompositeFilter = (CompositeFilter) exampleIFilter.getActualInstance();

        // create a new Filter
        Filter exampleFilter = new Filter();
        // set IFilter to Filter
        exampleIFilter.setActualInstance(exampleFilter);
        // to get back the Filter set earlier
        Filter testFilter = (Filter) exampleIFilter.getActualInstance();
    }
}
```


