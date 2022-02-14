package Philipp_Training.Philipp_Woche2.Loops;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner scanChristmasTreeInput = new Scanner(System.in);
        System.out.println("Wie hoch soll der Weihnachtsbaum sein?");
        System.out.println(drawChristmasTree(scanChristmasTreeInput.nextInt()));
    }

    public static String drawChristmasTree(int heightOfChristmasTree) {

        // We only need every odd count of '*', therefore, we have to double the height
        int doubleHeightOfChristmasTree = heightOfChristmasTree * 2;

        // initialization of StringBuilders
        StringBuilder drawChristmasTree = new StringBuilder(),
                addBackground = new StringBuilder(),
                currentLine = new StringBuilder();

        // iterate through every line
        for (int i = 0; i < doubleHeightOfChristmasTree; i += 2) {

            // count and draw '*' for actual line
            currentLine.
                    delete(0, currentLine.length()).
                    append("*".repeat(i + 1));

            // count and draw spaces for the left and right side next to '*' for actual line
            addBackground.
                    delete(0, addBackground.length()).
                    append(" ".repeat((doubleHeightOfChristmasTree - currentLine.length()) / 2));

            // draw the tree line
            drawChristmasTree.
                    append(addBackground).
                    append(currentLine).
                    append(addBackground).
                    append("\n");
        }

        // return tree with trunk as string
        addBackground.append(" ".repeat(heightOfChristmasTree - 1));

        return drawChristmasTree.
                append(addBackground).
                append("I").
                append(addBackground).
                toString();
    }
}
