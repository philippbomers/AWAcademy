package Mehmet_Training.Mehmet_Woche3.src;

public class Arrays2 {
    public static void main(String[] args) {
        //Aufgabe: Durchlauf
        System.out.println("Aufgabe: Durchlauf");
        int[] intArray = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int element : intArray) {
            System.out.println(element);
        }
        System.out.println();

        //Aufgabe: Summe
        System.out.println("Aufgabe: Summe");
        int summe = 0;
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        for (int element : input) {
            summe += element;
        }
        System.out.println("Summe der Elemente im Array ist: " + summe);
        System.out.println();

        //Aufgabe: Maximum und Minimum
        System.out.println("Aufgabe: Maximum und Minimum");
        int minArray = input[0]; //Initialisierung des Min-werts als erstes Element des Arrays
        int maxArray = input[0]; //Initialisierung des Max-werts als erstes Element des Arrays
        for (int element : input) { //Aktualisieren der max. und min. Werte, indem alle Elemente im Array durchlaufen werden
            if (element < minArray) {
                minArray = element;
            } else if (element > maxArray) {
                maxArray = element;
            }
        }
        System.out.println("Min-Wert im Array ist: " + minArray);
        System.out.println("Max-Wert im Array ist: " + maxArray);
        System.out.println();

        //Aufgabe: Ein-Mal-Eins (Bonusaufgabe)
        System.out.println("Aufgabe: Ein-Mal-Eins");
        int[] arrayX = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayY = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] einmalEins = new int[arrayX.length][arrayY.length];
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayY.length; j++) {
                einmalEins[i][j] = arrayX[i] * arrayY[j];
                System.out.printf("%4d", einmalEins[i][j]); //Eine ordentliche Tabelle, in der jeder Wert abgesehen von
            }                                               //tatsächlicher Länge genau vier Stellen besetzen.
            System.out.println();
        }
    }
}
