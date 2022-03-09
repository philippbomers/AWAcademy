package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung;

public class Artikel {
    private final String name;
    private final String herstellerName;
    private final String artikelNr;
    private final int preis;

    public Artikel(String name, String herstellerName, String artikelNr, int preis) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNr = artikelNr;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getHerstellerName() {
        return herstellerName;
    }

    public String getArtikelNr() {
        return artikelNr;
    }

    public int getPreis() {
        return preis;
    }
}
