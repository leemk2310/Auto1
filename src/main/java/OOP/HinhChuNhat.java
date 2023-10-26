package OOP;

public class HinhChuNhat {
    public static void main(String[] arg) {
        BaiTap2 bt = new BaiTap2();
        System.out.println("Chieu dai =");
        bt.inputChieuDai(ScannerInput.inputInt());
        System.out.println("Chieu dai =" + bt.getChieuDai());
        System.out.println("Chieu rong =");
        bt.inputChieuRong(ScannerInput.inputInt());
        System.out.println("Chieu dai =" + bt.getChieuRong());
        System.out.println("Chu vi =" + bt.getChuvi());
        System.out.println("Dien tich =" + bt.getDienTich());
        System.out.println(bt.Ve());

    }
}
