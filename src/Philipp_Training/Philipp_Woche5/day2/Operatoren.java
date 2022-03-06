package Philipp_Training.Philipp_Woche5.day2;

import java.util.Scanner;

public class Operatoren {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (!(i < 5 || i > 10))
                System.out.println(i);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10 || !(i != 42))
                System.out.println(i);
        }
    }

    public void sometask() {
        int i = 0;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int j = 42;
        int k = j++ + ++j;
        System.out.println(k);

        System.out.println();

        i = 43;
        i += 100;
        i -= 24;
        i *= 2;
        i /= 5;
        System.out.println(i);

        for (i = 1; i < 43; i++) {
            System.out.print(i + ": ");
            if (i % 2 == 0)
                System.out.print("gerade\n");
            else
                System.out.print("ungerade\n");
        }


        System.out.println("\n\nWie alt bist du:");
        Scanner age = new Scanner(System.in);
        int input = age.nextByte();

        if (input >= 60)
            System.out.println("Du bist alt.");
        else if (input > 40)
            System.out.println("Du befindest dich in den 40ern oder 50ern.");
        else if (input > 20)
            System.out.println("Du bist ein junger Erwachsener");
        else
            System.out.println("Du bist noch Minderjährig.");

    }
}
