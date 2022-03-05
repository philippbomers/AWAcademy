package Pia_Training.Pia_Grouptraining.Day3;

import java.util.Arrays;

public class Zeichenketten_Wiederholung {
    public static void main(String[] args) {
        //Aufgabe 1: Ausgabe rückwärts
        char[] zeichenKette = {'J', 'a', 'v', 'a', '-', 'K', 'u', 'r', 's'};
        for (int i = zeichenKette.length - 1; i >= 0; i--) {
                System.out.println(zeichenKette[i]);
            }
        //Aufgabe 2: Jedes zweite Zeichen ausgeben
        for (int i=0;i<zeichenKette.length;i += 2) { //i = i+2
            System.out.println(zeichenKette[i]);
        }
        //Aufgabe 3: char-Array in String konvertieren
        String str = new String(zeichenKette);
        System.out.println(str);

        //Aufgabe 4: Beliebiger String in char-Array konvertieren
        String randomString = "Guten Morgen";
        char[] chars = randomString.toCharArray();
        System.out.println(Arrays.toString(chars));

        //Aufgabe 5: String in ein int-Array konvertieren
        String str2 = "1,2,4,9,8,7,6,4,1";
        String[] strings = str2.split(",");
        int [] numbers = new int[strings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        System.out.println("\n"+ Arrays.toString(numbers));
        }
    }

