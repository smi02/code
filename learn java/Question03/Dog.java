package Question03;

public class Dog extends Mammal {
    private String greets;
    public Dog(){
    }

    public Dog(String name, String greets){
        super(name);
        this.greets = greets;
    }

    public String getGreets() {
        return greets;
    }

    public void setGreets(String greets) {
        this.greets = greets;
    }


    @Override
    public String toString() {
        return "Dog{" +  "greets =" + greets + '}';
    }
}
