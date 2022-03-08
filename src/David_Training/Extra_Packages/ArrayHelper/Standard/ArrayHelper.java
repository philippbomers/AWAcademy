package David_Training.Extra_Packages.ArrayHelper.Standard;

import java.util.Arrays;

public class ArrayHelper {

    public static int maxNumber(int[] intArray) {
        int max = Integer.MIN_VALUE;

        for (int item : intArray) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    public static int minNumber(int[] intArray) {
        int min = Integer.MAX_VALUE;

        for (int item : intArray) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    public static int sumArray(int[] intArray) {
        int sum = 0;

        for (int item : intArray) {
            sum += item;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] intArrayBeispiel = new int[] {1, 2, 3, 4, 555, -123, 823, -4234, 57};

        int max = maxNumber(intArrayBeispiel);
        int min = minNumber(intArrayBeispiel);
        int sum = sumArray(intArrayBeispiel);

        System.out.println("intArrayBeispiel = " + Arrays.toString(intArrayBeispiel));
        System.out.println("max: " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }

}
