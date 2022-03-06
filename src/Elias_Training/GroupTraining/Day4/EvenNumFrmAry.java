package Elias_Training.GroupTraining.Day4;

import Elias_Training.ConsoleColors;

import java.util.Arrays;

public class EvenNumFrmAry {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + Arrays.toString(getEvenNumber()));

    }

    /**
     * write a programm to find the even Numbers from array and to move them into another Array!
     * @return returns the String array of even numbers of the origin array
     */
    public static String[] getEvenNumber() {


        int[] numbers = {1, 8, 5, 7, 9, 56, 1997, 2016, 2022, 2021};

        String temp;
        StringBuilder stringBuilderTemp = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                temp = String.valueOf(numbers[i]);
                stringBuilderTemp.append(temp + " ");
            }
        }

        return stringBuilderTemp.toString().split(" ");

    }
}
