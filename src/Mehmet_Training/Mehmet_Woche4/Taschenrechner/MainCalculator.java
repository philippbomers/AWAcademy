package Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Taschenrechner;

public class MainCalculator {
    public static void main(String[] args) {
        //
        Calculator myCalculator = new Calculator();
        myCalculator.plus(8);
        myCalculator.mal(2);
        myCalculator.geteilt(4);
        System.out.println(myCalculator.getErgebnis());
    }
}
