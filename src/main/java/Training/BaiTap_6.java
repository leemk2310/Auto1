package Training;

import java.util.Scanner;

public class BaiTap_6 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Nhap so n =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0)
                sum += i;
        System.out.println(sum);


    }

}

