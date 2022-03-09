package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung;

public class Prozessor extends Artikel {

    private final String name;
    private int frequenz;


    public Prozessor(int frequenz, String name, String herstellerName, String artikelNr, int preis) {
        super(name, herstellerName, artikelNr, preis);
        this.frequenz = frequenz;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(int frequenz) {
        this.frequenz = frequenz;
    }
}
