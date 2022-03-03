package Philipp_Training.Philipp_Woche5.day3;

import java.util.Locale;
import java.util.Scanner;

public class Eingabevalidierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("<11: Bitte gib eine Zahl ein:");
        System.out.println((input.nextInt()<11)?"OK":"Eingabefehler");

        System.out.println(">5: Bitte gib eine Zahl ein:");
        System.out.println((input.nextInt()>5)?"OK":"Eingabefehler");

        System.out.println("4-8: Bitte gib eine Zahl ein:");
        int inputValue = input.nextInt();
        System.out.println((inputValue>3 && inputValue<9)?"OK":"Eingabefehler");

        System.out.println("Beginn mit 2 Zahlen: Bitte gib ein Wort ein:");
        String inputVal = inputString.nextLine();
        System.out.println(Character.isDigit(inputVal.charAt(0)) && Character.isDigit(inputVal.charAt(1))?"OK":"Eingabefehler");

        System.out.println("chen: Bitte gib ein Wort ein:");
        System.out.println((inputString.nextLine().toLowerCase(Locale.ROOT).contains("chen"))?"OK":"Eingabefehler");

        System.out.println("/ am Ende: Bitte gib ein Wort ein:");
        String inputVal2 = inputString.nextLine();
        inputVal2=inputVal2.substring(inputVal2.length()-1);
        System.out.println((inputVal2.equals(":"))?"OK":"Eingabefehler");

        System.out.println("Großbuchstaben: Bitte gib ein Wort ein:");
        String inputVal3 = inputString.nextLine();
        System.out.println((inputVal3.toUpperCase().equals(inputVal3))?"OK":"Eingabefehler");

        System.out.println("Beinhaltet ( und ): Bitte gib ein Wort ein:");
        String inputVal4 = inputString.nextLine();
        boolean b = inputVal4.contains("(") && inputVal4.contains(")");
        boolean c = (inputVal4.indexOf("(") < inputVal4.indexOf(")"));
        System.out.println((b&&c)?"OK":"Eingabefehler");
    }
}
