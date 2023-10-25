package Training;

import java.util.Scanner;

public class BaiTap7 {
    public static  void main (String [] args ){
        int n;

        System.out.println("Nhap so n =");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i <= 20; i++)

        System.out.println(n+"x" +i+ "=" + n*i  );

    }
}
