package Pia_Training.Pia_Grouptraining.Day2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        //Increment operators
        int i = 2;
        System.out.println(i);
        System.out.println(i++); //i is printed as initial value, however i is now 3;
        System.out.println(i);
        System.out.println(++i); // i is printed as current value 3 + 1 = 4;
        System.out.println(i); //

        int j = 42;
        int k = j++ + ++j; // j is printed as initial value (42), however is now 43 + j is printed as current value 43+1 = 44;

        //Associative operators
        int r = 43;
        r += 100;
        r -= 24;
        r *= 2;
        r /= 5;
        System.out.println(r);

        //Modulo
        for (int num = 0; num <= 43; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " ist gerade.");
            } else {
                System.out.println(num + " ist ungerade.");
            }
        }
        //Relational operators
        System.out.println("Bitte gib dein Alter ein: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("Du bist alt.");
        } else if (age > 40) {
            System.out.println("Du befindest dich in den 40ern oder 50ern.");
        } else if (age > 20) {
            System.out.println("Du bist ein junger Erwachsener.");
        } else {
            System.out.println("Du bist noch minderjährig.");
        }
        //Conditional operators
        for (int n = 0; n < 100; n++) {
            if (!(n < 5 || n <= 10)) {
                //System.out.println(i);
            }
        }

        for (int o = 0; o < 100; o++) {
            if (o >= 5 && o <= 10 || !(o != 42)) {
                //System.out.println(j);
            }
        }
    }
}

