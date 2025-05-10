package java_files.ProjektSolo;


import java_files.ProjektSolo.service.Menadzer;

public class Main {
    public static void main(String[] args) {

        Menadzer m = new Menadzer(100);

        m.DodajTransakcje(1, "wydatek" , "jedzenie", 55);
        m.DodajTransakcje(2, "przychod", "wyplata", 130);
        m.WyswietlTransakcje();
        m.AktualizujTransakcje(2, "wydatek" , "paliwo", 30);
        m.WyswietlTransakcje();
        m.WyswietlSaldo();

    }
}
