package java_files.Szkolne.playlista;
import java.sql.SQLOutput;
import java.util.*;

public class Playlista {

    private String nazwa;
    private List<String> utwory;

    public Playlista(String nazwa) {

        this.nazwa = nazwa;
        this.utwory = new ArrayList<>();

    }

    public void DodajUtwor(String utwor){

        if(utwor == null || utwor.trim().isEmpty()){

            System.out.println("nie dodawaj pustego utworu");
            return;

        }
        utwory.add(utwor);
        System.out.println("dodano utwor: " + utwor);

    }

    public String pobierzUtwor(int indexutworu){

        if(indexutworu-1 < 0 || indexutworu-1 > utwory.size()){
            System.out.println("nie ma takiego numeru");
            return null;

        }


        String utwor;
        utwor = utwory.get(indexutworu-1);
        return utwor;

    }
    public void WypiszUtwory(){

        if(utwory.isEmpty()){

            System.out.println("playlista nie ma utworow");
        }

        for(int i = 0; i < utwory.size(); i++){
            System.out.println(utwory.get(i));
        }

    }
    public void usunUtwor(int indexutworu){

        if(indexutworu-1 < 0 || indexutworu-1 > utwory.size()) {
            System.out.println("nie ma takiego numeru");


        }

        utwory.remove(indexutworu-1);

    }

}
