package baitap;
public class Student extends Person {

    private String studentId;
    private String majorField;
    private String degreeSought;

    public Student() {
    }

    public Student(String name, String address, String birthday, String studentId, String majorField, String degreeSought) {
        super(name, address, birthday);//public Person(String name, String address, String birthday)
        this.studentId = studentId;
        this.majorField = majorField;
        this.degreeSought = degreeSought;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "studentId=" + studentId + ", majorField=" + majorField + ", degreeSought=" + degreeSought + '}';
    }

}