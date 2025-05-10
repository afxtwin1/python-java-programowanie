package java_files.Szkolne;

public class RokPrzestepny {
    public static void main(String[] args) {

        int year = 1900;

        if (year % 400 == 0) {
            System.out.println("Rok " + year + " JEST rokiem przestępnym");
            return;
        }
        else if (year %4 != 0) {
            System.out.println("Rok " + year + " NIE JEST rokiem przestępnym");
            return;
        }

        else if (year % 100 == 0) {
            System.out.println("Rok " + year + " NIE JEST rokiem przestępnym");
            return;
        }
        else {
            System.out.println("Rok " +year+" JEST rokiem przestępnym");
        }
        }


    }

