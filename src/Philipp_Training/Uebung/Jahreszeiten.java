package Philipp_Training.Uebung;

import java.util.Scanner;

public class Jahreszeiten {
    public static void main(String[] args) {

        System.out.println("Herzlich Willkommen zum Jahreszeitenprogramm!\n" +
                "Bitte gib eine Jahreszeit ein:");
        Scanner peter = new Scanner(System.in);
        String jahreszeit = peter.nextLine();

        if (jahreszeit.equals("sommer")) {
            System.out.println("Das ist aber warm.");
        } else if (jahreszeit.equals("winter")) {
            System.out.println("Das ist aber kalt.");
        } else if (jahreszeit.equals("fruehling")) {
            System.out.println("Es wird wärmer.");
        } else if (jahreszeit.equals("herbst")) {
            System.out.println("Es ist angenehmer im Herbst.");
        } else {
            System.out.println("Jahreszeit nicht bekannt.");
        }
    }
}
