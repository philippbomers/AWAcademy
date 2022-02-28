package Pia_Training.Pia_Woche4.aufgaben_Taschenrechner;

public class Taschenrechner {

    private int ergebnis = 0;

    public void plus(int summand) {ergebnis += summand;
    }

    public void minus(int minuend) {ergebnis -= minuend;
    }

    public void mal(int multiplikator) {ergebnis *= multiplikator;
    }

    public void geteilt(int dividend) {ergebnis /= dividend;
    }

    public String getErgebnis() {
        return String.valueOf(ergebnis);
    }
}
