package Philipp_Training.Philipp_Woche6.Day2.Interfaces.ComputerShop;

public class Tastatur implements ProductInterface {

    public int id;
    public String produktName;

    public boolean mitNummerBlock;
    public String farbe;
    public boolean drahtLos;

    public String beschreibe() {
        String ausgabe = "  Nummernblock: " + mitNummerBlock + "\n";
        ausgabe += "  Farbe:        " + farbe + "\n";
        ausgabe += "  Drahtlos:     " + drahtLos + "\n";
        return ausgabe;
    }
}
