package phonghoc;

public class PhongThucHanh extends PhongHoc {
    private int SoMayTinh;

    public PhongThucHanh(){
    }

    public PhongThucHanh(int SoMayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.SoMayTinh = SoMayTinh;
    }
    public int getSoMayTinh() {
        return SoMayTinh;
    }
    public void setSoMayTinh(int SoMayTinh) {
        this.SoMayTinh = SoMayTinh;
    }


    @Override
    public String DanhGia() {
        String tinhTrang="Phong Thuc Hanh Khong Dat Chuan";
        double duAnhSang= DienTich/SoBongDen;
        if (duAnhSang>=1.5) {
        tinhTrang="Phong Thuc Hanh Dat Chuan";
        }
        return tinhTrang;
    }
    @Override
    public String toString() {
        return "PhongThucHanh{" +super.toString()+
                "SoMayTinh=" + SoMayTinh +
                '}';
    }
}
