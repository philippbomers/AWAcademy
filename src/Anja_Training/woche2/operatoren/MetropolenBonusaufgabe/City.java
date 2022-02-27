package Anja_Training.woche2.operatoren.MetropolenBonusaufgabe;

public class City {
    /* Benötigte Informationen von Stadt:
     *   -> Name der Stadt
     *   -> Hauptstadt
     *   -> Einwohner
     *   -> Steuereinnahmen
     */

    //Eigenschaften
    private String nameCity;
    private boolean isCapital;
    private int populationNumber;
    private double taxRevenuePerPerson;


    // Konstruktor
    public City(String nameCity, boolean isCapital, int populationNumber, double taxRevenuePerPerson) {
        this.nameCity = nameCity;
        this.isCapital = isCapital;
        this.populationNumber = populationNumber;
        this.taxRevenuePerPerson = taxRevenuePerPerson;
    }

    //Methoden (optional)

    public void isMetropole() {
            /* Bedingung für Metropole:
                (isCaptial = true) && (populationNumber > 100 000)
                ||
                (populationNumber > 200 000) && (taxRevenuePerPerson >= 1 000 000 000)
             */

        String result;
        if (isCapital == true && populationNumber > 100000) {
            System.out.println(nameCity + " ist eine Metropole, denn sie ist eine Hauptstadt und hat " +
                    +populationNumber + " Einwohner");
        } else if (populationNumber > 200000 && taxRevenuePerPerson >= 100000000) {
            System.out.println(nameCity + " ist eine Metropole, denn sie hat " +
                    +populationNumber + " Einwohner und ein jährliches Steuereinkommen von " + taxRevenuePerPerson + "€");
        } else if (populationNumber > 200000 && taxRevenuePerPerson < 100000000) {
            double taxDiff = Math.round((1000000000 / populationNumber) - taxRevenuePerPerson);
            System.out.println(nameCity + " ist keine Metropole. Die Steuereinnahmen müssten pro Einwohner um " + taxDiff + "€ steigen, damit " + nameCity + " eine Metropole wird.");
        } else {
            System.out.println(nameCity + " ist keine Metropole.");
        }

    }

}

