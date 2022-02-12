package Christian_Training.Christian_Woche2.Operators;
/*
        Regeln:
        Eine Stadt ist ein Metropole, wenn sie:
        1. eine Hauptstadt ist UND zudem mehr als 100.000 Einwohner hat.
        2. Oder wenn sie mehr als 200.000 Einwohner hat UND ein jährliches
        Steuereinkommen von mindestens 1.000.000.000 Euro hat.
*/

import java.util.Scanner;

public class Metropolises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name der Stadt:");
        String name = scanner.nextLine();

        System.out.println("Ist " + name + " eine Hauptstadt ('true' oder 'false')? ");
        boolean istHauptstadt = scanner.nextBoolean();

        System.out.println("Wieviele Einwohner hat " + name + "?");
        int anzahlEinwohner = scanner.nextInt();

        System.out.println("Steuereinnahmen pro Einwohner");
        int steuerEinnahmenProEinwohner = scanner.nextInt();

        int steuerEinkommen = anzahlEinwohner * steuerEinnahmenProEinwohner;

        // erste Regel
        if (istHauptstadt && anzahlEinwohner > 100_000) {
            System.out.println(name + " ist eine Metropole den sie ist eine Hauptstadt und hat " + anzahlEinwohner
                    + " Einwohner");
            // zweite Regel
        } else if (anzahlEinwohner > 200_000 && steuerEinkommen >= 1_000_000_000 ) {
            System.out.println(name + " ist eine Metropole den sie hat " + anzahlEinwohner + " Einwohner und " +
                    "Steuereinkommen von " + steuerEinkommen );
        } else {
            System.out.println(name + " ist keine Metropole ");
        }
    }
}