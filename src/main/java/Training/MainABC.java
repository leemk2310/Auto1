package Training;

public class MainABC {
    public static void main(String[] args) {
        Account accA = new Account(12320, "Khanh");
        Account accB = new Account(4567, "Diem");
        System.out.println("Nhap so  tien nap");
// nap tien
        double tiennap = ScannerInput.inputLong();
        if (tiennap < 0) {
            System.out.println("so tien nap ko hop le");
        } else {
            accA.napTien(tiennap);
        }

        //rut tien
        System.out.println("Nhap so  tien rut");
        double rutTien = ScannerInput.inputLong();
        accA.rutTien(rutTien);
        System.out.println(("So tien can chuyen"));

        double chuyen = ScannerInput.inputDouble();
        boolean check = accA.chuyenTien(accB, chuyen);

        System.out.println(accA.toString() + "dao han acc A =" + accA.daoHan());
        System.out.println(accB.toString() + "dao han acc A =" + accB.daoHan());

    }
}
