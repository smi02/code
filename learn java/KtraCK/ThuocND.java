package KtraCK;

public class ThuocND extends Thuoc {
    private double giaBaoQuan;
    private double giaVanChuyen;

    public ThuocND(){
    }

    public ThuocND(int ma, String tenThuoc, double donGiaCB, double giaBaoQuan, double giaVanChuyen){
        super(ma, tenThuoc, donGiaCB);
        this.giaBaoQuan = giaBaoQuan;
        this.giaVanChuyen = giaVanChuyen;
    }

    public double getGiaBaoQuan() {
        return giaBaoQuan;
    }

    public void setGiaBaoQuan(double giaBaoQuan) {
        this.giaBaoQuan = giaBaoQuan;
    }

    public double getGiaVanChuyen() {
        return giaVanChuyen;
    }

    public void setGiaVanChuyen(double giaVanChuyen) {
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public double donGiaThuoc() {
        System.out.print("Đơn giá của thuốc nội địa là: ");
        return donGiaCB + giaBaoQuan + giaVanChuyen;
    }

    @Override
    public String toString() {
        return "ThuocND{" +super.toString()+
                "giaBaoQuan='" + giaBaoQuan + '\'' +
                "giaVanChuyen='" + giaVanChuyen + '\'' +
                '}';
    }
}
