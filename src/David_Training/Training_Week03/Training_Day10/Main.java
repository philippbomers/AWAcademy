package David_Training.Training_Week03.Training_Day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(checkArray(5, integerArrayList));
    }

    public static ArrayList<Integer> checkArray(int number, ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> returnArrayList = new ArrayList<>();
        for (Integer integer : integerArrayList) {
            if (!(integer == number)) {
                returnArrayList.add(integer);
            }
        }
        return returnArrayList;
    }

}
