public class Teacher extends Person{
    private String subject;
    private double salary;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void displayDetails(){
        System.out.println("Teacher[ID="+getId()+",Name="+getName()+",Age="+getAge()+",Subject="+subject+",Salary="+salary+"]");
    }
}
