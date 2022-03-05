package Pia_Training.Pia_Grouptraining.Day4;

public class ArrayHelper {

    public static int maxNumber(int[] intArray) {
        int max = intArray[0];
        for (int number : intArray) {
            if (number > max) max = number;
        }
        return max;
    }

    public static int minNumber(int[] intArray) {
        int min = intArray[0];
        for (int number : intArray) {
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
