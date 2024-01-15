package t012.model;

public class Student {
    private int mssv;
    private String hoTen;
    private String ngaySinh;
    private String maLop;
    private String gioHoc;
    private String MSGV;

    public Student() {
    }

    public Student(int mssv, String hoTen, String ngaySinh, String maLop, String gioHoc, String MSGV) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maLop = maLop;
        this.gioHoc = gioHoc;
        this.MSGV = MSGV;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getGioHoc() {
        return gioHoc;
    }

    public void setGioHoc(String gioHoc) {
        this.gioHoc = gioHoc;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }

    @Override
    public String toString() {
        return "[Student] mssv = " + mssv +
                " hoTen = " + hoTen +
                " ngaySinh = " + ngaySinh +
                " maLop = " + maLop +
                " gioHoc = " + gioHoc +
                " MSGV = " + MSGV;
    }
}
