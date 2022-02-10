/**
 * Zylinder
 * Stelle dir vor, du sollst für eine Konservendosenproduktion die Menge des notwendigen
 * Bleches berechnen. Der Benutzer gibt dir den Umfang u und die Höhe h der Dosen an. Das
 * resultiert in einer Berechnung der geometrischen Zylinderform.
 * <p>
 * Durchmesser d des Bodens: d = u / pi, wobei pi = 3,14
 * Fläche des Bodens: fb = pi * ( d / 2 ) * ( d / 2 )
 * Fläche des Mantels: fm = u * h
 * Gesamtfläche des notwendigen Bleches: fg = 2 * fb + fm
 * Wie hoch ist das Fassungsvermögen der Dose?
 * Umfang:
 * 32
 * Höhe:
 * 10
 * Gesamtfläche: 482.97946840681203
 * Volumen: 814.8973420340601
 */

package Philipp_Woche2.Operators;

import java.util.Scanner;

public class Cylinder {
    public static void main() {

        Scanner scanCylinderInput = new Scanner(System.in);

        System.out.println("Umfang:");
        String scope = scanCylinderInput.nextLine();

        System.out.println("Höhe:");
        String height = scanCylinderInput.nextLine();

        double diameter = Double.parseDouble(scope) / Math.PI;
        double floorSurface = Math.PI * (diameter / 2) * (diameter / 2);
        double lateralSurface = Double.parseDouble(scope) * Double.parseDouble(height);
        double totalArea = 2 * floorSurface + lateralSurface;
        double volume = floorSurface * Double.parseDouble(height);

        System.out.println("Gesamtfläche: " + totalArea +
                "\nVolumen: " + volume);
    }
}
