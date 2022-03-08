package Philipp_Training.Philipp_Woche6.Day1.Kasse;

public class Produkt {
    final private String name;
    final private int preis;

    public Produkt(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return this.name;
    }

    public int getPreis() {
        return this.preis;
    }
}
