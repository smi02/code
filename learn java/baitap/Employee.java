package baitap;
public class Employee {
    protected float salary;

    public Employee() {
    }

    public Employee(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
    
}