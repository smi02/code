package baitap;
public class ShoppingCartDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        MycartList cartList = new MycartList();
        int choice;
        int position;
        while (true) {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                    cartList.createCart();
                    break;
                case 2:
                    cartList.displayCart();
                    break;
                case 3:

                    System.out.println("Enter position to remove: ");
                    position = Menu.in.nextInt();
                    cartList.removeProduct(position);
                    break;
                case 4:
                    System.out.println("Enter position to update: ");
                    position = Menu.in.nextInt();
                    Menu.in.nextLine();
                    System.out.println("Enter value to update: ");
                    String newValue = Menu.in.nextLine();
                    cartList.updateProduct(position, newValue);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }

    }
}
 