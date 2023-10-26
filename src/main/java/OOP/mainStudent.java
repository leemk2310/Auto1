package OOP;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainStudent {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        //   System.out.println("Vui Long Nhap FullName la");
        //    sv.setFullName(ScannerInput.inputString());
        //  Pattern pattern = Pattern.compile("[0-9]*");
        // Matcher matcher = pattern.matcher(sv.getFullName());
        System.out.println("Vui long nhap full name");
        // vòng lặp khi nhập ko đúng giá trị
        while (true) {

            sv.setFullName(ScannerInput.inputString());
            Pattern pattern = Pattern.compile("^[0-9]+$");
            Matcher matcher = pattern.matcher(sv.getFullName());
            if (matcher.find()) {
                System.out.println("Khong dung dinh dang");

            } else {
                System.out.println("OK");break;
            }

        }

        System.out.println("Vui Long Nhap MSV =");
        sv.setMSV(ScannerInput.inputInt());

        System.out.println("Vui Long Nhap age =");
        sv.setAge(ScannerInput.inputInt());

        System.out.println("Vui Long Nhap score =");
        sv.setScore(ScannerInput.inputInt());

        System.out.println("Full name là " + sv.getFullName());
        System.out.println("Age = " + sv.getAge());
        System.out.println("MSV = " + sv.getMSV());
        System.out.println("Score =" + sv.getScore());
    }
}






