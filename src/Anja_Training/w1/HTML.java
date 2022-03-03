package Anja_Training.w1;

import java.io.FileOutputStream;
import java.io.IOException;

public class HTML {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        text.append("<table>\n");
        for(int i=0;i<10; i++){
            text.append("\t<tr>\n");
            text.append("\t\t<td>Row").append(i).append("</td>\n\t\t<td>xxxxx</td>\n");
            text.append("\t</tr>\n");
        }
        text.append("</table>\n");
        createHTML(text.toString());
    }

    public static void createHTML(String text) throws IOException {
        String dateiName = "src//Anja_Training//w1//GenerierteHtmlText.html";
        FileOutputStream schreibeStrom = new FileOutputStream(dateiName);
        for (int i = 0; i < text.length(); i++) {
            schreibeStrom.write((byte) text.charAt(i));
        }
        schreibeStrom.close();
    }
}

