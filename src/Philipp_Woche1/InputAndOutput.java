package Philipp_Woche1; /**
 * Aufgaben:
 * <p>
 * Schreibe ein Programm, welches einen vom Benutzer eingegebenen Text, z.B. seinen
 * Namen, mit einer Begrüßung ausgibt.
 * <p>
 * Wähle ein einfaches Ascii-Art von der Webseite https://www.asciiart.eu/. Gib dieses über ein
 * kleines Programm auf der Konsole aus.
 * <p>
 * Berechne zu zwei eingegebenen Werten “a” und “b” ein paar geometrische Kennzahlen.
 * ● Die Fläche und den Umfang eines Rechtecks.
 * ● Die Fläche und den Umfang eines rechtwinkligen Dreiecks.
 */

import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
        System.out.println("Hallo " + inputDialog("Bitte gib deinen Namen ein:") + ", herzlich Willkommen im Javakurs.");

        String asciiPicture = "  _________________________________\n" +
                " |.--------_--_------------_--__--.|\n" +
                " ||    /\\ |_)|_)|   /\\ | |(_ |_   ||\n" +
                " ;;`,_/``\\|__|__|__/``\\|_| _)|__ ,:|\n" +
                "((_(-,-----------.-.----------.-.)`)\n" +
                " \\__ )        ,'     `.        \\ _/\n" +
                " :  :        |_________|       :  :\n" +
                " |-'|       ,'-.-.--.-.`.      |`-|\n" +
                " |_.|      (( (*  )(*  )))     |._|\n" +
                " |  |       `.-`-'--`-'.'      |  |\n" +
                " |-'|        | ,-.-.-. |       |._|\n" +
                " |  |        |(|-|-|-|)|       |  |\n" +
                " :,':        |_`-'-'-'_|       ;`.;\n" +
                "  \\  \\     ,'           `.    /._/\n" +
                "   \\/ `._ /_______________\\_,'  /\n" +
                "    \\  / :   ___________   : \\,'\n" +
                "     `.| |  |           |  |,'\n" +
                "       `.|  |           |  |\n" +
                "         |  | SSt       |  |\n" +
                "https://www.asciiart.eu/television/futurama";

        System.out.println(escape(asciiPicture)+ "\n");

        double varA = Double.parseDouble(inputDialog("Wähle eine Größe für A"));
        double varB = Double.parseDouble(inputDialog("Wähle eine Größe für B"));

        System.out.println("a = "
                + varA +
                "\nb = "
                + varB +
                "\nFlächeninhalt des Rechtecks = "
                + varA * varB +
                "\nUmfang des Rechtecks = "
                + (2 * (varA + varB)) +
                "\nFlächeninhalt des rechtwinkligen Dreiecks = "
                + ((varA * varB) / 2) +
                "\nUmfang des rechtwinkligen Dreiecks = "
                + (varA + varB + (Math.sqrt((varA * varA) + (varB * varB)))));

    }

    /**
     * You can insert a question and it returns the answer
     */
    private static String inputDialog(String question) {
        Scanner scanUserName = new Scanner(System.in);
        System.out.println(question);
        return scanUserName.nextLine();
    }

    /**
     * Escape a give String to make it safe to be printed or stored.
     *
     * @param stringToEscape The input String.
     * @return The output String.
     **/
    public static String escape(String stringToEscape) {
        return stringToEscape.replace("\\", "\\\\")
                .replace("\"", "\\\"");
    }
}
