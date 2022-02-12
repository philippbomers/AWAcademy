package Philipp_Training.Philipp_Woche2.Loops;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
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

        // iterate through every triangle
        for (int v = 0; v < numberOfTriangles; v++) {

            // iterate through every line in one triangle
            for (int i = 0; i < heightOfTriangle; i++) {

                // iterate through the points to draw
                drawTriangles.append(".".repeat(Math.max(0, i + 1))).append("\n");
            }
            drawTriangles.append("\n");
        }
        return drawTriangles.toString();
    }
}
