package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Eingabegeraet;

import Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Artikel;

public class Eingabegeraet extends Artikel {
    /**
     * Kabel = true
     * Drahtlos = false
     */
    private final boolean kabel;

    public Eingabegeraet(String name, String herstellerName, String artikelNr, int preis, boolean kabel) {
        super(name, herstellerName, artikelNr, preis);
        this.kabel = kabel;
    }

    public boolean isKabel() {
        return kabel;
    }
}
