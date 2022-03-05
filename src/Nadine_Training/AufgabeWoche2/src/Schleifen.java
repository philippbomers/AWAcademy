import java.util.Scanner;

public class Schleifen {

    public static void main(String[] args) {

        //Zahlenraten
        int randomNumber = (int) (Math.random() * 99 + 1);
        int zah1 = randomNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Der Computer hat eine Zahl zwischen 0 - 100 gewählt." +
                "Bitte geben Sie Ihre Schätzung ein");
        int schätzung = scanner.nextInt();

        while (schätzung != zah1) {

            if (schätzung < zah1) {
                System.out.println("Die Schätzung war zu klein");
                System.out.println("Bitte eine neue Schätzung eingeben");
                schätzung = scanner.nextInt();

            } else if (schätzung > zah1) {
                System.out.println("Die Schätzung war zu groß");
                System.out.println("Bitte eine neue Schätzung eingeben");
                schätzung = scanner.nextInt();
            }
        }

        if (schätzung == zah1) {
            System.out.println("Herzlichen Glückwunsch, sie haben gewonnen!!!");
        }

        //Dreiecke
        System.out.println("Bitte die gewünschte Größe des Dreiecks eingeben");
        int groese = scanner.nextInt();
        System.out.println("Bitte die gewünschte Anzahl an Dreiecken eingeben");
        int anzahl = scanner.nextInt();

        for (int m = 0; m < anzahl; m++) {

            for (int i = 0; i < groese ; i++) {

                for(int k = 0; k <= i  ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        //Weihnachtsbaum

        System.out.println("Bitte die gewünschte Größe des Dreiecks eingeben");
        int groeseBaum = scanner.nextInt();

        for (int i = 1; i < groeseBaum + 1; i++) {

            for (int m = 1; m <= groeseBaum - i; m++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int m = 1; m <= (groeseBaum - 1); m++) {
            System.out.print(" ");
        }
        System.out.print("I");

    }
}


