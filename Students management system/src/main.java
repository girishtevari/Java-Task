public class main {
    public static void main(String[] args) {
        DatabaseOperations db = new StudentDatabase();


        Student s1 = new Student(101, "Girish", 26, "Java", 90);
        Student s2 = new Student(102, "Gagana", 25, "Python", 75);

        db.addStudent(s1);
        db.addStudent(s2);

        db.viewStudents();


        Student updatedBob = new Student(102, "Bob", 21, "Python", 85);
        db.updateStudent(102, updatedBob);

        db.viewStudents();


        db.deleteStudent(101);
        db.viewStudents();
    }

}
