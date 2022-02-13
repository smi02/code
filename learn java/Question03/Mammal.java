package Question03;

public class Mammal extends Animal {
    protected String name;
    public Mammal(){
    }

    public Mammal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mammal{" +  "name =" + name + '}';
    }
}
