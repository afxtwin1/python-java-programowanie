package java_files.PozaSzkolne;


import java.util.*;

public class PowtorkaJavy {
    public static void main(String[] args) {

//    int liczba = 3;
//
//    switch (liczba) {
//        case 1:
//            System.out.println("Liczba 1");
//            break;
//        case 2:
//            System.out.println("Liczba 2");
//            break;
//        case 3:
//            System.out.println("Liczba 3");
//            break;
//            default:
//                System.out.println("elo");



//        int liczba = 100;
//        while (liczba > 0) {
//            if (liczba % 7 == 0) {
//                System.out.println(
//                        liczba+" jest podzielna przez 7!");
//                break;
//
//            }
//            System.out.println(
//                    liczba+" nie jest podzielna przez 7");
//            liczba--;
//
//        }
//        for (int i = 100; i > 0; i--) {
//            if (i % 7 != 0) {
//                continue;
//            }
//            System.out.println(i+" podzielna przez 7");
//        }

        System.out.println("inicjalizacja tabeli");
        int[] tabela;
        tabela = new int[10];
        System.out.println(Arrays.toString(tabela));
        System.out.println("przypisanie wartosci na pierwszym miejscu tabeli");
        tabela[0] = 1;
        System.out.println(Arrays.toString(tabela));


        int[] mojeLiczby; // deklaracja tablicy jednowymiarowej
        mojeLiczby = new int[6]; // utworzenie tablicy o rozm. 6
        mojeLiczby = new int[4]; // nadpisanie - rozmiar 4
//wypelniamy tablice liczbami
        for (int i=0; i<mojeLiczby.length; i++) {
            mojeLiczby[i] = (i+10)*(i+10);
        }
//wypisujemy liczby z tablicy
        for (int i=0; i<mojeLiczby.length; i++) {
            int kolejnaLiczba = mojeLiczby[i];
            System.out.println("Kolejna liczba "+ i +": " +
                    kolejnaLiczba);
        }
        System.out.println("\n");
        //wypisywanie imienia i nazwiska i wieku wpisanego z klawiatury

        System.out.println("podaj imie: ");
        Scanner sc = new Scanner(System.in);
        String imie = sc.nextLine();
        System.out.println("podaj nazwisko: ");
        String nazwisko = sc.nextLine();
        System.out.println("podaj wiek: ");
        int wiek = sc.nextInt();
        sc.close();
        System.out.println("Witaj! "+imie+" "+nazwisko+" Masz "+wiek+" Lat!");

        System.out.println("\n");


    }
}
