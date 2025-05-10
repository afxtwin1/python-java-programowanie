package java_files.Szkolne;

@SuppressWarnings("ALL")
public class Lab3Calc {

    public double add(double a, double b) {
        double c = a + b;
        return c;
    }

    public double subtract(double a, double b) {
        double c = a - b;
        return c;
    }

    public double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    public double divide(double a, double b) {
        double c = a / b;
        return c;
    }

    public boolean IsPrime(double a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0 || a == 0 || a == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean CzyPrzestepny(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);//mega uproszczenie
    }

    public boolean CzyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    public void LiczbyPierwsze(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public void KalkulatorKredytowy(double kwota, int miesiecy, double procent) {
        double kapitalowa = kwota / miesiecy;
        double pozostalyKapital = kwota;
        double miesieczneOprocentowanie = procent / 12 / 100;

        // Wypisanie nagłówka
        System.out.println("Rata | Kapitałowa | Odsetkowa | Wysokość raty | Pozostało do spłaty");

        // Pętla po wszystkich ratach
        for (int i = 1; i <= miesiecy; i++) {
            double odsetkowa = pozostalyKapital * miesieczneOprocentowanie;
            double rata = kapitalowa + odsetkowa;
            pozostalyKapital -= kapitalowa;

            // Wypisanie danych o racie
            System.out.println(i + ". " + kapitalowa + " " + odsetkowa + " " + rata + " " + pozostalyKapital);
        }
    }
    public void KalkulatorKredytowyStale(double kwota, int miesiecy, double procent) {
        double miesieczneOprocentowanie = procent / 12 / 100;

        // Obliczenie wysokości stałej raty
        double rataStala = (kwota * miesieczneOprocentowanie) / (1 - Math.pow(1 + miesieczneOprocentowanie, -miesiecy));

        double pozostalyKapital = kwota;

        System.out.println("Rata | Wysokość raty | Pozostało do spłaty");

        for (int i = 1; i <= miesiecy; i++) {
            double odsetkowa = pozostalyKapital * miesieczneOprocentowanie;
            double kapitalowa = rataStala - odsetkowa;
            pozostalyKapital -= kapitalowa;

            System.out.println(i + ". " + rataStala + " " + pozostalyKapital);
        }
    }

}
