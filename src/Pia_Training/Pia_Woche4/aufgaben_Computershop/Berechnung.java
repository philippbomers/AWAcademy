package Pia_Training.Pia_Woche4.aufgaben_Computershop;

import java.text.NumberFormat;

public class Berechnung {

    /**
     * This class contains a string of the total selling profit of a computer shop.
     * @param alleComputer : Array of all the computers of a computer shop.
     * @return : total selling profit; calculation based on total purchasing price - total selling price.
     */
    public static String gesamtGewinn(Computer[] alleComputer) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        double ergebnis = 0;
        for (Computer computer : alleComputer) {
            ergebnis += computer.getVerkaufsPreis() - computer.getEinkaufsPreis();
        }
        return format.format(ergebnis);
    }
}
