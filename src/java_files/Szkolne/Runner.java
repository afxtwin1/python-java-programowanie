package java_files.Szkolne;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        System.out.println("podaj rownanie");
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String[] equ = line.split(" ");
//        double val1 = Double.parseDouble(equ[0]);
//        String op = equ[1];
//        double val2 = Double.parseDouble(equ[2]);
//
//        sc.close();
//
//        if (op.equals("+")) {
//            System.out.println(val1 += val2);
//        }else if (op.equals("-")) {
//            System.out.println(val1 -= val2);
//        }else if (op.equals("*")) {
//            System.out.println(val1 *= val2);
//        }else if (op.equals("/")) {
//            System.out.println(val1 /= val2);
//        }

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        String[] equ = null;
        while (b) {
            System.out.println("Podaj równanie (np. 5 + 5) lub 'q' lub 'quit' aby zakończyć:");
            String line = sc.nextLine();

            // Sprawdzenie, czy użytkownik chce zakończyć program
            if (line.equals("q") || line.equals("quit")) {
                b = false; // Zakończenie pętli
                break;
            }

            // Rozdzielamy dane po spacjach (liczba operator liczba)
            equ = line.split(" ");


        }

        double val1 = Double.parseDouble(equ[0]);
        String op = equ[1];
        double val2 = Double.parseDouble(equ[2]);


        if (op.equals("+")) {
            System.out.println(val1 + val2);
        } else if (op.equals("-")) {
            System.out.println(val1 - val2);
        } else if (op.equals("*")) {
            System.out.println(val1 * val2);
        } else if (op.equals("/")) {

            System.out.println(val1 / val2);
        }

    }

        }






