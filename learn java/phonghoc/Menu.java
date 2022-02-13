package phonghoc;

import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int menu(){
        int useChoice;
        System.out.println("Press 1: Tao Phong");
        System.out.println("Press 2: in phòng ");
        System.out.println("Press 3: Tim kiem Phong theo ma");
        System.out.println("Press 4: In danh sach phong hoc dat chuan");
        System.out.println("Press 5: In danh sach phong thuc hanh co so may tren 40");
        System.out.println("Press 6 : Exit");
        System.out.println("Enter choice: ");
        useChoice = Validation.checkInputInt();
        return useChoice;
    }
}