package Philipp_Training.Philipp_Woche5.day4;

public class ArrayHelper {

    public static int maxNumber(int[] integerArray) {
        int max = integerArray[0];
        for (int number : integerArray) {
            if (number > max) max = number;
        }
        return max;
    }

    public static int minNumber(int[] integerArray) {
        int min = integerArray[0];
        for (int number : integerArray) {
            if (number < min) min = number;
        }
        return min;
    }

    public static int sum(int[] integerArray) {
        int sum = 0;
        for (int number : integerArray) {
            sum += number;
        }
        return sum;
    }
}
