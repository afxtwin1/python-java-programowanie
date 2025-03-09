package java_files;

public class Lab2AgeVerif {
    public static void main(String[] args) {

        int age =140;

        if (age>=18 && age <130) {
            System.out.println("jestes pelnoletni");
        }
        else if (age>0 && age<18) {
            System.out.println("nie jestes pelnoletni");
        }
        else if (age <=0 || age >= 130) {
            System.out.println("Bład! Taki wiek nie istnieje badz jest zbyt duzy");
        }
    }
}
