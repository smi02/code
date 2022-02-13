package baitap;
import java.util.ArrayList;

public class MycartList {
    private ArrayList<String> myCartList = new ArrayList<>();

    public MycartList() {
    }

    public void createCart() {
        myCartList.add("Apple");
        myCartList.add("Beer");
        myCartList.add("Noodle");
        myCartList.add("Fish");
        myCartList.add("Mango");
        myCartList.add("WaterMelon");
    }

    public void displayCart() {

        // fore tab
        for (String myProduct : myCartList) {
            System.out.println("" + myProduct);
        }
        System.out.println("=========================");
    }

    public void removeProduct(int position) {
        myCartList.remove(position);
        displayCart();
    }

    public void updateProduct(int position, String newValue) {
        myCartList.set(position, newValue);
        displayCart();
    }
}
