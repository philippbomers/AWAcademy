package Elias_Training.Elias_Woche2.Operations;

public class Main {
    public static void main(String[] args) {

       Zeiteinheiten zeiteinheitenObj = new Zeiteinheiten();
        Zylinder zylinderObj = new Zylinder();
        EineZeileCode eineZeileCodeObj = new EineZeileCode();
        Metropolen metropolenObj = new Metropolen();

        trenner("Sekunden in Zeitraum umrechnen");
        zeiteinheitenObj.zeiteinheitenRechner();

        trenner("Volumen und Gesamtfäche der Dosen berechnen");
        zylinderObj.zylinderRechner();

        trenner("Code in einer Zeile");
        eineZeileCodeObj.codeInEinerZeile();

        trenner("Ist die genannte Stadt eine Metropole? ");
        metropolenObj.metropolenBestimmen();





    }

    public static void trenner(String text){
        System.out.println("_--_--_--_-- " + text + " --_--_--_--_\n");
    }
}
