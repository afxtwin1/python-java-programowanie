package java_files.Skarbonka;

public class runner {
    public static void main(String[] args) {

        Skarbonka nikodem = new Skarbonka("nikodem", 2);
        Skarbonka bogdan = new Skarbonka("bogdan", 25.5f);

        bogdan.pokazStan();
        nikodem.pokazStan();
        System.out.println("pokazanie stanu");
        nikodem.dodajKwote(25);
        nikodem.pokazStan();
        bogdan.pokazStan();
        bogdan.dodajKwote(25);
        bogdan.pokazStan();
        nikodem.pokazStan();

        float kwota = bogdan.pobierzOszczednosci();

        nikodem.dodajKwote(kwota);
        nikodem.pokazStan();
        bogdan.pokazStan();
    }
}
