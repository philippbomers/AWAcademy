package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung;

public class Kasse {
    private int aktuellerBetrag;

    public Kasse() {
        this.aktuellerBetrag = 0;
    }

    public void gesamtPreis(Artikel[] artikels) {
        int gesamtPreis = 0;
        for (Artikel artikel : artikels) {
            gesamtPreis += artikel.getPreis();
        }
        this.aktuellerBetrag += gesamtPreis;
    }

    public int kassenZettel(int bezahlwert) {
        this.aktuellerBetrag -= bezahlwert;
        return this.aktuellerBetrag;
    }
}
