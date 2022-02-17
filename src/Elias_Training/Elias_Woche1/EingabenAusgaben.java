package Elias_Training.Elias_Woche1;

import java.util.Scanner;

public class EingabenAusgaben {
    public static void main(String[] args) {
        System.out.println(trenner("Text abfragen und ausgeben"));
        System.out.println(echo());

        System.out.println(trenner("Textausgabe formatieren"));
        System.out.println(asciiArt("        _...----.._\n" +
                "     ,:':::::.     `>.\n" +
                "   ,' |:::::;'     |:::.\n" +
                "  /    `'::'       :::::\\\n" +
                " /         _____     `::;\\\n" +
                ":         /:::::\\      `  :\n" +
                "| ,.     /::SSt::\\        |\n" +
                "|;:::.   `::::::;'        |\n" +
                "::::::     `::;'      ,.  ;\n" +
                " \\:::'              ,::::/\n" +
                "  \\                 \\:::/\n" +
                "   `.     ,:.        :;'\n" +
                "     `-.::::::..  _.''\n" +
                "        ```----'''\n\nFußball-Weltmeisterschaft 2022"));

        System.out.println(trenner("Geometrie"));
        rechteck(2, 4);
        rechtwinkligesDreieck(2, 3);

    }


    public static String trenner(String text) {
        return "-_-_-_" + text + "_-_-_-\n";
    }

    public static String echo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();
        return "Hallo " + name + ", herzlich Willkommen in Javakurs!\n";
    }

    public static String asciiArt(String eingabe) {
        return eingabe + "\n";
    }

    public static void rechteck(int a, int b) {
        float flaeche = a * b;
        float umfang = (a + b) * 2;
        System.out.println("---Rechteck---\nFläche: " + flaeche + "\nUmfang: " + umfang);
    }

    public static void rechtwinkligesDreieck(int a, int b) {
        float flaeche = (a * b) / 2.0F;
        float hypotenuse = (float) Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));
        float umfang = (a + b + hypotenuse);
        System.out.println("---Rechtwinkliges Dreieck---\nFläche: " + flaeche + "\nHypotenuse: " + hypotenuse + "\nUmfang: " + umfang);
    }
}
