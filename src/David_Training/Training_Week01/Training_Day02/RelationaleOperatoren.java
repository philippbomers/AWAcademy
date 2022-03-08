package David_Training.Training_Week01.Training_Day02;

import java.util.Scanner;

public class RelationaleOperatoren {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib dein Alter ein: ");
        int nutzerAlter = scanner.nextInt();

        if (nutzerAlter >= 60) {
            System.out.println("Du bist alt");
        } else if (nutzerAlter > 40) {
            System.out.println("Du befindest dich in deinen 40ern oder 50ern.");
        } else if (nutzerAlter > 20) {
            System.out.println("Du bist ein junger Erwachsener.");
        } else {
            System.out.println("Du bist noch minderjährig.");
        }

    }
}
