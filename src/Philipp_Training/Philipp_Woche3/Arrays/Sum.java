package Philipp_Training.Philipp_Woche3.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] input = new int[]{1,4,5,7,20000,-511,100,-200,400};
        int sum = 0;
        for (int i : input) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
