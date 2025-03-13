package java_files;

public class Lab3Calc {
    public static void main(String[] args) {

    double value1 = Double.parseDouble(args[0]);
    double value2 = Double.parseDouble(args[2]);
    String op = args[1];

    if (op.equals("+")) {
        System.out.println(value1 + value2);
    } else if(op.equals("-")) {
        System.out.println(value1 - value2);

    } else if(op.equals("*")) {
        System.out.println(value1 * value2);
    } else if(op.equals("/")) {
        System.out.println(value1 / value2);
    }

    }
}
