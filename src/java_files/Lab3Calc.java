package java_files;

@SuppressWarnings("ALL")
public class Lab3Calc {

    public  double add(double a, double b) {
        double c = a + b;
        return c;
    }

    public  double subtract(double a, double b) {
        double c = a - b;
        return c;
    }

    public  double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    public  double divide(double a, double b) {
        double c = a / b;
        return c;
    }
    public boolean IsPrime(double a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0 || a == 0 || a == 1) {
                return false;
            }
        }
        return true;
        }
    public boolean CzyPrzestepny(int year) {
//        if (year % 400 == 0) {
//            return true;
//        } else if (year % 100 == 0) {
//            return false;
//        } else if (year % 4 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);//mega uproszczenie
    }



}





