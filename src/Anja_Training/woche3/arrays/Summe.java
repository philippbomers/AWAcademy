package Anja_Training.woche3.arrays;

public class Summe {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            result += input[i];
        }
        System.out.println("Die Summe des Arrays beträgt: " + result);

        MaxMin(input);
    }

    public static void MaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Der Maximalwert im Array ist: " + max);
        System.out.println("Der Minimalwert im Array ist: " + min);
    }

}
