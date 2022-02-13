package KtraCK;

public class ThuocNK extends Thuoc {
    private double phiNhapKhau;
    private int soLanNhapKhau;
    
    public ThuocNK(){
    }

    public ThuocNK(int ma, String tenThuoc, double donGiaCB, double phiNhapKhau, int soLanNhapKhau){
        super(ma, tenThuoc, donGiaCB);
        this.phiNhapKhau = phiNhapKhau;
        this.soLanNhapKhau = soLanNhapKhau;
    }

    public double getPhiNhapKhau() {
        return phiNhapKhau;
    }

    public void setPhiNhapKhau(double phiNhapKhau) {
        this.phiNhapKhau = phiNhapKhau;
    }

    public int getSoLanNhapKhau() {
        return soLanNhapKhau;
    }

    public void setSoLanNhapKhau(int soLanNhapKhau) {
        this.soLanNhapKhau = soLanNhapKhau;
    }

    int phuPhi;
    if(soLanNhapKhau < 5){
        return phuPhi = 10;
    }else{
        return phuPhi = 50;
    }
    @Override
    public double donGiaThuoc() {
        System.out.print("Đơn giá của thuốc nhập khẩu là: ");
        return (phiNhapKhau*soLanNhapKhau) + donGiaCB + phuPhi;
    }

    @Override
    public String toString() {
        return "ThuocNK{" +super.toString()+
                "phiNhapKhau='" + phiNhapKhau + '\'' +
                "soLanNhapKhau='" + soLanNhapKhau + '\'' +
                '}';
    }
}
