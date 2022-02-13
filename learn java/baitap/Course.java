package baitap;
public class Course {
    private String nameCourse;
    private double grade;

    public Course() {
    }

    public Course(String nameCourse, double grade) {
        this.nameCourse = nameCourse;
        this.grade = grade;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" + "nameCourse=" + nameCourse + ", grade=" + grade + '}';
    }
}
