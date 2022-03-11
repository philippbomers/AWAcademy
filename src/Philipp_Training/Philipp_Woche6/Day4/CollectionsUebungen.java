package Philipp_Training.Philipp_Woche6.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUebungen {
    public static void main(String[] args) {
        List<Integer> ganzeZahlen = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            ganzeZahlen.add(i);
        }
        System.out.println("Max: " + getMaximum(ganzeZahlen));
        System.out.println("Max: " + getMaximum2(ganzeZahlen));
        System.out.print("Even:");
        for (Integer number : geradeZahlen(ganzeZahlen)) {
            System.out.print(" " + number);
        }
    }

    private static int getMaximum(List<Integer> inputList) {
        if (inputList.stream().max(Integer::compareTo).flatMap(Integer::describeConstable).isPresent()) {
            return inputList.stream().max(Integer::compareTo).get();
        } else {
            return 0;
        }
    }

    private static int getMaximum2(List<Integer> inputList) {
        return Collections.max(inputList);
    }

    private static List<Integer> geradeZahlen(List<Integer> inputList) {
        inputList.removeIf(number -> number % 2 != 0);
        return inputList;

        // Alternative: Neue Liste erstellen
        // List<Integer> newList = inputList.stream().filter(number -> number % 2 != 0).toList();
    }
}
