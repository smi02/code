package KtraCK;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int menu(){
        int useChoice;
        System.out.println("Nhấn 1: thêm thuốc");
        System.out.println("Nhấn 2: in ra danh sách thuốc ");
        System.out.println("Nhấn 3: in ra danh sách ThuocNK có giá bán >= 100");
        System.out.println("Nhấn 4: Nhập mã thuốc");
        System.out.println("Nhấn 5: Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        useChoice = Validation.checkInputInt();
        return useChoice;
    }
}
