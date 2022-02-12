package Christian_Training.Christian_Woche2.Loops;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groß sollen deine Dreiecke sein?");
        int hoehe = scanner.nextInt();
        System.out.println("Wieviele von diesen Dreiecken möchtest du zeichnen? ");
        int zahl = scanner.nextInt();

        for (int i = 0; i < zahl; i++ ) {
            for (int j = 0; j <= hoehe; j++){
                String zeile = "";
                for (int x = 0; x < j; x++){
                    zeile += "*";
                }
                System.out.println(zeile);
            }
        }
    }
}
