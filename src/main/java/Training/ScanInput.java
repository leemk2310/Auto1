package Training;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInput {
    public static int inputInt() {

            Scanner sc = new Scanner(System.in);
            return sc.nextInt();


    }

//    public static String inputString() {
//        try {
//            Scanner sc = new Scanner(System.in);
//            return sc.nextLine();
//        } catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}