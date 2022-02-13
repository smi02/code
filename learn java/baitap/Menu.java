package baitap;
import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int menu(){
        int choice;
        System.out.println("Press 1: Create");
        System.out.println("Press 2: Display");
        System.out.println("Press 3: Remove");
        System.out.println("Press 4: Update");
        System.out.println("Press 5: Exit");
        System.out.println("Enter your choice: ");
        choice = in.nextInt();
        return choice;
    }
 }
 