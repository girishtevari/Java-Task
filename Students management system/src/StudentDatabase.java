import java.util.ArrayList;
import java.util.List;
public class StudentDatabase implements DatabaseOperations{
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student s) {
        students.add(s);
        System.out.println(("Student added successfully"));
    }
    @Override
    public void updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, updatedStudent);
                System.out.println(" Student updated successfully");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted successfully");
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
        } else {
            for (Student s : students) {
                s.displayDetails();
            }
        }
    }}