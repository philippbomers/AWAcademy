package Mehmet_Training.Mehmet_Woche4.Taschenrechner;

public class Calculator {
    //Eigenschaften
    private int ergebnis;

    //Konstruktor(en)
    public Calculator() {
        ergebnis = 0;
    } //Für jede Instanz des Rechners ist das Ergebnis zu null gesetzt,

    //Getter/Setter

    public int getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(int ergebnis) {
        this.ergebnis = ergebnis;
    }

    //Methoden
    public void plus(int zahl2) {
        ergebnis = ergebnis + zahl2;
    }

    public void minus(int zahl2) {
        ergebnis = ergebnis - zahl2;
    }

    public void mal(int zahl2) {
        ergebnis = ergebnis * zahl2;
    }

    public void geteilt(int zahl2) {
        if (zahl2 != 0) { //Nullprüfung beim Teilen
            ergebnis = ergebnis / zahl2;
        } else {
            System.out.println("Teilen durch null ist unmöglich");
        }
    }
}
