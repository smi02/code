package baitap;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Programmer programmer = new Programmer(500, 2000);
        System.out.println(""+programmer);
        System.out.println("Payment: "+programmer.payment());
            
    }
    
}