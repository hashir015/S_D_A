package pipeline;

public class TransportServiceContext {
    private final boolean withinTimeLimit;
    private final boolean advancePaymentDone;

    public TransportServiceContext(boolean withinTimeLimit, boolean advancePaymentDone) {
        this.withinTimeLimit = withinTimeLimit;
        this.advancePaymentDone = advancePaymentDone;
    }

    public boolean isWithinTimeLimit() {
        return withinTimeLimit;
    }

    public boolean isAdvancePaymentDone() {
        return advancePaymentDone;
    }
}
