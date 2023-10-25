package Training;
import java.util.Scanner;
public class BaitapJavaCoBan {
    public static void main(String[] args) throws InterruptedException {
    int n ;
    System.out.println("Nhập số nguyên");

    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
        System.out.println("Nhập Số n = " + "  " + n );

        if (n >= 0){
            System.out.println(" Đây là số nguyên");

        }
        else {
            System.out.println( "Đây là số nguyên âm ");
        }
    }
}