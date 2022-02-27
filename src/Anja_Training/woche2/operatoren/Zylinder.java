package Anja_Training.woche2.operatoren;

import java.util.Scanner;

public class Zylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Umfang der Konservendose an: ");
        double u = scanner.nextDouble();

        System.out.println("Bitte geben Sie die Höhe der Konservendose an: ");
        double h = scanner.nextDouble();

        double d = u / Math.PI;
        double fb = Math.PI * Math.pow((d / 2), 2);
        double fm = u * h;
        double f = 2 * fb + fm;

        double fg = Math.round(10000.0 * (2 * fb + fm)) / 10000.0;
        double v = Math.round(10000.0 * fb * h) / 10000.0;

        System.out.println("Gesamtfläche des notwendigen Bleches beträgt: " + fg);
        System.out.println("Das Fassungsvermögen der Dose beträgt: " + v);


    }
}
