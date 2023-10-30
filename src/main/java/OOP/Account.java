package OOP;

public class Account {
    private long stk;

    private String ttk;

    private double tienTK;

    final double LAI_SUAT = 0.035;


    public Account(long stk, String tentk, double tienTK) {
        this.stk = stk;
        this.ttk = ttk;
        this.tienTK = tienTK;
    }

    public Account(long stk, String ttk) {
        this.stk = stk;
        this.ttk = ttk;
        this.tienTK = 50;
    }

    public void setSTK(long stk) {
        this.setSTK(stk);
    }

    public long getSTK() {
        return getSTK();
    }

    public void setTenTK(String ttk) {
        this.setTenTK(ttk);
    }

    public String getTenTK() {
        return getTenTK();
    }

    public double getTienTK() {
        return tienTK;
    }
    //   @Override
//    public String toString() {
//        return "Account{" +
//                "stk=" + stk +
//                ", ttk='" + ttk + '\'' +
//                ", tienTK=" + tienTK +
//                ", LAI_SUAT=" + LAI_SUAT +
//                '}';
//    }


    @Override
    public String toString() {
        return this.stk + " _ " + this.ttk + ": " + this.tienTK;
    }

    public void napTienTK(double soTienNapTK) {
        this.tienTK += soTienNapTK;

    }

    public static double phiRut(double phi) {
        return phi * 0.05;
    }

    public boolean tienRut(double tienRut) {
        double tienTru = (tienRut + phiRut(tienRut));
        //  tiền trừ =số tiền rút +phí rút (phí = tienRut *0.05)
        if (tienTK >= tienTru) {
            tienTK -= tienTru;

        } else {
            System.out.println("khoong du tien trong tk");
        }
        return false;
    }

    public double daoHan() {
        tienTK += tienTK * LAI_SUAT;
        return tienTK;
    }
    public boolean chuyen (Account nhan, double tienChuyen){
        boolean check = this.tienRut(tienChuyen);
        if (check ){
            nhan.napTienTK(tienChuyen);
        }
    return check;
    }



}





