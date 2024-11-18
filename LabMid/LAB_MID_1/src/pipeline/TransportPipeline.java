package pipeline;

import java.util.ArrayList;
import java.util.List;

public class TransportPipeline {
    private final List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(TransportServiceContext context) {
        for (Filter filter : filters) {
            filter.apply(context);
        }
    }
}
