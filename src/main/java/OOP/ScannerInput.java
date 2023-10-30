package OOP;
import java.util.Scanner;
public class ScannerInput {
    public static  int  inputInt (){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static  String  inputString (){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static  double inputDouble(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }


}
