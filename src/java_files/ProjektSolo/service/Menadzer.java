package java_files.ProjektSolo.service;

import java_files.ProjektSolo.model.Transakcja;

import java.util.ArrayList;
import java.util.List;

public class Menadzer {

    private final List<Transakcja> transakcje = new ArrayList<>();
    private static double saldo;
    public Menadzer(double saldo) {
        Menadzer.saldo = saldo;
    }
    public void DodajTransakcje(int id, String typ, String kategoria, double kwota) {
        Transakcja t = new Transakcja(id, typ, kategoria, kwota);
        transakcje.add(t);
        if ("przychod".equals(typ)) {
            saldo += kwota;
        } else if ("wydatek".equals(typ)) {
            saldo -= kwota;
        }
    }
    public void UsunTransakcje(int id) {
        boolean znaleziono = false;
        for (int i = 0; i<transakcje.size(); i++) {
            if (transakcje.get(i).id == id) {
                znaleziono = true;
                transakcje.remove(i);
                break;

            }
        }
        if (!znaleziono) {
            System.out.println("Transakcja o id "+id+" nie istnieje");
        }
    }
    public void AktualizujTransakcje(int id, String typ, String kategoria, double kwota) {
        boolean znaleziono = false;

        for (int i = 0; i < transakcje.size(); i++) {
            Transakcja t = transakcje.get(i);
            if (t.id == id) {
                if (t.typ.equals("przychod")) {
                    saldo -= t.kwota;
                } else if (t.typ.equals("wydatek")) {
                    saldo += t.kwota;
                }
                t.typ = typ;
                t.kategoria = kategoria;
                t.kwota = kwota;
                if (typ.equals("przychod")) {
                    saldo += kwota;
                } else if (typ.equals("wydatek")) {
                    saldo -= kwota;
                }
                znaleziono = true;
                System.out.println("\nZaktualizowano transakcję o ID: " + id);
                break;
            }
        }
        if (!znaleziono) {
            System.out.println("Nie znaleziono transakcji o ID: " + id);
        }
    }



    public void WyswietlSaldo() {
        System.out.println("\nTwoje saldo aktualnie wynosi: "+saldo);
    }
    public void WyswietlTransakcje() {
        System.out.printf("%-4s| %-9s| %-12s| %8s\n", "ID", "Typ", "Kategoria", "Kwota");
        System.out.println("-------------------------------------------");
        for (Transakcja t : transakcje) {
            System.out.printf("%-4d| %-9s| %-12s| %8.2f\n", t.id, t.typ, t.kategoria, t.kwota);

        }
    }
}

