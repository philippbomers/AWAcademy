package Pia_Woche4.aufgaben_Computershop;

import Pia_Woche4.aufgaben_Computershop.Computer;

import java.text.NumberFormat;

public class Berechnung {

    public static String gesamtGewinn(Computer[] alleComputer) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        double ergebnis = 0;
        for (Computer computer : alleComputer) {
            ergebnis += computer.getVerkaufsPreis() - computer.getEinkaufsPreis();
        }
        return format.format(ergebnis);
    }
}
