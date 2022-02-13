package phonghoc;

public class Main {
    public static void main(String[] args) {
        DanhSachPhongHoc dsPhongHoc = new DanhSachPhongHoc();
        int choice;
        while (true) {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                    dsPhongHoc.themPhong();
                    break;
                case 2:
                    dsPhongHoc.hienthi();
                    break;
                case 3:
                    System.out.println("Nhap ma de tim: ");
                    String maTam = Validation.checkInputString();
                    PhongHoc phongHoc = dsPhongHoc.hienThiTheoMa(maTam);
                    if (phongHoc instanceof PhongLyThuyet) {
                        phongHoc = (PhongLyThuyet) phongHoc;
                        System.out.println("" + phongHoc);
                    } else if (phongHoc instanceof PhongThucHanh) {
                        phongHoc = (PhongThucHanh) phongHoc;
                        System.out.println("" + phongHoc);
                    }
                    if (phongHoc == null) {
                        System.out.println("Khong co phong hoc voi ma" + maTam);
                    }
                case 4:
                    dsPhongHoc.hienThiDatChuan();
                    break;
                case 5:
                   
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }

    }
}
