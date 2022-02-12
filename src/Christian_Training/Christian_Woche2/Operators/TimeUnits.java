package Christian_Training.Christian_Woche2.Operators;

import java.util.Scanner;

public class TimeUnits {
    public static void main(String[] args) {
        /*
            Schreibe ein Programm, welches eine eingegebene Zahl von Sekunden in seine größeren
            Zeiteinheiten zerlegt.

            Wieviele Sekunden hast du zur Verfügung:
            244568879

            7 Jahre und 275 Tage und 15 Stunden und 47 Minuten und 59 Sekunden

            Hinweis: Vernachlässige Schaltjahre, nimm also 365 Tage pro Jahr an. Verwende die
            Modulo-Operation.

         */

        // Hilfreiche Konstanten
        final int SekundenImStunde = 3_600;
        final int SekundenImTag = 86_400;
        final int SekundenImJahr = 31_556_926;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Sekunden hast du zur Verfügung:");
        int sekunden = scanner.nextInt();
        // int sekunden = 244568879; Nur zum testen da

        int sekundenDuHast = sekunden % 60;

        sekunden = sekunden - sekundenDuHast;

        int minutenDuHast = (sekunden % SekundenImStunde) / 60;

        sekunden = sekunden - (minutenDuHast * 60);

        int stundenDuHast = (sekunden % SekundenImTag) / SekundenImStunde;

        sekunden = sekunden - (stundenDuHast * SekundenImStunde);

        int tage = sekunden / SekundenImTag;
        tage = tage % 365;

        int jahre = sekunden / SekundenImJahr;

        System.out.println( jahre + " Jahre und " + tage + " Tage und " + stundenDuHast + " Stunden und " +
                minutenDuHast + " Minuten und " + sekundenDuHast + " Sekunden");
    }
}

