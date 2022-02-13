package Question03;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("mèo"," meow");
        System.out.println("name: " + cat.getName());
        System.out.println(""+cat);

        Animal dog = new Dog("chó"," woof");
        System.out.println("name: " + dog.getName());
        System.out.println(""+dog);

    }
}
