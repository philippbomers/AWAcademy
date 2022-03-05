package Philipp_Training.Philipp_Woche5.day3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl ein:");
        switch (Integer.parseInt(input.nextLine())) {
            case 1 -> System.out.println("Black");
            case 2 -> System.out.println("White");
            case 3 -> System.out.println("Red");
            case 4 -> System.out.println("Green");
            default -> System.out.println("Error");
        }

        System.out.println("Bitte gib einen Buchstaben ein:");
        switch (input.nextLine().charAt(0)) {
            case 'a' -> System.out.println("Black");
            case 'b', 'w', 'W', 'v' -> System.out.println("White");
            case 'c' -> System.out.println("Red");
            case 'd' -> System.out.println("Green");
            default -> System.out.println("Error");
        }


        System.out.println();
        char input1 = 'b';
        switch (input1){
            case 'a':
                System.out.println("Airplane");
                break;
            case 'b':
                System.out.println("Car");
            case 'c':
                System.out.println("Boat");
                break;
        }

        System.out.println();

        System.out.println("Please enter your choice (1-4): ");

        switch ((new Scanner(System.in)).nextInt()) {
            case 1 -> System.out.println("You selected 1");
            case 2, 3 -> System.out.println("You selected 2 or 3");
            case 4 -> System.out.println("You selected 4");
            default -> System.out.println("Please enter a choice between 1-4");
        }

    }
}
