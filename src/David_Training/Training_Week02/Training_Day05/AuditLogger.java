package David_Training.Training_Week02.Training_Day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AuditLogger {

    public static void auditLog(int betrag, String quellKonto, String zielKonto, int kosten){

        String auditLog;

        auditLog = "Überweisung: \r\n";
        saveLog(auditLog);

        auditLog = "Buchung des Betrages von " + betrag + " € vom Konto " + quellKonto + " auf das Konto " + zielKonto + "\r\n";
        saveLog(auditLog);

        auditLog = "Kosten für die Überweisung: " + kosten + " Cent\r\n";
        saveLog(auditLog);

    }

    public static void saveLog(String auditLog){
        try {
            Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(), auditLog.startsWith("Überweisung: ") ? StandardOpenOption.CREATE:StandardOpenOption.APPEND);;
        } catch (IOException e) {
            System.out.println("saveLog hat nicht funktioniert! -> " + e);
        }
    }

}
