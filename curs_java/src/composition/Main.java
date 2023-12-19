package composition;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20);
        Student student2 = new Student("Jane Doe", 22);

        University university = new University("XYZ University");

        university.addStudent(student1);
        university.addStudent(student2);

        university.displayStudents();
    }
}