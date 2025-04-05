package java_files;

import java.util.Scanner;

public class zad1 {

    private static int[] readAndPrintArray() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Podaj 5 liczb całkowitych:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Wprowadzone liczby:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }

        return numbers;
    }
    private static int sums(int[] Array){

        int sum = 0;
        for(int i=0; i<Array.length; i++){
            sum += Array[i];
        }
        return sum;
    }
    private static int dziel(int[] Array, int dzielnik){
        int count = 0;
        for(int i=0; i<Array.length; i++){
            for(int j=i+1; j<Array.length; j++){
                if((Array[i]+Array[j])%dzielnik == 0){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] array = readAndPrintArray();
        int suma = sums(array);
        int ilepar = dziel(array, 5);
        System.out.println("\nSuma: " + suma);
    }
}



