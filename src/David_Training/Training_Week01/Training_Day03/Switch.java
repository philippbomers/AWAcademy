package David_Training.Training_Week01.Training_Day03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Aufgabe 1:
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl von 1-4 ein: ");
        char c = scanner1.nextLine().charAt(0);
        String s = String.valueOf(c);
        int i = Integer.parseInt(s);

        switch (i) {
            case 1:
                System.out.println("Black");
                break;
            case 2:
                System.out.println("White");
                break;
            case 3:
                System.out.println("Red");
                break;
            case 4:
                System.out.println("Green");
                break;
            default:
                System.out.println("Keine Zahl eingegeben!");
                break;
        }

        // Aufgabe 2:
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte gibt a, b, c oder d ein: ");
        char c2 = scanner2.next().charAt(0);

        switch (c2){
            case 'a':
                System.out.println("Black");
                break;
            case 'b':
                System.out.println("White");
                break;
            case 'c':
                System.out.println("Red");
                break;
            case 'd':
                System.out.println("Green");
                break;
            default:
                System.out.println("Keinen Character eingegeben!");
                break;
        }

        // Aufgabe 3:
        char input = 'b';

        switch (input) {
            case 'a':
                System.out.println("Airplane");
                break;
            case 'b':
                System.out.println("Car");
            case 'c':
                System.out.println("Boat");
                break;
            default:
                break;
        }

        // Aufgabe 4:

        switch (input) {
            case 'a':
                System.out.println("Black");
                break;
            case 'b':
            case 'w':
            case 'W':
            case 'v':
                System.out.println("White");
                break;
            case 'c':
                System.out.println("Red");
                break;
            case 'd':
                System.out.println("Green");
                break;
            default:
                break;
        }

        // Aufgabe 5: If- in Switch-Anweisung konvertieren
        Scanner stdin =  new Scanner(System.in);
        int choice = 0;
    }
}
