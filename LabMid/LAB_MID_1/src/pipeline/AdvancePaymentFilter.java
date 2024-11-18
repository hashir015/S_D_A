package pipeline;

public class AdvancePaymentFilter implements Filter {
    @Override
    public void apply(TransportServiceContext context) {
        if (context.isAdvancePaymentDone()) {
            System.out.println("Payment validation passed: Advance payment is completed.");
        } else {
            System.out.println("Payment validation failed: Advance payment is not completed.");
        }
    }
}
