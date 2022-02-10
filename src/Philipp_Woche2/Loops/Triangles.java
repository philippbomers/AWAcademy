/**
 * Zeichne mehrere gleiche Dreiecke, für die der Benutzer die Größe angeben kann.
 */

package Philipp_Woche2.Loops;

import java.util.Scanner;

public class Triangles {
    public static void main() {
        Scanner scanTriangleInput = new Scanner(System.in);

        System.out.println("Wie groß sollen deine Dreiecke sein?");
        Double heightOfTriangle = scanTriangleInput.nextDouble();

        System.out.println("Wieviele von diesen Dreiecken möchtest du zeichnen?");
        Double numberOfTriangles = scanTriangleInput.nextDouble();

        System.out.println(drawTriangle(heightOfTriangle, numberOfTriangles));
    }

    public static String drawTriangle(Double heightOfTriangle, Double numberOfTriangles) {
        StringBuilder drawTriangles = new StringBuilder();
        int v;
        int i;
        int n;
        for (v = 0; v < numberOfTriangles; v++) {
            for (i = 0; i < heightOfTriangle; i++) {
                for (n = 0; n <= i; n++) {
                    drawTriangles.append(".");
                }
                drawTriangles.append("\n");
            }
            drawTriangles.append("\n");
        }
        return drawTriangles.toString();
    }
}
