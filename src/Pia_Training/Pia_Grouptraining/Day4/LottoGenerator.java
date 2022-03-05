package Pia_Training.Pia_Grouptraining.Day4;

import java.util.Arrays;

public class LottoGenerator {

    public static int[] generiereZahlen() {
        int[] arrayLotto = new int[6];
        boolean numberTwice;
        int randomNumber;
        for (int i = 0; i < arrayLotto.length; i++) {
            numberTwice = false;
            randomNumber = (int) (Math.random() * 49 + 1); //i=2
            for (int pulledNumber : arrayLotto) {
                if (randomNumber == pulledNumber) {
                    numberTwice = true;
                    i--;//5,28,0000
                    break;
                }
                if (!numberTwice) {
                    arrayLotto[i] = randomNumber;
                }

            }
        }
        return arrayLotto;
    }


    public static void main(String[] args) {
        generiereZahlen();
        System.out.println(Arrays.toString(generiereZahlen()));
    }
}





