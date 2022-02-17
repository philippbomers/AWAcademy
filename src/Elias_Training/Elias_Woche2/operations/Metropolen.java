package Elias_Training.Elias_Woche2.Operations;

import java.text.NumberFormat;
import java.util.Scanner;

public class Metropolen {

    //Es fehlt noch die Überprüfung ob die Eingaben richtig sind

    public static void metropolenBestimmen() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name der Stadt: ");
        String stadtName = scanner.nextLine();

        System.out.println("Ist " + stadtName + " eine Hauptstadt? (\"true\" oder \"false\")?");
        boolean isHauptstadt = scanner.nextBoolean();

        System.out.println("Wie viele Einwohner hat " + stadtName + "?");
        int anzahlEinwohner = scanner.nextInt();

        System.out.println("Steuereinnahmen pro Einwohner?");
        double steuerEinnahmenProEinwohner = scanner.nextDouble();
        double steuerEinnahmenGesamt = anzahlEinwohner * steuerEinnahmenProEinwohner;
        double fehlendeSteuerEinnahmenProEinwohner =
                (1_000_000_000 - (anzahlEinwohner * steuerEinnahmenProEinwohner)) / anzahlEinwohner;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String steuerGesamtEuro = formatter.format(steuerEinnahmenGesamt);
        String fehlendeSteuerProEinwohnerEuro = formatter.format(fehlendeSteuerEinnahmenProEinwohner);


        boolean bedingungEins = isHauptstadt && (anzahlEinwohner > 100_000);
        boolean bedingungZwei = (anzahlEinwohner > 200_000) && (steuerEinnahmenGesamt >= 1_000_000_000);

        if (bedingungEins || bedingungZwei) {
            if (bedingungEins) {
                System.out.println(stadtName + " ist eine Metropole, " +
                        "denn sie ist eine Hauptstadt und hat " + anzahlEinwohner + " Einwohner");
            } else System.out.println(stadtName + " ist eine Metropole, " +
                    "denn sie hat " + anzahlEinwohner + " Einwohner und die gesamten Steuereinnahmen dieser Stadt pro Jahr "
                    + "betragen " + steuerGesamtEuro);
        } else System.out.println(stadtName + " ist keine Metropole! Denn es fehlen jährlich "
                + fehlendeSteuerProEinwohnerEuro + " Steuereinnahmen pro Einwohner!");
    }

}
