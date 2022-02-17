package Christian_Training.Christian_Woche2.Loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = (int) (Math.random() * 99) + 1;

        while (true) {
            System.out.println("Rate Mal an welche Zahl ich denke!");
            int rate = scanner.nextInt();
            if (rate < zahl) {
                System.out.println("Leider zu KLEIN, versuch es nochmal.");
            } else if (rate > zahl) {
                System.out.println("Leider zu GROSS, versuch es nochmal.");
            } else if (rate == zahl) {
                break;
            }
        }
        System.out.println("Herzlichen Glückwunsch, " + zahl + " war richtig!");

    }
}

