package Training;


import java.util.Scanner;

public class Baitap_2 {
    public static void main(String[] args) {

        int n = ScanInput.inputInt();
        System.out.println("Nhập Số n = " + "  " + n);
        switch (n){
            case 0: System.out.println("Số Không");
                break ;
            case 1: System.out.println("Số một");
                break ;
            case 2: System.out.println("Số Hai");
                break ;
            case 3: System.out.println("Số Ba");
                break ;
            case 4: System.out.println(" Số Bốn");
                break ;
            case 5: System.out.println(" Số Năm");
                break ;
            case 6: System.out.println("Số Sáu");
                break ;
            case 7: System.out.println("Số Bảy");
                break ;
            case 8: System.out.println("Số Tám");
                break ;
            case 9: System.out.println("Số Chín");
                break ;
            default : System.out.println("Chi nhap tu 0-9");

        }
    }
}
