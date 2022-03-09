package Philipp_Training.Philipp_Woche6.Day2.Interfaces.ComputerShop;

public class Prozessor implements ProductInterface {

    public int id;
    public String produktName;

    public int geschwindigkeit;
    public int anzahlKerne;

    public String beschreibe() {
        String ausgabe = "  Taktung: " + geschwindigkeit + "\n";
        ausgabe += "  Kerne:   " + anzahlKerne + "\n";
        return ausgabe;
    }
}
