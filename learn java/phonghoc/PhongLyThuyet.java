package phonghoc;

public class PhongLyThuyet extends PhongHoc{
    private boolean MayChieu;

    public PhongLyThuyet(){
    }

    public PhongLyThuyet(Boolean mayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.MayChieu = mayChieu;
    }

    @Override
    public String DanhGia() {
        String tinhTrang="Phong Ly Thuyet Khong Dat Chuan";
        double duAnhSang= DienTich/SoBongDen;
        if ((duAnhSang<=10)&&MayChieu==true) {
        tinhTrang="Phong Ly Thuyet Dat Chuan";
        }
        return tinhTrang;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet{" +super.toString()+
                "MayChieu=" + MayChieu +
                '}';
    }
}
