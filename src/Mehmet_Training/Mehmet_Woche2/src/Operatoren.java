import java.util.*;

public class Operatoren {

    public static void main(String[] args) {
        //Aufgabe: Zeiteinheiten
        System.out.println("Aufgabe: Zeiteinheiten");
        System.out.println("Wie viele Sekunden hast du zur Verfügung?");
        Scanner input = new Scanner(System.in);
        long verfügbareSekunden = input.nextLong();
        input.nextLine();
        //Verfügbare Sekunden werden durch die Sekunden in einem Jahr geteilt, dann nehmen wir nur die ganze Zahl
        //Anhand der Modulo-Operation berechnen wir die verbleibenden Sekunden.
        //Der Prozess wird für Tage, Stunden und Minuten wiederholt. Am Ende bleibt nur der Teil mit Sekunden übrig.
        long verfügbareJahren = verfügbareSekunden / 31536000;
        verfügbareSekunden = verfügbareSekunden % 31536000;
        int verfügbareTage = (int) (verfügbareSekunden / 86400);
        verfügbareSekunden = verfügbareSekunden % 86400;
        int verfügbareStunden = (int) (verfügbareSekunden / 3600);
        verfügbareSekunden = verfügbareSekunden % 3600;
        int verfügbareMinuten = (int) (verfügbareSekunden / 60);
        verfügbareSekunden = verfügbareSekunden % 60;
        System.out.println(verfügbareJahren + " Jahre und " + verfügbareTage + " Tage und " + verfügbareStunden +
                " Stunden und " + verfügbareMinuten + " Minuten und " + verfügbareSekunden + " Sekunden");
        System.out.println();

        //Aufgabe: Zylinder
        System.out.println("Aufgabe: Zylinder");
        System.out.print("Gib bitte den Umfang an: ");
        int umfang = input.nextInt();
        System.out.print("Gib bitte die Höhe an: ");
        int hoehe = input.nextInt();
        double pi = Math.PI;
        double durchmesser = umfang / pi;
        double flaecheBoden = pi * (durchmesser / 2) * (durchmesser / 2);
        int flaecheMantel = umfang * hoehe;
        double gesamtflaeche = 2 * flaecheBoden + flaecheMantel;
        double volumen = flaecheBoden * hoehe;
        System.out.println("Gesamtflaeche des Zylinders beträgt: " + gesamtflaeche);
        System.out.println("Fassungsvermögen der Dose beträgt: " + volumen);
        System.out.println();

        //Aufgabe: Eine Zeile Code
        System.out.println("Aufgabe: Eine Zeile Code");
        System.out.println(Math.sqrt(3.5 + 15.5) * 5 / 3 - ((15.5 + 10) * (15.5 - 4.1)));
        System.out.println();

        //Aufgabe: Metropolen (Bonusaufgabe)
        System.out.println("Aufgabe: Metropolen (Bonusaufgabe)");
        System.out.println("Name der Stadt?");
        String nameStadt = input.next();
        System.out.println("Ist " + nameStadt + " eine Hauptstadt ('true' oder 'false')?");
        boolean istHauptstadt = input.nextBoolean();
        System.out.println("Wie viele Einwohner hat " + nameStadt + "?");
        int anzahlEinwohner = input.nextInt();
        System.out.println("Steuereinnahmen pro Einwohner?");
        double steuerProEinwohner = input.nextDouble();
        long steuerEinkommen = (long) (anzahlEinwohner * steuerProEinwohner);
        double fehlendeSteuerEinkommen = (1000000000 - steuerEinkommen) / anzahlEinwohner;
        if (istHauptstadt == true && anzahlEinwohner > 100000) {
            System.out.println(nameStadt + " ist eine Metropole, denn sie ist eine Hauptstadt und hat " +
                    anzahlEinwohner + " Einwohner.");
        } else if (anzahlEinwohner > 200000 && steuerEinkommen >= 1000000000) {
            System.out.println(nameStadt + " ist eine Metropole, denn sie hat " + anzahlEinwohner + " Einwohner \n" +
                    "und sie bezahlen insgesamt " + steuerEinkommen + "€ an Steuern");
        } else if (anzahlEinwohner > 200000 && steuerEinkommen < 1000000000) {
            System.out.println(nameStadt + " ist keine Metropole.");
            System.out.println("Die Einwohner in " + nameStadt + " müssten härter arbeiten und pro Kopf / pro Jahr \n" +
                    fehlendeSteuerEinkommen + "€ mehr an Steuern bezahlen, damit sie zu einer Metropole wird");
        } else {
            System.out.println(nameStadt + " ist keine Metropole.");
        }
    }
}
