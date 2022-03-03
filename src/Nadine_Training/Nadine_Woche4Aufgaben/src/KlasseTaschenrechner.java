public class KlasseTaschenrechner {

    //Eigenschaften
    private int ergebnis;
    private int plus;
    private int minus;
    private int mal;
    private int geteilt;
    private int zahl1;


    //Konstruktor
    public KlasseTaschenrechner(){
    ergebnis = 0;
    }


    //Methoden u. Funktionen

    public int getErgebnis() {
        return ergebnis;
    }

    public int plus(int zahl1) {
        this.zahl1 = zahl1;
        plus = zahl1 + ergebnis;
        ergebnis = plus;
        return ergebnis;
    }

    public int minus(int zahl1) {
        this.zahl1 = zahl1;
        minus = ergebnis - zahl1;
        ergebnis = minus;
        return ergebnis;
    }

    public int mal(int zahl1) {
        this.zahl1 = zahl1;
        mal = ergebnis * zahl1;
        ergebnis = mal;
        return ergebnis;
    }

    public int geteilt(int zahl1) {
        this.zahl1 = zahl1;
        geteilt = ergebnis / zahl1;
        ergebnis = geteilt;
        return ergebnis;
    }
}
