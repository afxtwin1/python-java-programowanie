package java_files.Szkolne;

public class Lab2Casting {
    public static void main(String[] args)
    {
        char literki = 69; //literka "E"
        char literki2 = (char) (literki + 1); //literka "F"
        System.out.println(literki);
        System.out.println(literki2);

        float a = 10.1f;
        int b = (int)a;
        System.out.println(b);
    }
}
