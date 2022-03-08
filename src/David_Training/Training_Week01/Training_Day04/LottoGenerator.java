package David_Training.Training_Week01.Training_Day04;

import java.util.Arrays;

public class LottoGenerator {

    public static int[] generiereZahlen() {
        int[] lottoZahlen = new int[6];

        int index = 0;
        int zufallsZahl;
        boolean fertig = false;

        do {
            boolean enthalten = false;
            zufallsZahl = zufallsZahlVon1Bis49();
            for (int j = 0; j <= index; j++) {
                if (zufallsZahl == lottoZahlen[j]) {
                    enthalten = true;
                    break;
                }
            }

            if(!enthalten) {
                lottoZahlen[index] = zufallsZahl;
                index++;
            }

            if (index == 6) {
                fertig = true;
            }
        } while (!fertig);


        System.out.println("Die Lottozahlen für das Wochenende lauten: " + Arrays.toString(lottoZahlen));
        return lottoZahlen;

    }

    public static int zufallsZahlVon1Bis49() {
        return 1 + (int) (Math.random() * (49-1) + 1);
    }

}
