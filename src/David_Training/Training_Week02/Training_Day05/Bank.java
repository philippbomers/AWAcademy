package David_Training.Training_Week02.Training_Day05;

import java.util.Arrays;

public class Bank {

    private Konto[] kontos = { new Konto("pia", 50), new Konto("david", 100) };

    public void schickeGeld(int betrag, String quellKonto, String zielKonto) {

        //ORIGIN
        System.out.println("kontos = " + Arrays.toString(kontos));

        // Die Überweisungskosten hängen vom Betrag ab:
        // Beträge bis 1000,00 €: 10 Cent
        // Beträge über 1000,00 €: 50 Cent
        int kosten = berechneUeberweisungsKosten(betrag);

        // Schreibe den Überweisungsbetrag und die Bankkonten in eine Datei.
        // So können wir später nachvollziehen, welche Beträge von wo nach
        // wo überwiesen wurden.
        AuditLogger.auditLog(betrag, quellKonto, zielKonto, kosten);

        // Schreibe einen Beleg für die Buchung als Quittung in eine Datei.
        // So bekommen sowohl der Sender als auch der Empfänger des Geldes
        // eine Bestätigung ihrer Überweisung.
        Quittung.createQuittung(betrag, kosten, quellKonto, zielKonto);

        // Führe die Überweisung durch - irgendwie...
        aktualisiereKontos(betrag, kosten, quellKonto, zielKonto);

        //RESULT
        System.out.println("kontos = " + Arrays.toString(kontos));

    }

    private int berechneUeberweisungsKosten(int betrag){
        if (betrag > 1000) return 50;
        return 10;
    }

    private void aktualisiereKontos(int betrag, int kosten, String quellKonto, String zielKonto){
        for (Konto k : kontos){
            if (k.getName().equals(quellKonto)) k.setStand(k.getStand()-betrag-kosten);
            else if (k.getName().equals(zielKonto)) k.setStand(k.getStand()+betrag);
        }
    }

    public static void main(String[] args) {
        new Bank().schickeGeld(50, "david", "pia");
    }

}
