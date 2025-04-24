package java_files.playlista;

public class Zarzadzanie_playlistami {
    public static void main(String[] args) {

        Playlista playlistapop = new Playlista("Pop");
        Playlista playlistarock = new Playlista("Rock");

        playlistapop.DodajUtwor("aaaaa");
        playlistapop.DodajUtwor("bbbbb");
        playlistarock.DodajUtwor("ccccc");
        playlistarock.DodajUtwor("ddddd");

        playlistapop.WypiszUtwory();
        playlistarock.WypiszUtwory();

    }

}
