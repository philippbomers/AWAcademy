package Anja_Training.woche2.operatoren.MetropolenBonusaufgabe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Bedingung für Metropole:
         *   (isCaptial = true) && (populationNumber > 100 000)
         *   ||
         *   (populationNumber > 200 000) && (taxRevenuePerPerson >= 1 000 000 000)
         */
        Scanner scanner = new Scanner(System.in);

        /* Erstellen einer Array Liste für mehrere Städte
        *   Dauerschleife für Input
        * */
        ArrayList<City> cities = new ArrayList<>();
        boolean activeInput = true;
        while (activeInput) {
            System.out.println(
                    "Möchten Sie eine Stadt eingeben bitte 1 eingeben.\n" +
                            "Wenn Sie keine weitere Stadt mehr eingeben möchten geben Sie die 2 ein zum beenden und auswerten");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Name der Stadt lautet: ");
                    String nameCity1 = scanner.next();

                    System.out.println("Ist " + nameCity1 + " eine Hauptstadt? (Pls enter true or false)");
                    boolean isCapital1 = scanner.nextBoolean();

                    System.out.println("Wieivel Einwohner hat " + nameCity1 + "?");
                    int populationNumber1 = scanner.nextInt();

                    System.out.println("Steuereinnahmen pro Einwohner: ");
                    double taxRevenuePerPerson1 = scanner.nextDouble();

                    cities.add(new City(nameCity1, isCapital1, populationNumber1, taxRevenuePerPerson1));
                    break;
                case 2:
                    activeInput = false;
                    break;

                default:
                    System.out.println("Eingabe fehlerhaft! Versuchen Sie es erneut");
                    continue;
            }
        }

        // Nach Abbruch Ausgabe der Liste mit Städten
        for (City c : cities) {
            c.isMetropole();
        }

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name der Stadt lautet: ");
        String nameCity1 = scanner.next();

        System.out.println("Ist " + nameCity1 + " eine Hauptstadt? (Pls enter true or false)");
        boolean isCapital1 = scanner.nextBoolean();

        System.out.println("Wieivel Einwohner hat " + nameCity1 + "?");
        int populationNumber1 = scanner.nextInt();

        System.out.println("Steuereinnahmen pro Einwohner: ");
        double taxRevenuePerPerson1 = scanner.nextDouble();

        City metropole = new City(nameCity1, isCapital1, populationNumber1, taxRevenuePerPerson1);

        if(metropole. == true){
        System.out.println(nameCity1 + " ist eine Metropole, denn sie ist eine Hauptstadt und hat "
                            + populationNumber1 + "Einwohner");
        } else if(){
            System.out.println(nameCity1 + " ist eine Metropole, denn sie hat " + populationNumber1 +
                                " Einwohner und ein jährliches Steuereinkommen von " + taxRevenuePerPerson1);
        }else{
            System.out.println(nameCity1 + " ist keine Metropole.");
        }
*/

    }
}
