package Training;

public class Account {
    private long  STK;
    private String TTK;
    private double tienTK;
    final double LaiSuat = 0.035;

    public  Account (long STK, String TTK, double tienTK){
        this.STK = STK;
        this.TTK = TTK;
        this.tienTK = tienTK;
    }
    public  Account (long STK, String TTK){
        this.STK =STK;
        this.TTK = TTK;
        this.tienTK = 50;
    }

    public void setTienTK(double tienTK) {
        this.tienTK = tienTK;
    }

    public void setSTK(long STK) {
        this.STK = STK;
    }

    public void setTTK(String TTK) {
        this.TTK = TTK;
    }

    public long getSTK() {
        return STK;
    }

    public String getTTK() {
        return TTK;
    }

    public double getTienTK() {
        return tienTK;
    }

    @Override
    public String toString() {
        return "Account{" +
                "STK=" + STK +
                ", TTK='" + TTK + '\'' +
                ", tienTK=" + tienTK +
                '}';
    }

    public  double napTien ( double tienNap){
        tienTK += tienNap;
        return tienNap;
    }
//    public  double phiRut (double phi)
//    {
//        double phiRut = phi * 0.05;
//        return phiRut;
//    }

    public  boolean rutTien (double tienRut){
       double tienTru = tienRut + (tienRut*0.05) ;
       if (tienTru <= tienTK){
           tienTK -= tienTru;
       } else {
           System.out.println("khong du tien trong tk");
        }
       return false;
    }
    public  double daoHan () {
        double daoHan = tienTK - (tienTK*LaiSuat);
        return daoHan;
    }
    public  boolean chuyenTien (Account nhan, double tienChuyen){
        boolean check = this.rutTien(tienChuyen);
        if (check ){
            nhan.napTien(tienChuyen);
        }else
            System.out.println("chuyeen tiern ko thanh cong");
        return check;
    }

}
