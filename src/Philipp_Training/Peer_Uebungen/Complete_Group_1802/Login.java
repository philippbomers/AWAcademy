package Philipp_Training.Peer_Uebungen.Complete_Group_1802;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String name = "David";
        String name1 = "Peter";

        System.out.println("Bitte gib deinen Namen ein: ");
        Scanner scanner = new Scanner(System.in);
        String loginName = scanner.nextLine();

        System.out.println("Bitte gib dein Passwort ein:");
        String kennwort = scanner.nextLine();
        String gesetztesKennwort = "12345";
        String gesetztesKennwort1 = "abcde";

        if (name.toLowerCase(Locale.ROOT).equals(loginName) && kennwort.equals(gesetztesKennwort)) {
            System.out.println("Hallo David.");
        } else if (name1.toLowerCase(Locale.ROOT).equals(loginName) && kennwort.equals(gesetztesKennwort1)) {
            System.out.println("Hallo Peter.");
        } else {
            System.out.println("Achtung: Hackerangriff!");
        }

    }
}
