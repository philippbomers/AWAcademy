package Philipp_Training.Philipp_Woche6.Day2.Interfaces.ComputerShop;

public class Monitor implements ProductInterface {

    public int id;
    public String produktName;

    public int groesse;
    public float gewicht;

    public String beschreibe() {
        String ausgabe = "  Größe:   " + groesse + "\n";
        ausgabe += "  Gewicht: " + gewicht + "\n";
        return ausgabe;
    }

}
