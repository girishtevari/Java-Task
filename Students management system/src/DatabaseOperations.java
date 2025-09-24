public interface DatabaseOperations {
    void addStudent(Student s);
    void updateStudent(int id, Student s);
    void deleteStudent(int id);
    void viewStudents();
}
