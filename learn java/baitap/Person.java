package baitap;
public class Person {
    private String name;
    private String address;
    private String birthday;

    public Person() {
    }

    public Person(String name, String address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", birthday=" + birthday + '}';
    }
}
