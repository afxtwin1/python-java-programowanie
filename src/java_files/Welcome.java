package java_files;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("jak masz na imie");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("witaj " + name);
    }
}
