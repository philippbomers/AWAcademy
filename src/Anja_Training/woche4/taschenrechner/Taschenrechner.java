package Anja_Training.woche4.taschenrechner;

public class Taschenrechner {
    // Eigenschaften
    private int ergebnis;


    // Konstruktor
    public Taschenrechner() {
        ergebnis = 0;
    }

    //Methoden
    public void plus(int x) {
        ergebnis = ergebnis + x;
    }

    public void minus(int x) {
        ergebnis = ergebnis - x;
    }

    public void mal(int x) {
        ergebnis = ergebnis * x;
    }

    public void geteilt(int x) {
        if (x != 0) {
            ergebnis = ergebnis / x;
        } else {
            System.out.print("Du darfst nicht durch 0 teilen! Das letzte valide Ergebnis ist: \n");

        }
    }


    // Getter und Setter
    public int getErgebnis() {
        return ergebnis;
    }



}
