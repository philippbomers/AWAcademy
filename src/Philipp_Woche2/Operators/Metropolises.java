/**
 * Metropolen (Bonusaufgabe)
 * Schreibe ein Programm, welches prüft, ob eine Stadt eine Metropole ist. Folgendes sind die
 * Eigenschaften einer Metropole:
 * Name:
 * Hauptstadt Ja oder Nein:
 * Anzahl Einwohner:
 * Steuereinnahmen pro Einwohner:
 * String name
 * boolean istHauptstadt
 * int anzahlEinwohner
 * double steuerEinnahmenProEinwohner
 * Regeln: Eine Stadt ist ein Metropole, wenn sie eine Hauptstadt ist und zudem mehr als
 * 100.000 Einwohner hat. Oder wenn sie mehr als 200.000 Einwohner hat und ein jährliches
 * Steuereinkommen von mindestens 1.000.000.000 Euro hat.
 * Hinweis: Beachte die Ausdrücke “mehr als” und “mindestens”.
 */

package Philipp_Woche2.Operators;

import java.util.Scanner;

public class Metropolises {

    public static void main() {

        Scanner metropolisesScanner = new Scanner(System.in);

        System.out.println("Name der Stadt:");
        String name = metropolisesScanner.nextLine();

        System.out.println("Ist " + name + " eine Hauptstadt ('true' oder 'false')?");
        boolean capitalCity = metropolisesScanner.nextBoolean();

        System.out.println("Wieviele Einwohner hat " + name + "?");
        int inhabitants = metropolisesScanner.nextInt();

        System.out.println("Steuereinnahmen pro Einwohner");
        double inhabitantTaxes = metropolisesScanner.nextDouble();

        System.out.println(checkMetropolises(name, capitalCity, inhabitants, inhabitantTaxes));
    }

    /**
     * The method checks if a city is a metropolis.
     * If a specific amount of taxes is missing, it calculates and outputs the value.
     * The if-statements should be self-explanatory (for the German target group)
     *
     * @return String answer
     */
    public static String checkMetropolises(String name, boolean istHauptstadt, int anzahlEinwohner, double steuerEinnahmenProEinwohner) {

        long steuereinnahmen = (long) (anzahlEinwohner * steuerEinnahmenProEinwohner);

        if (istHauptstadt) {
            if (anzahlEinwohner > 100000) {
                return name + " ist eine Metropole, denn sie ist eine Hauptstadt und hat über 100.000 Einwohner.";
            } else {
                return name + " ist keine Metropole, denn sie hat zu wenig Einwohner";
            }
        } else {
            if (anzahlEinwohner > 200000) {
                if (steuereinnahmen >= 1000000000) {
                    return name + " ist eine Metropole, denn sie hat über 200.000 Einwohner und ein jährliches " +
                            "Steuereinkommen von mindestens 1.000.000.000 Euro.";
                } else {
                    int erforderlicheEinnahmen = 1000000000 / anzahlEinwohner;
                    return name + " ist keine Metropole, denn sie hat zu niedrige Steuereinnahmen.\n" +
                            "Die Stadt braucht jährliche Einnahmen von mindestens " + erforderlicheEinnahmen + " Euro pro Einwohner.\n" +
                            "Dementsprechend fehlen noch " + (erforderlicheEinnahmen - steuerEinnahmenProEinwohner) +
                            " Euro an zusätzlichen Steuereinnahmen pro Person.";
                }
            } else {
                return name + " ist keine Metropole, denn sie hat zu wenig Einwohner";
            }
        }
    }
}
