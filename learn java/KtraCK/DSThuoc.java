package KtraCK;

import java.util.ArrayList;

public class DSThuoc {
    private ArrayList<Thuoc> Thuocs = new ArrayList<>();
    public Thuoclist() {
        Thuoc Thuoc1 = new ThuocND(1, "para", 20, 10, 10);
        Thuocs.add(Thuoc1);
        Thuoc Thuoc2 = new ThuocND(2, "eso", 10, 5, 5);
        Thuocs.add(Thuoc2);
        Thuoc Thuoc3 = new ThuocNK(3, "aya", 40, 3, 3);
        Thuocs.add(Thuoc3);
        Thuoc Thuoc4 = new ThuocNK(3, "eye", 10, 2, 7);
        Thuocs.add(Thuoc4);
    }

    public void themThuoc(){
        char nhapNua = 'N';
        do{
            System.out.println("Nhấn I: tạo ThuocND");
            System.out.println("Nhấn O: tạo ThuocNK");
            System.out.println("Nhấn E: thoát nhập");
            System.out.println("Nhập sự lựa chọn của bạn I/O/E: ");
            char opt = Validation.in.nextLine().charAt(0);
            Thuoc NhapThuoc = new Thuoc();
            switch (opt){
                case 'I':
                    System.out.println("Nhập mã thuốc: ");
                    int mand = Validation.checkInputInt();
                    System.out.println("Nhập tên thuốc: ");
                    String tnd = Validation.checkInputString();
                    System.out.println("Nhập đơn giá: ");
                    double dgnd = Validation.checkInputDouble();
                    System.out.println("Nhập giá bảo quản: ");
                    double gbq = Validation.checkInputDouble();
                    System.out.println("Nhập giá vận chuyển: ");
                    double gvc = Validation.checkInputDouble();
                    NhapThuoc = new ThuocND(mand, tennd, dgnd, gbq, gvc);
                    break;
                case 'O':
                    System.out.println("Nhập số mã thuốc: ");
                    int mank = Validation.checkInputInt();
                    System.out.println("Nhập tên thuốc: ");
                    String tnk = Validation.checkInputString();
                    System.out.println("Nhập đơn giá: ");
                    double dgnk = Validation.checkInputDouble();
                    System.out.println("Nhập phí nhập khẩu: ");
                    String pnk = Validation.checkInputString();
                    System.out.println("Nhập số lần nhập khẩu: ");
                    double slnk =Validation.checkInputInt();
                    NhapThuoc = new ThuocNK(mank, tnk, dgnk, pnk, slnk);
                    break;
                case 'E':
                    return;
                default:
                    System.out.println("Không hợp lệ");
            }
            Thuocs.add(NhapThuoc);
            System.out.println("Muốn nhập nữa hay không Y/N: ");
            nhapNua = Validation.in.nextLine().charAt(0);
        }while (nhapNua == 'Y');
    }

    public void hienthi(){
        for(Thuoc mine : Thuocs){
            System.out.println(""+mine.toString());
            System.out.println(""+mine.donGiaThuoc());
            System.out.println("");
        }
    }
}
