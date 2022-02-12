package Elias_Training.Elias_Woche2.Operations;


import java.util.Scanner;

public class Zeiteinheiten {

    public static void zeiteinheitenRechner() {
        Scanner scanner = new Scanner(System.in);
        String sekunden = "";
        int sekKonvertiertInZahl;
        while (true) {
            System.out.print("Bitte maximal bis " + Integer.MAX_VALUE + " Sekunden angeben, sonst \"exit\" OK??? ");
            sekunden = scanner.nextLine();

            if (sekunden.toLowerCase().contentEquals("exit")) {
                System.out.println("\nUuuuuuund tschüß!");
                break;

                //zwar liefert das Programm das gewünschte Ergebnis, hat aber nen kleinen Bug und zwar
                //wenn man versucht eine Zahl größer als Int Wertebereich einzugeben, wirft der Code eine Fehlermeldung...
                //Der Versuch in der IF Abfrage eine sekunden <= Integer.MAX_VALUE Überprüfung zu schreiben, scheitert...
            } else if (sekunden.matches("[0-9]+")) {
                int sek = Integer.parseInt(sekunden);
                int restSek = sek % 60;
                int min = sek / 60;
                int restMin = min % 60;
                int std = min / 60;
                int restStd = std % 60;
                int tag = std / 24;
                int restTag = tag % 365;
                int jahr = tag / 365;
                System.out.println("\nDer GENAUE Zeitraum von " + sekunden + " Sekunden ist folgendes:\n" +
                        jahr + " Jahre und " + restTag + " Tage und " + restStd
                        + " Stunden und " + restMin + " Minuten und " + restSek + " Sekunden!");
                System.out.println("\nAußerdem sind " + sekunden + " Sekunden insgesamt:\n"
                        + min + " Minuten\noder\n" + std + " Stunden\noder\n" + tag + " Tage\noder\nca. " + jahr + " Jahre");


            } else System.out.println("\nHmmmmm???\n");
        }
    }
}

