package Philipp_Training.Philipp_Woche1;

import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
        System.out.println("Hallo " + inputDialog("Bitte gib deinen Namen ein:") + ", herzlich Willkommen im Javakurs.");

        String asciiPicture = """
                  _________________________________
                 |.--------_--_------------_--__--.|
                 ||    /\\ |_)|_)|   /\\ | |(_ |_   ||
                 ;;`,_/``\\|__|__|__/``\\|_| _)|__ ,:|
                ((_(-,-----------.-.----------.-.)`)
                 \\__ )        ,'     `.        \\ _/
                 :  :        |_________|       :  :
                 |-'|       ,'-.-.--.-.`.      |`-|
                 |_.|      (( (*  )(*  )))     |._|
                 |  |       `.-`-'--`-'.'      |  |
                 |-'|        | ,-.-.-. |       |._|
                 |  |        |(|-|-|-|)|       |  |
                 :,':        |_`-'-'-'_|       ;`.;
                  \\  \\     ,'           `.    /._/
                   \\/ `._ /_______________\\_,'  /
                    \\  / :   ___________   : \\,'
                     `.| |  |           |  |,'
                       `.|  |           |  |
                         |  | SSt       |  |
                https://www.asciiart.eu/television/futurama""";

        System.out.println(escape(asciiPicture) + "\n");

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
