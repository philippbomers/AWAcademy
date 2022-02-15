package Philipp_Training.Philipp_Woche3.Arrays;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};

        // calculate minimum and maximum
        int min = input[0],
                max = input[0];

        for (int i : input) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.print(
                "Minimum: " + min +
                        "\nMaximum: " + max
        );
    }
}
