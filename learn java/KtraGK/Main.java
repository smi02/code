package KtraGK;

public class Main {  

    public static void main(String[] args) {
        FruitList fruitList = new FruitList();
        int choice;
        while (true) {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                fruitList.themfruit();
                    break;
                case 2:
                fruitList.hienthi();
                    break;
                case 3:
                break;
                case 4:
                fruitList.tong();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }

    }
}
