package t3h_12.model;

public class Student {
    private int mssv;
    private String hoTen;
    private String ngaySinh;
    private String maLop;
    private String gioHoc;
    private String msGV;

    public Student() {
    }

    public Student(int mssv, String hoTen, String ngaySinh, String maLop, String gioHoc, String msGV) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maLop = maLop;
        this.gioHoc = gioHoc;
        this.msGV = msGV;
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

    public String getMsGV() {
        return msGV;
    }

    public void setMsGV(String msGV) {
        this.msGV = msGV;
    }

    @Override
    public String toString() {
        return "[Student] mssv: " + mssv +
                " hoTen: " + hoTen +
                " ngaySinh: " + ngaySinh +
                " maLop: " + maLop +
                " gioHoc: " + gioHoc +
                " msGV: " + msGV;
    }
}
