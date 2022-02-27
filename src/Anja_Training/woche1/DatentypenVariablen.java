package Anja_Training.woche1;

import java.time.LocalDate;
import java.util.Scanner;

public class DatentypenVariablen {
    public static void doDatentypenVariablen() {
        //VerschiedeneDatentypen

        String meineInitialien = "A.S.";
        int einwohnerzahlDeutschland21 = 83200000;
        long einwohnerzahlErde20 = 7800000000L;
        //LocalDate.now().getDayOfMonth();
        boolean geraderTag = LocalDate.now().getDayOfMonth() % 2 == 0;
        double trefferqouteGomez = 0.652173913; //Gomez Bayern Muenchen 115 Einsaetze mit 75 Tore --> 0,652173913
        byte dauerWocheJavakurs = 12;
        double zahlPi = Math.PI;
        System.out.println("Lösung der Verschiedenen Datentypen: \n");
        System.out.println(meineInitialien + "\n" + einwohnerzahlDeutschland21 + "\n" + einwohnerzahlErde20 + "\n"
                + geraderTag + "\n" + trefferqouteGomez + "\n" + dauerWocheJavakurs + "\n" + zahlPi);


        //Text formatieren (Bonusaufgabe)

        System.out.println("Gebe einen Text ein der nach folgenden Regeln formatiert wird: \n" +
                "Wird '_' bei einem Wort vorangestellt und angehaengt wird es komplett in Großbuchstaben dargestellt. \n" +
                "Wird '#' bei einem Wort vorangestellt und angehaengt wird es komplett klein geschrieben.\n ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Eingegebenen Text in Woerter splitten
        String[] splitSatz = text.split(" ");


        for (String splitText : splitSatz) {
            char lastChar = splitText.charAt(splitText.length() - 1); // Hilfsvariable für Inhalt letzte Stelle

            // Konvertiere Wort mit Anfang&Ende "_" zu groß
            if (splitText.charAt(0) == '_' && ((lastChar == '_') || (splitText.charAt(splitText.length() - 2) == '_'
                    && (lastChar == ',' || lastChar == ';' || lastChar == '.' || lastChar == '?' || lastChar == '!')))) {

                if (lastChar != '_') {

                    splitText = splitText.substring(1, splitText.length() - 2);
                    splitText = splitText.toUpperCase();
                    System.out.print(splitText + lastChar + " ");
                } else {
                    splitText = splitText.substring(1, splitText.length() - 1);
                    splitText = splitText.toUpperCase();
                    System.out.print(splitText + " ");
                }
                //Konvertiere Wort mit Anfang&Ende "#" zu klein
            } else if (splitText.charAt(0) == '#' && ((lastChar == '#') || (splitText.charAt(splitText.length() - 2) == '#' && (lastChar == ',' || lastChar == ';' || lastChar == '.' || lastChar == '?' || lastChar == '!')))) {
                if (lastChar != '#') {
                    splitText = splitText.substring(1, splitText.length() - 2);
                    splitText = splitText.toLowerCase();
                    System.out.print(splitText + lastChar + " ");
                } else {
                    splitText = splitText.substring(1, splitText.length() - 1);
                    splitText = splitText.toLowerCase();
                    System.out.print(splitText + " ");
                }
                //Andere Worte bleiben gleich
            } else {
                System.out.print(splitText + " ");
            }
        }

        // Alternative Loesung. Mit Hacken, dass die Zeichen "_" "#" nur zum formatieren verwendet werden duerfen. Nicht einfach so im Text.
       /* char[] chars = text.toCharArray();
        boolean isUpper = false;
        boolean isLower = false;

        for(Character c: chars){
            if(c.equals('_')){
                isUpper = !isUpper;
                continue;
            }else if(c.equals('#')){
                isLower = !isLower;
                continue;
            }
            if(isUpper){
                System.out.print(c.toString().toUpperCase(Locale.ROOT));
            }else if(isLower){
                System.out.print(c.toString().toLowerCase(Locale.ROOT));
            }else{
                System.out.print(c);
            }
        }

        */

    }
}


