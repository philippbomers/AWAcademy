package Philipp_Training.Philipp_Woche2.Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanChristmasTreeInput = new Scanner(System.in);

        System.out.println("Wie hoch soll der Weihnachtsbaum sein?");
        int heightOfChristmasTree = scanChristmasTreeInput.nextInt();

        System.out.println(drawChristmasTree(heightOfChristmasTree));
    }

    public static String drawChristmasTree(int heightOfChristmasTree) {

        // We only need every odd count of '*', therefore, we have to double the height
        int doubleHeightOfChristmasTree = heightOfChristmasTree * 2;
        StringBuilder drawChristmasTree = new StringBuilder();
        StringBuilder addBackground = new StringBuilder();
        StringBuilder currentLine = new StringBuilder();
        int i;

        // iterate through every line
        for (i = 0; i < doubleHeightOfChristmasTree; i++) {

            addBackground.delete(0, addBackground.length());
            currentLine.delete(0, currentLine.length());

            // count and draw '*'
            currentLine.append("*".repeat(Math.max(0, i+1)));

            // count and draw spaces on the left and right side of '*'
            addBackground.append(" ".repeat(Math.max(0, (doubleHeightOfChristmasTree - currentLine.length())/2)));

            // only draw the line at odd count of '*'
            if (i % 2 == 0) {
                drawChristmasTree.append(addBackground).append(currentLine).append(addBackground).append("\n");
            }

            // draw the trunk in the end
            if (i + 1 == doubleHeightOfChristmasTree) {
                addBackground.append(" ".repeat(heightOfChristmasTree-1));
                drawChristmasTree.append(addBackground).append("I").append(addBackground);
            }

        }
        return drawChristmasTree.toString();
    }
}
