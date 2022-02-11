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

    /**
     * draws a right triangle with '.'
     *
     * @return String
     */
    public static String drawTriangle(Double heightOfTriangle, Double numberOfTriangles) {
        StringBuilder drawTriangles = new StringBuilder();
        int v;
        int i;
        int n;

        // iterate through every triangle
        for (v = 0; v < numberOfTriangles; v++) {

            // iterate through every line in one triangle
            for (i = 0; i < heightOfTriangle; i++) {

                // iterate through the points to draw
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
