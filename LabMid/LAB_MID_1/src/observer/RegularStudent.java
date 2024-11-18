package observer;

public class RegularStudent implements Student {
    private final String name;

    public RegularStudent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
