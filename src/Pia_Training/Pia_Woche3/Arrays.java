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

        for (int j : sum) {
            result += j;
        }
        System.out.println("Summe: " + result);

        for (int value : sum) {
            if (value > largest) largest = value;
            if (value < smallest) smallest = value;
        }
        System.out.println("Minimum: " + smallest);
        System.out.println("Maximum: " + largest);
        System.out.println("\n");

        // EIN-MAL-EINS (BONUSAUFGABE)
        int[][] multiply = new int[10][10];

        for (int j = 0; j < multiply.length; j++) {
            for (int k = 0; k < multiply.length; k++) {
                multiply[j][k] = (j + 1) * (k + 1);
            }
        }
        for (int[] spalte : multiply) {
            for (int zeile : spalte) {
                System.out.printf("%4s", zeile);
            }
            System.out.println();
        }
    }
}

