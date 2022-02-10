/**
 * Zeiteinheiten
 * Schreibe ein Programm, welches eine eingegebene Zahl von Sekunden in seine größeren
 * Zeiteinheiten zerlegt.
 * Wieviele Sekunden hast du zur Verfügung:
 * 244568879
 * 7 Jahre und 275 Tage und 15 Stunden und 47 Minuten und 59 Sekunden
 * Hinweis: Vernachlässige Schaltjahre, nimm also 365 Tage pro Jahr an. Verwende die
 * Modulo-Operation.
 */

package Philipp_Woche2.Operators;

import java.util.Scanner;

public class TimeUnits {

    public static void main() {

        Scanner scanSeconds = new Scanner(System.in);
        System.out.println("Wie viele Sekunden hast du zur Verfügung:");
        long inputValue = scanSeconds.nextLong();

        // calculate years
        long years = inputValue / 31536000;
        long yearsRest = inputValue % 31536000;

        // calculate the remaining days
        short days = (short) (yearsRest / 86400);
        long daysRest = (yearsRest % 86400);

        // calculate the remaining hours
        byte hours = (byte) (daysRest / 3600);
        long hoursRest = (daysRest % 3600);

        // calculate the remaining minutes
        byte minutes = (byte) (hoursRest / 60);
        long minutesRest = (hoursRest % 60);

        // calculate the remaining seconds
        byte seconds = (byte) minutesRest;


        System.out.println(
                "Jahre:" + years +
                        "\nTage:" + days +
                        "\nStunden:" + hours +
                        "\nMinuten:" + minutes +
                        "\nSekunden:" + seconds
        );

    }
}
