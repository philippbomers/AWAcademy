package David_Training.Training_Week01.Training_Day03;

public class StringBuilderUebung2 {
    public static void main(String[] args) {

        String tableOpen = "<table>\n";
        String tableClose = "</table>\n";
        String rowOpenEven = "\t<tr bgcolor=\"#cccccc\">\n";
        String rowOpenOdd = "\t<tr bgcolor=\"#ffffff\">\n";
        String rowClose = "\t</tr>\n";
        String firstColumn1 = "\t\t<td>Row";
        String firstColumn2 = "</td>\n";
        String secondColumn = "\t\t<td>xxxxx</td>\n";

        StringBuilder htmlPage = new StringBuilder(tableOpen);
        for (int i = 1; i <= 10; i++) {

            String x = i%2 == 0 ? rowOpenEven : rowOpenOdd;

            StringBuilder tableContent = new StringBuilder(x);
            tableContent.append(firstColumn1 + i + firstColumn2);
            tableContent.append(secondColumn);
            tableContent.append(rowClose);

            htmlPage.append(tableContent);
            if (i == 10) {
                htmlPage.append(tableClose);
            }
        }

        System.out.println(htmlPage);
    }
}
