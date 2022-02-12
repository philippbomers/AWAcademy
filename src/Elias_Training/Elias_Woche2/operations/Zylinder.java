package Elias_Training.Elias_Woche2.Operations;

import java.util.Scanner;

public class Zylinder {

    public static void zylinderRechner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte den Umfang der Dose eingeben: ");
        String umfangString = scanner.nextLine();
        System.out.println("Jetzt bitte die Höhe der Dose eingeben: ");
        String hoeheString = scanner.nextLine();

        //den Regex Code für Gleitkommazahlen noch nicht rausgefunden...
        if (umfangString.matches("[0-9]+") && hoeheString.matches("[0-9]+")) {
            double umfang = Double.parseDouble(umfangString);
            double hoehe = Double.parseDouble(hoeheString);
            double durchmesserDesBodens = umfang / Math.PI;
            double radius = durchmesserDesBodens / 2;
            double flaecheDesBodens = Math.PI * (durchmesserDesBodens / 2) * (durchmesserDesBodens / 2);
            double flaecheDesMantels = umfang * hoehe;
            double gesamtflaecheDesBleches = 2 * flaecheDesBodens + flaecheDesMantels;
            double volumen = Math.pow(radius, 2) * Math.PI * hoehe;

            System.out.println("Gesamtfäche: " + gesamtflaecheDesBleches + "\nVolumen: " + volumen);

        } else System.out.println("Falsche Eingaben, tschüss!");

    }
}
