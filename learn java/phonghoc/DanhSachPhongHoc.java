package phonghoc;

import java.util.ArrayList;

public class DanhSachPhongHoc {
    private ArrayList<PhongHoc> phongHoc = new ArrayList<>();
        public DanhSachPhongHoc() {
        PhongHoc phonglt1 = new PhongLyThuyet(true,"A","AA",100,5);
            phongHoc.add(phonglt1);
            PhongHoc phonglt2 = new PhongLyThuyet(true,"B","BB",100,5);
            phongHoc.add(phonglt2);
            PhongHoc phonglt3 = new PhongLyThuyet(true,"C","CC",60,3);
            phongHoc.add(phonglt3);
            PhongHoc phongth1 = new PhongThucHanh(50,"T","TT",200,20);
            phongHoc.add(phongth1);
            PhongHoc phongth2 = new PhongThucHanh(50,"VV","VV",90,20);
            phongHoc.add(phongth2);
            PhongHoc phongth3 = new PhongThucHanh(90,"XX","XX",70,50);
            phongHoc.add(phongth3);
        }
        public void themPhong(){
            char nhapNua = 'N';
            do{
                System.out.println("Press T: Tao phong thuc hanh");
                System.out.println("Press L: Tao phong ly thuyet");
                System.out.println("Press E: Thoat nhap");
                System.out.println("Enter your choice T/L/E: ");
                char opt = Validation.in.nextLine().charAt(0);
                PhongHoc phongHocTam = new PhongHoc();
                switch (opt){
                    case 'T':
                        System.out.println("Nhap so may tinh: ");
                        int smt = Validation.checkInputInt();
                        System.out.println("Nhap ma phong: ");
                        String smp = Validation.checkInputString();
                        System.out.println("Nhap day nha: ");
                        String sdn = Validation.checkInputString();
                        System.out.println("Nhap dien tich: ");
                        double sdt = Validation.checkInputDouble();
                        System.out.println("Nhap so bong den: ");
                        int sbd =Validation.checkInputInt();
                        phongHocTam = new PhongThucHanh(smt,smp,sdn,sdt,sbd);
                        break;
                    case 'L':
                        System.out.println("Co may chieu");
                        boolean mc =Validation.in.nextBoolean();
                        Validation.in.nextLine();
                        System.out.println("Nhap ma phong: ");
                        String smpt = Validation.checkInputString();
                        System.out.println("Nhap day nha: ");
                        String sdnt = Validation.checkInputString();
                        System.out.println("Nhap dien tich: ");
                        double sdtt = Validation.checkInputDouble();
                        System.out.println("Nhap so bong den: ");
                        int sbdt =Validation.checkInputInt();
                        phongHocTam=new PhongLyThuyet(mc,smpt,sdnt,sdtt,sbdt);
                        break;
                    case 'E':
                        return;
                    default:
                        System.out.println("Invalid");
                }
                phongHoc.add(phongHocTam);
                System.out.println("Muon nhap nua hay khong Y/N: ");
                nhapNua = Validation.in.nextLine().charAt(0);
            }while (nhapNua == 'Y');
        }
        public void hienthi(){
            for(PhongHoc mine : phongHoc){
                System.out.println(""+mine.toString());
                System.out.println(""+mine.DanhGia());
                System.out.println("");
            }
        }
        public PhongHoc hienThiTheoMa(String maPhong){
            for(PhongHoc ph : phongHoc){
                if(ph.getMaPhong().equals(maPhong)){
                    return ph;
                }
            }
            return null;
        }
        public void hienThiDatChuan(){
            for(PhongHoc ph : phongHoc){
                if(ph.DanhGia().equals("Dat chuan")){
                    System.out.println(""+ph.toString());
                }
            }
        }


    }