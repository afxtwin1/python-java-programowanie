package java_files;

public class Lab3 {
    public static void main(String[] args) {

//        System.out.println("start");
//        int licznik = 0;
//        while (licznik<100){
//            System.out.println(licznik);
//            licznik++;
//        }

//        int flag = 0;
//        do {
//            System.out.println(flag);
//        } while(++flag<10);
//        int i;
//        for (i=0; i<10; i++) {
//            System.out.println(i);
//        }
//        for (int i= 0; i<95; i++) {
//
//            if (i%10==0){
//                continue;}
//            System.out.println(i);
//
//        }

       int[] array1;
       array1 = new int[10];

       int[] array2 = {1,2,3,4};

        for (int i=9; i>=0 ; i--) {
            array1[i]= i+1;
            System.out.println(array1[i]);
        }



    }

}
