package Training;
import java.util.Scanner;
public class BaiTap_4 {
    public  static void main (String [] args ){
        float n1, n2, n3;
        System.out.println("Nhap canh tam giac n1=");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        System.out.println( "Nhap canh tam giac n2=");
        n2 = sc.nextFloat();
        System.out.println( "Nhap canh tam giac n3=");
        n3 = sc.nextFloat();
        if (n1+n2>n3 && n1+n3>n2 && n3+n2>n1){
            if (n1 * n1 == n2 * n2 + n3 * n3 ||n2 * n2 == n1 * n1 + n3 * n3 ||n3 * n3 == n1 * n1 + n2 * n2   ){
                System.out.println("Tam giac vuong");

            }else {
                System.out.println("khong phai tam giac Vuong");
                }

        }else {
            System.out.println("khong phai tam giac" );
        }

    }
}
