package Anja_Training.woche1;

import java.util.Scanner;

public class EingabenAusgaben {
    public static void doEingabenAusgaben() {
        //Text abfragen und ausgeben

        Scanner scanner = new Scanner(System.in);

        System.out.println(" \nLösung Text abfragen und ausgeben: \n");
        System.out.println("Bitte gib deinen Namen ein: ");
        String name = scanner.next();
        System.out.println("Hallo " + name + ", herzlich Wilkommen in Javakurs.");

        //Textausgabe formatieren
        // Quelle: ASCII Art Archive: Home--> Animals --> Reptiles --> Turtles

        System.out.println("\nLösung Textausgabe formatieren: \n");
        System.out.println("                             ___-------___\n" +
                "                         _-~~             ~~-_ \n" +
                "                      _-~                    /~-_\n"+
                "   /^\\__/^\\         /~  \\                   /    \\ \n" +
                " /|  O|| O|        /      \\_______________/        \\ \n" +
                "| |___||__|      /       /                \\          \\ \n"+
                "|          \\    /      /                    \\          \\ \n"+
                "|   (_______) /______/                        \\_________ \\ \n"+
                "|         / /         \\                      /            \\ \n"+
                " \\         \\^\\\\         \\                  /               \\     /\n"+
                "   \\         ||           \\______________/      _-_       //\\__//\n"+
                "     \\       ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\n"+
                "       ~-----||====/~     |==================|       |/~~~~~\n"+
                "        (_(__/  ./     /                    \\_\\      \\.\n"+
                "               (_(___/                         \\_____)_)\n"
                );

        //Geometrie
        float a, b;
        double c, result;

        System.out.println("Geometrieaufgabe: \n");

        //Eingabe Rechteck
        System.out.println("Bitte Breite des Rechtecks in cm eingeben: ");
        a = scanner.nextFloat();
        System.out.println("Bitte Länge des Rechtecks in cm eingeben: ");
        b = scanner.nextFloat();

        //Berechnung Rechteck
        result = Math.round(100.0 *a*b) /100.0;
        System.out.println("Die Fläche des Rechtecks beträgt: " + result + " cm²");
        result = Math.round(100.0*(a*2 + b*2))/100.0;
        System.out.println("Der Umfang des Rechtecks beträgt: " + result + " cm \n");

        //Eingabe Dreieck
        System.out.println("Bitte Kathete1 des rechtwinkligen Dreiecks in cm eingeben: ");
        a = scanner.nextFloat();
        System.out.println("Bitte Kathete2 des rechtwinkligen Dreiecks in cm eingeben: ");
        b = scanner.nextFloat();

        //Berechnung Dreieck
        result = Math.round(100.0*((a*b)/2))/100.0;
        System.out.println("Die Fläche des Dreiecks beträgt: " + result + " cm²");
        c = Math.sqrt(a*a + b*b);
        result = Math.round(100.0*(a + b + c))/100.0;
        System.out.println("Der Umfang des Dreiecks beträgt: " + result + " cm");
    }
}