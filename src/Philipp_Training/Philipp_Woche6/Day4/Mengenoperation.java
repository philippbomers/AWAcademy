package Philipp_Training.Philipp_Woche6.Day4;

import java.util.*;

public class Mengenoperation {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> listB = Arrays.asList(4, 5, 6, 7, 8, 9);
        System.out.println(vereinigung(listA, listB));
        System.out.println(schnittmenge(listA, listB));
        System.out.println(symmetrischeDifferenz(listA, listB));
    }

    private static List<Integer> vereinigung(List<Integer> listA, List<Integer> listB) {
        List<Integer> newList = new ArrayList<>();
        for (Integer entryListA : listA) {
            for (Integer entryListB : listB) {
                if (!newList.contains(entryListA)) {
                    newList.add(entryListA);
                }
                if (!newList.contains(entryListB)) {
                    newList.add(entryListB);
                }
            }
        }
        Collections.sort(newList);
        return newList;
    }

    private static List<Integer> schnittmenge(List<Integer> listA, List<Integer> listB) {
        List<Integer> newList = new ArrayList<>();
        for (Integer entryListA : listA) {
            for (Integer entryListB : listB) {
                if (!newList.contains(entryListA) && (Objects.equals(entryListA, entryListB))) {
                    newList.add(entryListA);
                }
            }
        }
        Collections.sort(newList);
        return newList;
    }

    private static List<Integer> symmetrischeDifferenz(List<Integer> listA, List<Integer> listB) {
        List<Integer> oldList = vereinigung(listA, listB);
        List<Integer> newList = new ArrayList<>();
        for (Integer entry : oldList) {
            if (!listA.contains(entry) && !listB.contains(entry)) {
                newList.add(entry);
            }
        }
        Collections.sort(newList);
        return newList;
    }
}
