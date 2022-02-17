package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator;

public class CalculatorLogic {

    private int ergebnis = 0;

    public void reset() {
        this.ergebnis = 0;
    }

    public void plus(int summand) {
        this.ergebnis += summand;
    }

    public void minus(int minuend) {
        this.ergebnis -= minuend;
    }

    public void mal(int multiplier) {
        this.ergebnis *= multiplier;
    }

    public void geteilt(int divisor) {
        this.ergebnis /= divisor;
    }

    public String getErgebnis() {
        return String.valueOf(this.ergebnis);
    }
}
