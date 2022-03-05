package Pia_Training.Pia_Grouptraining.Day3;

import java.util.Scanner;

public class Input_validation {
    public static void main(String[] args) {

        String error = "Eingabefehler";
        String correct = "Ok";

        System.out.println("Eingabe: ");
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();

        if (input.length() > 10) {
            System.out.println("Ausgabe: Eingabefehler");
        } else {
            System.out.println("Ausgabe: OK");
        }
        if (input.length() < 5) {
            System.out.println("Ausgabe: Eingabefehler");
        } else {
            System.out.println("Ausgabe: OK");
        }
        if (!input.contains("chen")) {
            System.out.println("Ausgabe: Eingabefehler");
        } else {
            System.out.println("Ausgabe: OK");
        }
        if (input.charAt(input.length()-1) == ':') {
            System.out.println("Ausgabe: OK");
        } else {
            System.out.println("Ausgabe: Eingabefehler");
        }
        if (input.length() >= 2) {
            if (Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1))) {
                System.out.println("Ausgabe: OK");
            } else System.out.println("Ausgabe: Eingabefehler");

        } else System.out.println("Länge der Eingabe nicht valide.");

        if (input.equals(input.toUpperCase())) {
            System.out.println("Ausgabe: OK");
        } else System.out.println("Ausgabe: Eingabefehler");

        System.out.println((input.length() < 3) ? correct : error);

        System.out.println(input.substring(0,2).matches("[0-9]*") ? correct : error);

        boolean a = input.contains("(") && input.contains(")");
        boolean b = input.indexOf("(") < input.indexOf(")");
        System.out.println((a && b) ? correct : error);
        }
    }



