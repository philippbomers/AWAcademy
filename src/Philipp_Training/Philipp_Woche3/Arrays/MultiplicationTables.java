package Philipp_Training.Philipp_Woche3.Arrays;

public class MultiplicationTables {
    public static void main(String[] args) {

        // create Array with all values
        int[][] multiplicationTable = new int[10][10];
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int line = 0; line < multiplicationTable.length; line++) {
                multiplicationTable[row][line] = (row + 1) * (line + 1);
            }
        }

        // print out table
        for (int[] i : multiplicationTable) {
            for (int n : i) System.out.printf("%4s", n);
            System.out.printf("%n");
        }
    }
}
