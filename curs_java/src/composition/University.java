package composition;


import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudents() {
        System.out.println("Students at " + name + ":");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}
