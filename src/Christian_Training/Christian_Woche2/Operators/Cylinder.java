package Christian_Training.Christian_Woche2.Operators;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        /*
        ● Durchmesser d des Bodens: d = u / pi, wobei pi = 3,14
        ● Fläche des Bodens: fb = pi * ( d / 2 ) * ( d / 2 )
        ● Fläche des Mantels: fm = u * h
        ● Gesamtfläche des notwendigen Bleches: fg = 2 * fb + fm

        Umfang:
        32
        Höhe:
        10

        Gesamtfläche: 482.97946840681203
        Volumen: 814.8973420340601
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Umfang: ");
        int umfang = scanner.nextInt();
        System.out.println("Höhe: ");
        int hoehe = scanner.nextInt();

        double durchmesseBodens = umfang / Math.PI;
        double flaecheBodens = Math.PI * (durchmesseBodens/2) * (durchmesseBodens/2);
        double flaecheMantels = umfang * hoehe;
        double gesamtFlaeche = 2 * flaecheBodens + flaecheMantels;
        double volumen = flaecheBodens * hoehe;

        System.out.println(flaecheMantels);
        System.out.println("Gesamtfläche: " + gesamtFlaeche);
        System.out.println("Volumen: " + volumen );

    }
}
