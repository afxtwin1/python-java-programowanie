package java_files;

public class Runner {
    public static void main(String[] args) {

//            double value1 = Double.parseDouble(args[0]);
//            double value2 = Double.parseDouble(args[2]);
//            String op = args[1];
//
            Lab3Calc calc = new Lab3Calc();
//
//
//            double result = 0;
//            if (op.equals("+")) {
//                result = calc.add(value1, value2);
//            } else if(op.equals("-")) {
//                result = calc.subtract(value1, value2);
//
//            } else if(op.equals("x")) {
//                result = calc.multiply(value1, value2);
//            } else if(op.equals("/")) {
//                result = calc.divide(value1, value2);
//            }


            System.out.println(calc.IsPrime(13));
        System.out.println(calc.CzyPrzestepny(2004));
        }
    }

