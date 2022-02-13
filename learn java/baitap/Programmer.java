package baitap;
public class Programmer extends Employee {

    private int bonus;

    public Programmer() {
    }

    public Programmer(int bonus) {
        this.bonus = bonus;
    }

    public Programmer(int bonus, float salary) {
        super(salary);
        this.bonus = bonus;
    }

    public float payment() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() + "bonus=" + bonus + '}';
    }

}