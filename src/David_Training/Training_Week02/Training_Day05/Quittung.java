package David_Training.Training_Week02.Training_Day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Quittung {

    public static void createQuittung(int betrag, int kosten, String quellKonto, String zielKonto){

        String quittung = "Quittung für die Überweisung:\r\n" +
                "\r\nDate: " + LocalDateTime.now() +
                "\r\nAmount:" + betrag +
                "\r\nCost: " + kosten +
                "\r\nFrom account:" + quellKonto +
                "\r\nTo account:" + zielKonto + "\r\n";

        saveQuittung(quittung);

    }

    public static void saveQuittung(String quittung){
        try {
            Files.write(Paths.get("./confirmation.txt"), quittung.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("saveQuittung hat nicht funktioniert! -> " + e);
        }
    }

}
