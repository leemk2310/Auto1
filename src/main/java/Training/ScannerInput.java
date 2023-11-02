package Training;

import java.util.Scanner;

public class ScannerInput {
    public static int inputInt() {

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Double inputDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public  static  Long inputLong(){
        Scanner sc = new Scanner(System.in);
        return  sc.nextLong();
    }
}