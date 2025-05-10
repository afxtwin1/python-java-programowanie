package java_files.Szkolne;

import java.util.Scanner;

public class runer {
    public static void main(String[] args) {

        Lab3Calc calc = new Lab3Calc();

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

       calc.LiczbyPierwsze(start, end);
       sc.close();
    }
}
