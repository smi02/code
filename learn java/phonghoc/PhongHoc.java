package phonghoc;

public class PhongHoc implements IPhongHoc {
    protected String MaPhong;
    protected String DayNha;
    protected double DienTich;
    protected int SoBongDen;

    public  PhongHoc() {
    }

    public  PhongHoc(String MaPhong,String DayNha,double DienTich,int SoBongDen) {
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
        this.SoBongDen = SoBongDen;
    }
    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getDayNha() {
        return DayNha;
    }

    public void setDayNha(String dayNha) {
        DayNha = dayNha;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }

    public int getSoBongDen() {
        return SoBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        SoBongDen = soBongDen;
    }
    

    @Override
    public String DanhGia() {
        return "unknown";
    }

    @Override
    public String toString() {
        return "PhongHoc{" +
                "MaPhong='" + MaPhong + '\'' +
                ", DayNha=" + DayNha +'\'' +
                ", DienTich=" + DienTich +'\'' +
                ", SoBongDen=" + SoBongDen +'\'' +
                '}';
    }
}
