package KtraCK;

public class Thuoc implements IThuoc {
    protected int ma;
    protected String tenThuoc;
    protected double donGiaCB;

    public Thuoc(){
    }
    public Thuoc(int ma, String tenThuoc, double donGiaCB){
        this.ma = ma;
        this.tenThuoc = tenThuoc;
        this.donGiaCB = donGiaCB; 
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public double getDonGiaCB() {
        return donGiaCB;
    }

    public void setDonGiaCB(double donGiaCB) {
        this.donGiaCB = donGiaCB;
    }

    @Override
    public double donGiaThuoc() {
        return donGiaCB;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "ma='" + ma + '\'' +
                ", tenThuoc=" + tenThuoc +'\'' +
                ", donGiaCB=" + donGiaCB +'\'' +
                '}';
    }
}

