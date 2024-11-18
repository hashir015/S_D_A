package pipeline;

public class TimeRestrictionFilter implements Filter {
    @Override
    public void apply(TransportServiceContext context) {
        if (context.isWithinTimeLimit()) {
            System.out.println("Time restriction passed: Student is within allowed time.");
        } else {
            System.out.println("Time restriction failed: Student is not within allowed time.");
        }
    }
}
