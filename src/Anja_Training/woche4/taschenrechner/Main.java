package Anja_Training.woche4.taschenrechner;

public class Main {
    public static void main(String[] args) {
        Taschenrechner meinRechner = new Taschenrechner();
        meinRechner.plus(8);
        meinRechner.mal(2);
        meinRechner.geteilt(0);
        meinRechner.minus(8);
        meinRechner.mal(4);
        System.out.println("Das Ergebnis lautet:" +meinRechner.getErgebnis());
    }
}
