package Pia_Training.Pia_Grouptraining.Day4;

public class Arrays {
    public static void main(String[] args) {

        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int result = 0;

        for (int j = 0; j < input.length; j++) {
            int i = input[j];
            result += i;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest) {
                largest = input[i];
            }
            if (input[i] < smallest) {
                smallest = input[i];
            }
        }
        System.out.println("Summe: " + result);
        System.out.println("Minimalwert: " + smallest);
        System.out.println("Maximalwert: " + largest);
        System.out.println("\n");

        for (int i : input) {
            result += i;
        }
        for (int item : input) {
            if (item > largest) {
                largest = item;
            }
            if (item < smallest) {
                smallest = item;
            }
            }
            System.out.println("Summe: " + result);
            System.out.println("Minimalwert: " + smallest);
            System.out.println("Maximalwert: " + largest);
            System.out.println("\n");

            //Bonusaufgabe
        System.out.println("Gib nur die geraden Zahlen aus:");
        int [] evenNumbers;
        int count = 0;
        for (int item : input)
            if (item % 2 == 0)
                    count++;

        int index = 0;
        evenNumbers = new int [count];
        for (int item : input)
            if (item % 2 == 0) {
                evenNumbers[index]=item;
                index++;
            }
        for (int item : evenNumbers) {
            System.out.print(item + ", ");
        }
    }
}

