package Anja_Training.woche3.arrays;

public class Durchlauf {
    public static void main(String[] args) {
        int[] result;

        result = new int[9];
        int index = 0;
        int count = 9;

        for(int i = 0; i < result.length; i++){
            result[i] = count;
            count--;
            System.out.println(result[i]);
        }
    }
}
