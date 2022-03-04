package Philipp_Training.Philipp_Woche5.day4;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class LottoGenerator {
    public static void main(String[] args) {
        int[] lottoNumbers = generateNumbers();
        for(int number : lottoNumbers){
            System.out.println("Ziehung : " + number);
        }
    }

    public static int[] generateNumbers(){
        int[] numberArray = new int[6];
        int number;
        boolean doubleNumber = false;
        //6 Zahlen 1-49
        for (int i = 0; i < 6; i++) {
            while(true){
                number = (int) (Math.random()*49);
                for(int oldNumber : numberArray){
                    if(number==oldNumber) doubleNumber=true;
                }
                if(!doubleNumber){
                    numberArray[i] = number;
                    break;
                }
                doubleNumber = false;
            }

        }

        return numberArray;
    }

}
