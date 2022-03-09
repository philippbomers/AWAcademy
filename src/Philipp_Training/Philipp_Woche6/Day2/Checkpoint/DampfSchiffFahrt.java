package Philipp_Training.Philipp_Woche6.Day2.Checkpoint;

import java.util.Objects;

public class DampfSchiffFahrt {

    public static void main(String[] args) {
        //Schreibe ein Programm, das für alle Zahlen von 1 bis einschließlich 100 jeweils eine Zeile nach folgender Regel ausgibt:
        String[] stringArray = dampfSchiffFahrtArray();
        for (String string : stringArray) {
            System.out.println(string);
        }
    }

    private static String[] dampfSchiffFahrtArray() {
        String[] result = new String[100];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            //Falls die Zahl durch 2, 3 und 5 teilbar ist, gib “DampfSchiffFahrt” aus.
            if (i % 3 == 0) {
                result[index] = "Schiff";

                //Falls die Zahl durch 2 und 3, jedoch nicht durch 5 teilbar ist, gib “DampfSchiff" aus.
                if (i % 2 == 0) {
                    result[index] = "Dampf" + result[index];
                }

                //Falls die Zahl durch 3 und 5, jedoch nicht durch 2 teilbar ist, gib “SchiffFahrt” aus.
                if (i % 5 == 0) {
                    result[index] = result[index] + "Fahrt";
                }

                if (Objects.equals(result[index], "Schiff")) {
                    result[index] = WriteOutNumbers.zahlZuWort(i);
                }
            } else {
                //Andernfalls gib die Zahl aus.
                result[index] = WriteOutNumbers.zahlZuWort(i);
            }
            index++;
        }

        return result;
    }
}
