package Philipp_Training.Philipp_Woche2.Operators;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

        Scanner scanCylinderInput = new Scanner(System.in);

        // I do not use nextDouble to make the program more user-friendly.
        // Alternatively, I could use nextInt and parse to double
        System.out.println("Umfang:");
        String scope = scanCylinderInput.nextLine();

        System.out.println("Höhe:");
        String height = scanCylinderInput.nextLine();

        // make calculations ti receive total area and volume
        double diameter = Double.parseDouble(scope) / Math.PI;
        double floorSurface = Math.PI * (diameter / 2) * (diameter / 2);
        double lateralSurface = Double.parseDouble(scope) * Double.parseDouble(height);
        double totalArea = 2 * floorSurface + lateralSurface;
        double volume = floorSurface * Double.parseDouble(height);

        System.out.println("Gesamtfläche: " + totalArea +
                "\nVolumen: " + volume);
    }
}
