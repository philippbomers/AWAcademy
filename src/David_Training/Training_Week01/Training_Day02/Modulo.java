package David_Training.Training_Week01.Training_Day02;

import java.util.ArrayList;

public class Modulo {
    public static void main(String[] args) {
        for (int i = 0; i <44; i++) {
            if (i % 2 == 0) {
                System.out.println("Die Zahl " + i + " ist gerade!");
            } else {
                System.out.println("Die Zahl " + i + " ist gerade!");
            }
        }

        // Aufgabe 2

        ArrayList<Object> list = new ArrayList<>();

        for (int j = 0; j<1000; j++) {
            int rest = j%5;
            if (!list.contains(rest)) {
                list.add(rest);
            }
        }

        for(Object x : list) {
            System.out.println(x);
        }

    }
}
