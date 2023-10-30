package OOP;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainAccountABC {
    public static void main (String [] args){
        Account accA = new Account(0123, "Khanh");
        Account accB = new Account(3456, "Diem");
        System.out.println("SO tien nap vao tk");

         double a = ScannerInput.inputDouble();

            if (a > 0) {
                accA.napTienTK(a);
            } else {
                System.out.println("So tien ko hop le");
            }
        System.out.println("sO TIEN TRONG TK HIEN TAI LA "+ accA.toString() );

        System.out.println("Số tiền rút");
        accA.tienRut(ScannerInput.inputDouble());

        System.out.println(accA.toString() );
       System.out.println(accA.getTienTK());
       System.out.println("So tien dao han" + accA.daoHan());
        boolean check = true;
        do {

            System.out.println("Nhap so tien can chuyen:");
            double tienchuyen = ScannerInput.inputDouble();

            check = accA.chuyen(accB,tienchuyen);

            if (check != true) {
                System.out.println("So tien chuyen vuot qua so tien trong tai khoan");
            }
        } while (check == false);






    }
}
