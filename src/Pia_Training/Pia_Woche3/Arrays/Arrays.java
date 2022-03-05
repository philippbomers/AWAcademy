package Pia_Training.Pia_Woche3.Arrays;

public class Arrays {
    public static void main(String[] args) {
        // DURCHLAUF
        int[] intNumbers = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int intNumber : intNumbers) {
            System.out.println(intNumber);
        }
        System.out.println("\n");

        //SUMME eines Arrays berechnen & MAXIMUM UND MINIMUM
        int[] sum = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int result = 0;
        int smallest = sum[0];
        int largest = sum[0];

        for (int j : sum) result += j;
        System.out.println("Summe: " + result);

        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > largest) largest = sum[i];
            if (sum[i] < smallest) smallest = sum[i];
        }
        System.out.println("Minimum: " + smallest);
        System.out.println("Maximum: " + largest);
        System.out.println("\n");

        // EIN-MAL-EINS (BONUSAUFGABE)
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [][] multiply = new int[10][10];

        for (int j = 1; j < numbers.length; j++) {
            for (int k = 1; k < numbers.length; k++) {
                if (j * k < 10) System.out.print(" ");
                if (j * k < 100) System.out.print(" ");
                System.out.print("  " + j * k);
            }
            System.out.println();
        }
    }
}

