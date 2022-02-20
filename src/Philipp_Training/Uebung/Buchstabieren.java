package Philipp_Training.Uebung;

import java.util.Scanner;

public class Buchstabieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String name = "";
        while (true) {
            System.out.println("Bitte gib den nächsten Buchstaben ein:");
            input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.length() <= 1) {
                name += input;
            } else {
                System.out.println("Bitte nur eine Buchstabe eingeben !");
                return;
            }
        }
        System.out.println("Der Name ist: " + name);
    }
}