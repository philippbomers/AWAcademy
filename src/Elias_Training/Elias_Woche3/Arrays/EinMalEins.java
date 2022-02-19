package Elias_Training.Elias_Woche3.Arrays;

public class EinMalEins {
    public static void main(String[] args) {

        int[][] multiTabelle = new int[10][10];

        for (int zeile = 0; zeile < multiTabelle.length; zeile++){
            for (int spalte = 0; spalte < multiTabelle[zeile].length; spalte++){
                multiTabelle[zeile][spalte] = (zeile+1) * (spalte+1);
                System.out.printf("%d\t",multiTabelle[zeile][spalte]);
            }
            System.out.printf("%n");

        }

    }
}
