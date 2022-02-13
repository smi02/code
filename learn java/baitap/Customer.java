package baitap;
public class Customer {
    private int ID;
    private String name;
    private char gender;
    private double discount;

    public Customer(){
    }

    public Customer(int ID, String name, char gender, double discount){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }
    public int getId() {
        return ID;
    }
 
    public String getName() {
        return name;
    }
 
    public String getGender() {
        if (gender == 'M') {
            return "Male";
        } if (gender == 'F') {
            return "Female";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + getGender() +
                "discuont='" + discount + '\'' +
                '}';
    }
}
