package Anja_Training.woche3.arrays;

public class EinMalEins {
    public static void main(String[] args) {
        int[][] einMalEins = new int[10][10];

        for(int zeile = 0; zeile < einMalEins.length; zeile++){

            for(int spalte = 0; spalte < einMalEins[zeile].length; spalte++){
                einMalEins[zeile][spalte] = (spalte +1) * (zeile + 1);
                //System.out.print(einMalEins[zeile][spalte] + "\t");
                System.out.printf("%4d",  einMalEins[zeile][spalte]);

            }
            System.out.println();

        }
    }
}
