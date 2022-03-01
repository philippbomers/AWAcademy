package Philipp_Training.Peer_Uebungen.Complete_Group_2502;

import java.util.Arrays;

public class ArrayZahlen {
    public static void main(String[] args) {
        int[] zahlenArray = {3, 7, 1, 12, 2};
        sortieren(zahlenArray);
    }

    public static void sortieren(int[] beispielArray) {
        int platzhalter;
        for (int k = 1; k < beispielArray.length; k++) {
            for (int i = 0; i < beispielArray.length - k; i++) {
                if (beispielArray[i] > beispielArray[i + 1]) {
                    platzhalter = beispielArray[i];
                    beispielArray[i] = beispielArray[i + 1];
                    beispielArray[i + 1] = platzhalter;
                }
            }
        }
        System.out.println(Arrays.toString(beispielArray));
    }

}
