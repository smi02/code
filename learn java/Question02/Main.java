package Question02;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square square = new Square(6, "red", true);
        System.out.println(""+square);
        System.out.println(""+square.getPerimeter());
        System.out.println(""+ square.getArea());
    }
    
}
