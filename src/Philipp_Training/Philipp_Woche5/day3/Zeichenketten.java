package Philipp_Training.Philipp_Woche5.day3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Zeichenketten {
    public static void main(String[] args) {

        char[] zeichenKette = {'J','a','v','a','-','K','u','r','s'};
        char[] zahlenArray = {'5','6','1'};

        System.out.println("zeichenKette = " + Arrays.toString(backward(zeichenKette)));
        System.out.println("backward(zeichenKette) = " + backwardString(zeichenKette));
        System.out.println("zeichenKette = " + everySecondCharString(zeichenKette));
        System.out.println("zeichenKette = " + charArrayToString(zeichenKette));
        System.out.println("zeichenKette = " + Arrays.toString(charArrayToInt(zahlenArray)));

    }

    public static char[] backward(char[] zeichenKette){
        char [] backward = new char[zeichenKette.length];
        int x = zeichenKette.length-1;
        for (char letter : zeichenKette){
            backward[x--]=letter;
        }
        return backward;
    }

    public static String backwardString(char[] zeichenKette){
        String backward = "";
        for (char letter : zeichenKette){
            backward = letter+backward;
        }
        return backward;
    }

    public static String everySecondCharString(char[] zeichenKette){
        String everySecondChar= "";
        for (int i=0; i < zeichenKette.length; i+=2){
            everySecondChar += zeichenKette[i];
        }
        return everySecondChar;
    }

    public static String charArrayToString(char[] charArray){
        String result = "";
        for (char letter : charArray){
            result += letter;
        }
        return result;
    }

    public static int[] charArrayToInt(char[] charArray){
        int[] result = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            result[i] = charArray[i];
        }
        return result;
    }
}
