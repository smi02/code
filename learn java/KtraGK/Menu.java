package KtraGK;

import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int menu(){
        int useChoice;
        System.out.println("Press 1: thêm Fruit");
        System.out.println("Press 2: in ra danh sách Fruit ");
        System.out.println("Press 3: in ra danh sách FruitIn và FruitOut có giá bán lớn hơn 20");
        System.out.println("Press 4: Tính tổng số Fruit có trong danh sách");
        System.out.println("Press 5: Exit");
        System.out.println("Enter choice: ");
        useChoice = Validation.checkInputInt();
        return useChoice;
    }
}
