package Question03;

public class Cat extends Mammal {
    private String greets;
    public Cat(){
    }

    public Cat(String name, String greets){
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
        return "Cat{" +  "greets =" + greets + '}';
    }
}
