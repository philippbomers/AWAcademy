package Philipp_Training.Philipp_Woche7.Day2;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        System.out.println("removeFromArray(5, new int[]{4, 5, 1, 6, 4}) = " + Arrays.toString(removeFromArray(5, new int[]{4, 5, 1, 6, 4})));
        System.out.println("removeFromArray(5, new int[]{5, 5, 1, 6, 4}) = " + Arrays.toString(removeFromArray(5, new int[]{5, 5, 1, 6, 4})));
        try{
            System.out.println("removeFromArray(5, new int[]{6, 5, 5, 1, 6, 4}) = " + Arrays.toString(removeFromArray(5, new int[]{6, 5, 5, 1, 6, 4})));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private static int[] removeFromArray(int loescheZahl, int[] fuenfGanzeZahlen){
        if(fuenfGanzeZahlen.length != 5){
            throw new RuntimeException("Wir brauchen fünf ganze Zahlen");
        }
        return Arrays.stream(fuenfGanzeZahlen).filter(value -> value != loescheZahl).toArray();
    }
}
