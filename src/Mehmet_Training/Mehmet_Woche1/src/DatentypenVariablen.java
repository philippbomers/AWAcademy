package Mehmet_Training.Mehmet_Woche1.src;

import java.util.Scanner;

public class DatentypenVariablen {

    public static void main(String[] args) {
        //Aufgabe: Verschiedene Datentypen
        System.out.println("Lösung zur ersten Aufgabe" + "\n");
        String initialien = "M.K.";
        int einwohnerzahlDeutschland = 82300000;
        long einwohnerzahlWeltweit = 7753000000L;
        boolean istGeradeTag = true;
        float trefferQuote = 0.65f;
        byte dauerJavaKurs = 12;
        double pi = Math.PI;
        System.out.println(initialien + "\n" + einwohnerzahlDeutschland + "\n" + einwohnerzahlWeltweit + "\n"+ istGeradeTag + "\n" + trefferQuote + "\n" + dauerJavaKurs + "\n" + pi);

        //Bonus-Aufgabe
        System.out.println("\n" + "Lösung zur Bonus-Aufgabe" + "\n");
        Scanner st = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String str = st.nextLine();

        /** We split the text into words creating a string array, in order to evaluate them individually.
         After that we look for the symbols '_' and '#' at the beginning and at the end of each word.
         Lastly, after editing the words as we please, we combine the words back into a new string */

        String[] arr = str.split(" ");
        String newString = "";

        for (String nextWord : arr) {
            if (nextWord.charAt(0) == '_' && nextWord.charAt(nextWord.length() - 1) == '_') {
                newString = (newString + " " + nextWord.toUpperCase().substring(1, nextWord.length() - 1));
            } else if (nextWord.charAt(0) == '_' && nextWord.charAt(nextWord.length() - 2) == '_') {
                    newString = (newString + " " + nextWord.toUpperCase().substring(1, nextWord.length() - 2) + nextWord.charAt(nextWord.length() - 1));
            } else if (nextWord.charAt(0) == '#' && nextWord.charAt(nextWord.length() - 1) == '#') {
                newString = (newString + " " + nextWord.toLowerCase().substring(1, nextWord.length() - 1));
            } else if (nextWord.charAt(0) == '#' && nextWord.charAt(nextWord.length() - 2) == '#') {
                newString = (newString + " " + nextWord.toLowerCase().substring(1, nextWord.length() - 2) + nextWord.charAt(nextWord.length() - 1));
            } else {
                newString = (newString + " " + nextWord);
            }
        }

        /** in order to get rid of possible redundant spaces at the beginning, we add the trim() method */
        System.out.println(newString.trim());
    }
}