package Philipp_Training.Philipp_Woche3.Arrays;

public class PassThrough {
    public static void main(String[] args) {
        Integer[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i : numbers) {
            if (i != numbers[0]) System.out.print(", ");
            System.out.print(i);
        }
    }
}
