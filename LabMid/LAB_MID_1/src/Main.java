import observer.RegularStudent;
import observer.UniversityTransport;
import pipeline.*;

public class Main {
    public static void main(String[] args) {
        // Observer Pattern: Notify students
        UniversityTransport transportService = new UniversityTransport();
        transportService.addStudent(new RegularStudent("Ali"));
        transportService.addStudent(new RegularStudent("Sara"));

        transportService.notifyStudents("The transport will depart at 8:00 AM.");

        // Pipeline Filter Pattern: Validate transport service
        TransportServiceContext context = new TransportServiceContext(true, false); // Within time but no payment
        TransportPipeline pipeline = new TransportPipeline();
        pipeline.addFilter(new TimeRestrictionFilter());
        pipeline.addFilter(new AdvancePaymentFilter());

        System.out.println("Validation Process:");
        pipeline.execute(context);
    }
}
