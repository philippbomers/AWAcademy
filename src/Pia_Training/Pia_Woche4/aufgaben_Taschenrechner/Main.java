package Pia_Training.Pia_Woche4.aufgaben_Taschenrechner;

public class Main {
    public static void main(String[] args) {
        Taschenrechner meinRechner = new Taschenrechner();
        meinRechner.plus(8);
        meinRechner.mal(2);
        meinRechner.geteilt(4);
        System.out.println(meinRechner.getErgebnis());
    }
}
