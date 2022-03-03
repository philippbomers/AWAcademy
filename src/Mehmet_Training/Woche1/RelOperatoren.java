package Mehmet_Training.Woche1;

import java.util.Scanner;

public class RelOperatoren {
    public static void main(String[] args) {
        System.out.println("Bitte gib dein Alter ein:");
        Scanner sc = new Scanner(System.in);
        int alter = sc.nextInt();
        if (alter >= 60) {
            System.out.println("Du bist alt.");
        } else if (alter > 40) {
            System.out.println("Du befindest dich in deinen 40ern oder 50ern.");
        } else if (alter > 20) {
            System.out.println("Du bist ein junger Erwachsener.");
        } else {
            System.out.println("Du bist noch minderjährig");
        }
    }
}
