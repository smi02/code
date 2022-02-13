package KtraCK;

public class Main {
    public static void main(String[] args) {
        DSThuoc dsThuoc = new DSThuoc();
        int choice;
        while (true) {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                dsThuoc.themThuoc();
                    break;
                case 2:
                dsThuoc.hienthi();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không hợp lệ");
            }
        }
    }
}
