package Elias_Training.Elias_Woche1;

import java.util.Scanner;

public class DatenTypenVariablen {
    public static void main(String[] args) {

        datenTypen();
        System.out.println("___________________________________");
        textFormatieren();

    }

    public static void datenTypen() {
        char vorname = 'E';
        char nachname = 'A';
        System.out.println("Mein Vorname fängt mit (" + vorname + ") und mein Nachname mit (" + nachname + ") an!");
        int einwohnerZahlDe = 83_756_658;
        long einwohnerErde = 7_948_118_521L;
        System.out.println("Von insgesamt " + einwohnerErde + " Menschen leben " + einwohnerZahlDe + " in Deutschland!");
        boolean istGeradeTag = false;
        System.out.println("Ist gerade Tag? Die Antwort lautet: " + istGeradeTag + " oder nochmal auf DEUTSCH: falsch!!!");
        float trefferQuoteGomez = 0.65F;
        System.out.println("Gomez hat in jedem Spiel für die Bayern durchschnittlich " + trefferQuoteGomez + " Tore geschossen! Danke Mario und mia san mia!");
        byte dauerDesKursesInWochen = 12;
        System.out.println("Der Javakurs dauert " + dauerDesKursesInWochen + " Wochen!");
        double piGenau = Math.PI;
        float piWenigerGenau = (float) Math.PI;
        System.out.println("Die genaue Zahl PI lautet: " + piGenau + "\nund die etwas ungenauere PI: " + piWenigerGenau);
    }


    public static void textFormatieren() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren gewünschten Text ein: ");
        String text = scanner.nextLine();
        String[] woerter = text.split(" ");
        //String formatierterText[] = new String[woerter.length];
        for (String wort : woerter) {
            if ((wort.charAt(wort.length() - 1) == ',') || wort.charAt(wort.length() - 1) == '.'
                    || wort.charAt(wort.length() - 1) == '!' || wort.charAt(wort.length() - 1) == '?') {
                //Damit die Satzzeichen . , ! ? von den Sonderzeichen nicht beeinflusst werden...

                wort = wort.toUpperCase().replace("_", "");
                wort = wort.toLowerCase().replace("#", "");
            } else if (wort.charAt(0) == '_' && wort.charAt(wort.length() - 1) == '_') {
                wort = wort.toUpperCase().replace("_", "");
            } else if (wort.charAt(0) == '#' && wort.charAt(wort.length() - 1) == '#') {
                wort = wort.toLowerCase().replace("#", "");
            }
            System.out.print(wort + " ");
        }
    }
}

