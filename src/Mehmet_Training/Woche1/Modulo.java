package Mehmet_Training.Woche1;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        for (int i = 0; i < 44; i++) {
            if (i % 2 == 0) {
                System.out.println("Die Zahl " + i + " ist gerade");
            } else {
                System.out.println("Die Zahl " + i + " ist ungerade");
            }
        }
        System.out.println("Gib bitte eine ganze Zahl ein:");
        Scanner sc = new Scanner(System.in);
        int ganzeZahl = sc.nextInt();
        for ( int j = 0; j < ganzeZahl; j++) {
            System.out.println("Der Wert von " + j + " in Modulo 5 ist: " + j%5);
        }
    }
}
