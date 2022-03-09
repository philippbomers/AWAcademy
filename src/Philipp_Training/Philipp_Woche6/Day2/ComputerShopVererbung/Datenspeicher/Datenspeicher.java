package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Datenspeicher;

import Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Artikel;

public class Datenspeicher extends Artikel {

    /**
     * Groesse in GB
     */
    private final int groesse;

    public Datenspeicher(String name, String herstellerName, String artikelNr, int preis, int groesse) {
        super(name, herstellerName, artikelNr, preis);
        this.groesse = groesse;
    }

    public int getGroesse() {
        return groesse;
    }
}
