package java_files.Skarbonka;

public class Skarbonka {

    private String imieWlasciciela;
    private float kwota;

    public Skarbonka(String imieWlasciciela, float kwota) {
        this.imieWlasciciela = imieWlasciciela;
        this.kwota = kwota;
    }

    public float dodajKwote(float dodajKwota) {
        kwota += dodajKwota;
        return kwota;
    }

    public void pokazStan() {
        System.out.println("Właściciel: " + imieWlasciciela);
        System.out.println("Zgromadzone oszczędności: " + kwota + " zł");
    }


    public float pobierzOszczednosci() {
        float wszystko = kwota;
        kwota = 0;
        return wszystko;
    }
}

