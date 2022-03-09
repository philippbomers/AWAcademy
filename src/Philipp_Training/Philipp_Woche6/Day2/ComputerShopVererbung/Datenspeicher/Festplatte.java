package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Datenspeicher;

public class Festplatte extends Datenspeicher {
    private final int drehzahl;

    public Festplatte(String name, String herstellerName, String artikelNr, int preis, int groesse, int drehzahl) {
        super(name, herstellerName, artikelNr, preis, groesse);
        this.drehzahl = drehzahl;
    }

    public int getDrehzahl() {
        return drehzahl;
    }
}
