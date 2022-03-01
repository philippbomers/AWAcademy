import java.util.Scanner;

public class EingabenAusgaben {

    public static void main(String args[]) {
        //Aufgabe: Text abfragen und ausgeben
        System.out.println("Lösung zur ersten Aufgabe" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = input.nextLine();
        System.out.println("Hallo " + name + ", herzlich Willkommen in Javakurs.");

        //Aufgabe: Textausgabe formatieren
        System.out.println("\n" + "Lösung zur zweiten Aufgabe" + "\n");
        System.out.println("       .-\"-.            .-\"-.            .-\"-.           .-\"-.\n" +
                "     _/_-.-_\\_        _/.-.-.\\_        _/.-.-.\\_       _/.-.-.\\_\n" +
                "    / __} {__ \\      /|( o o )|\\      ( ( o o ) )     ( ( o o ) )\n" +
                "   / //  \"  \\\\ \\    | //  \"  \\\\ |      |/  \"  \\|       |/  \"  \\|\n" +
                "  / / \\'---'/ \\ \\  / / \\'---'/ \\ \\      \\'/^\\'/         \\ .-. /\n" +
                "  \\ \\_/`\"\"\"`\\_/ /  \\ \\_/`\"\"\"`\\_/ /      /`\\ /`\\         /`\"\"\"`\\\n" +
                "   \\           /    \\           /      /  /|\\  \\       /       \\");


        //Aufgabe: Geometrie
        System.out.println("\n" + "Lösung zur dritten Aufgabe" + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Länge in cm ein: ");
        int a = sc.nextInt();
        System.out.print("Geben Sie die Höhe in cm ein: ");
        int b = sc.nextInt();
        int flaecheRechteck = a * b;
        int umfangRechteck = 2 * (a + b);
        double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        int flaecheDreieck = a * b / 2;
        double umfangDreieck = a + b + c;
        System.out.println("Fläche eines Rechtecks mit den gegebenen Massen ist " + flaecheRechteck + " cm2");
        System.out.println("Umfang eines Rechtecks mit den gegebenen Massen ist " +umfangRechteck + " cm");
        System.out.println("Fläche eines rechtwinkligen Dreiecks mit den gegebenen Massen ist " + flaecheDreieck + " cm2");
        System.out.println("Umfang eines rechtwinkligen Dreiecks mit den gegebenen Massen ist " + umfangDreieck + " cm");
    }
}