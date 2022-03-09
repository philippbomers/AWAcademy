package Philipp_Training.Philipp_Woche6.Day2.Checkpoint;

import java.util.Objects;

public class DampfSchiffFahrt {

    public static void main(String[] args) {
        String[] stringArray = dampfSchiffFahrtArray();
        for (String string : stringArray) {
            System.out.println(string);
        }
    }

    private static String[] dampfSchiffFahrtArray() {
        String[] result = new String[100];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result[index] = "Schiff";

                if (i % 2 == 0) {
                    result[index] = "Dampf" + result[index];
                }

                if (i % 5 == 0) {
                    result[index] = result[index] + "Fahrt";
                }

                if (Objects.equals(result[index], "Schiff")) {
                    result[index] = WriteOutNumbers.zahlZuWort(i);
                }
            } else {
                result[index] = WriteOutNumbers.zahlZuWort(i);
            }
            index++;
        }

        return result;
    }
}
