package Elias_Training.Elias_Woche3.Arrays;

public class DurchlaufSummeMinMax {
    public static void main(String[] args) {

        trenner("Durchlauf");

        int numbers[] = new int[9];

        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = ((i)-9)*(-1);
        }

        for (int num : numbers
        ) {
            System.out.println(num);
        }



        trenner("Summe");
        int[] input = {1,4,5,7,20000,-511,100,-200,400};
        int result = 0;
        for (int number : input
        ) {
            result += number;
        }
        System.out.println(result);

        trenner("Min & Max");

        /*
        System.out.println(Arrays.stream(input).max());
        System.out.println(Arrays.stream(input).min());
        */

        int min = input[0];
        int max = input[0];
        for (int j : input) {
            if (min > j) min = j;
            else if (max < j) max = j;
        }
        System.out.println("Min: " + min + "\nMax: " + max);

    }



    public static void trenner(String text){
        System.out.println("_-_-_-_- "+text+" -_-_-_-_");
    }
}

