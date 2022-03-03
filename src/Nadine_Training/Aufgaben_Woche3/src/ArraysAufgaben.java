public class ArraysAufgaben {

    public static void main(String[] args) {

        //Durchlauf
        int[] array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int a : array){
            System.out.println(a);
        }

        //Summe

        int[] input = new int[] {1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int summe = 0;

        for(int i = 0; i < input.length; i++){

            summe += input[i];
        }
        System.out.println();
        System.out.println("Die Summe beträgt: " +summe);

        //Maximum und Minimum

        int maximum = 0;
        for(int k = 0; k < input.length; k++){

            if(input[k] >= maximum){
                maximum = input[k];
            }
        }
        System.out.println();
        System.out.println("Das Maximum beträgt: " +maximum);

        int minimum = 0;
        for(int j = 0; j < input.length; j++){
            if(input[j] <= minimum){
                minimum = input[j];
            }
        }
        System.out.println("Das Minimum beträgt: " + minimum);


    }
}
