package David_Training.Extra_Packages.ArrayHelper.TestPackage;

import David_Training.Extra_Packages.ArrayHelper.Standard.ArrayHelper;
import java.util.Arrays;

public class TestKlasse2 {
    public static void main(String[] args) {
        int[] intArrayBeispiel = new int[] {1, 2, 3, 4, 555, -123, 823, -4234, 57};

        int max = ArrayHelper.maxNumber(intArrayBeispiel);
        int min = ArrayHelper.minNumber(intArrayBeispiel);
        int sum = ArrayHelper.sumArray(intArrayBeispiel);

        System.out.println("intArrayBeispiel = " + Arrays.toString(intArrayBeispiel));
        System.out.println("max: " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }
}
