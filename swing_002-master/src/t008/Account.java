package t008;

public class Account {

    private long stk;

    private String ttk;

    private double sttk;
    private double sttk2;
    private double sttk3;

    private double hsls = 0.035;
    private double hsls1 = 0.0125;
    private double hsls2 = 0.125;

    public Account() {
    }

    public Account(long stk, String ttk, double sttk) {
        this.stk = stk;
        this.ttk = ttk;
        this.sttk = sttk;
    }

    public Account(long stk, String ttk) {
        this.stk = stk;
        this.ttk = ttk;
        this.sttk = 50;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTtk() {
        return ttk;
    }

    public void setTtk(String ttk) {
        this.ttk = ttk;
    }

    public double getSttk() {
        return sttk;
    }

    public void setSttk(double sttk) {
        this.sttk = sttk;
    }

    @Override
    public String toString() {
        return "[Account: stk = " + stk + ", ttk = " + ttk + "; sttk = " + sttk + "]";
    }

    public void napTienTaiKhoan(double soTienNap) {
        this.sttk += soTienNap;
    }

    public boolean rutTien(double soTienRut) {
        if (soTienRut <= 0) return false;
        double tongSoTienRutLai = 1.1 * soTienRut;
        if (this.sttk <= 0 || this.sttk < tongSoTienRutLai) return false;
        this.sttk -= tongSoTienRutLai;
        return true;
    }

    public boolean chuyenTien(Account khach, double soTienCanChuyen) {
        if(soTienCanChuyen <= 0) return false;
        if (this.sttk <= 0 || this.sttk < soTienCanChuyen) return false;
        this.sttk -= soTienCanChuyen;
        khach.sttk += soTienCanChuyen;
        return true;
    }
}
