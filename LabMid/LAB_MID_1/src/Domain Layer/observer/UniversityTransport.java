package observer;

import java.util.ArrayList;
import java.util.List;

public class UniversityTransport {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void notifyStudents(String message) {
        for (Student student : students) {
            student.update(message);
        }
    }
}
