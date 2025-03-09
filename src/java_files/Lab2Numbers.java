package java_files;

public class Lab2Numbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        double result = Math.pow(a,b);
        System.out.println(result);

        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(2.25,0.5));
        System.out.println(Math.log(2.7182));
        System.out.println(Math.log(0.5));
        System.out.println(Math.log10(1000));

        int promien = 10;
        int wysokosc = 20;
        double objetosc = (Math.pow(promien, 2) * Math.PI) * wysokosc;
        System.out.println("objetosc walca wynosi: " + objetosc);

        System.out.println(Math.log(1024)/Math.log(2));
        System.out.println((int)(Math.random()*123)); //od 0 do 123
        System.out.println((int)(Math.random()*201)-100); //od -100 do 100
        float wykladnik = 1/3f;
        System.out.println(Math.pow(27,wykladnik));

    }

}
