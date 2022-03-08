package David_Training.Training_Week01.Training_Day03;

public class StringBuilderUebung1 {
    public static void main(String[] args) {

        String tableOpen = "<table>\n";
        String tableClose = "</table>\n";
        String rowOpen = "   <tr>\n";
        String rowClose = "   </tr>\n";
        String firstColumn1 = "      <td>Row";
        String firstColumn2 = "</td>\n";
        String secondColumn = "      <td>xxxxx</td>\n";

        StringBuilder htmlPage = new StringBuilder(tableOpen);
        for (int i = 1; i <= 10; i++) {

            StringBuilder tableContent = new StringBuilder(rowOpen);
            tableContent.append(firstColumn1);
            tableContent.append(i);
            tableContent.append(firstColumn2);
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
