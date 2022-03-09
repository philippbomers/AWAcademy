package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung.Eingabegeraet;

public class Maus extends Eingabegeraet {

    private final int anzahlTasten;

    public Maus(int anzahlTasten, boolean kabel, String name, String herstellerName, String artikelNr, int preis) {
        super(name, herstellerName, artikelNr, preis, kabel);
        this.anzahlTasten = anzahlTasten;
    }

    public int getAnzahlTasten() {
        return anzahlTasten;
    }
}
