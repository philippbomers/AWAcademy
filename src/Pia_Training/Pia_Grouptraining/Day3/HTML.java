package Pia_Training.Pia_Grouptraining.Day3;

public class HTML {
    public static void main(String[] args) {
        StringBuilder table = new StringBuilder("<table>");
        for (int i = 0; i<10; i++) {
            table.append("\n<tr>\n");
            table.append("\t<td>");
            table.append("Row" + (i+1));
            table.append("</td>\n");
            table.append("\t<td>XXXXX</td>\n");
            table.append("</tr>\n");
        } table.append("</table>\n");
        System.out.println(table);
    }
}
