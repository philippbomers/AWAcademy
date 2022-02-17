package Philipp_Training.Philipp_Woche3.Arrays;

public class PassThrough {
    public static void main(String[] args) {

        // create Array with counting down
        int startNumber = 9;
        Integer[] numbers = new Integer[startNumber];
        for(int i=0; i<startNumber; i++){
            numbers[i] = startNumber-i;
        }

        // Print out array
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
