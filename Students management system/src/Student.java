public class Student extends Person {
    private String course;
    private double marks;

    public Student(int id, String name, int age,String course,double marks) {
        super(id, name, age);
        this.course=course;
        this.marks= marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public void displayDetails(){
        System.out.println("Student [ID=" +getId()+",Name="+ getName()+",Age="+getAge()+",Course="+course+",Marks="+marks+"]");
    }
    public String calculateResult(){
        return marks>=40?"Pass":"Fail";
    }
    public String calculateResult(double graceMarks){
        return(marks+graceMarks)>=40?"Pass(with grace)":"Fail";
    }
}
