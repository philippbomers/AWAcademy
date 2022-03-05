package Pia_Training.Pia_Grouptraining.Day3;

import java.util.Scanner;

public class Control_structures {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        int number;
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        switch (number) {
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
                System.out.println("Colorblind");
                break;
        }
        System.out.println("Please enter a single character: ");
        Scanner scanner2 = new Scanner(System.in);
        char c = scanner2.next().charAt(0);

        switch (c)
        {
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
                System.out.println("Colorblind");
                break;
        }
    }
}
