package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator;

public class Aufgabenloesung_CalculatorMain {
    public static void main(String[] args) {
        CalculatorLogic meinRechner = new CalculatorLogic();
        meinRechner.plus(8);
        meinRechner.mal(2);
        meinRechner.geteilt(4);
        System.out.println(meinRechner.getErgebnis());
    }
}
