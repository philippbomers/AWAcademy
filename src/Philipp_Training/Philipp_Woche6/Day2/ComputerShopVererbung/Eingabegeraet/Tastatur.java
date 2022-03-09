package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Eingabegeraet;

public class Tastatur extends Eingabegeraet {

    /**
     * Nummernblock = true
     * kein Nummernblock = false
     */
    private final boolean nummernblock;

    public Tastatur(boolean nummernblock, boolean kabel, String name, String herstellerName, String artikelNr, int preis) {
        super(name, herstellerName, artikelNr, preis, kabel);
        this.nummernblock = nummernblock;
    }

    public boolean isNummernblock() {
        return nummernblock;
    }
}
