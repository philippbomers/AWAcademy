package Anja_Training.w1;

import java.io.FileOutputStream;
import java.io.IOException;

public class HTML {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        text.append("<table>\n");
        for(int i=0;i<10; i++){
            text.append("<tr>");
            text.append("<td>Row" + i + "</td>\n<td>xxxxx</td>");
            text.append("</tr>");
        }
        text.append("</table>");
        //text.append(System.getProperty("Line.seperator"))
        createHTML(text.toString());
    }

    public static void createHTML(String text) throws IOException {
        String dateiName = "GenerierteHtmlText.html";
        FileOutputStream schreibeStrom = new FileOutputStream(dateiName);
        for (int i = 0; i < text.length(); i++) {
            schreibeStrom.write((byte) text.charAt(i));
        }
        schreibeStrom.close();
    }
}

