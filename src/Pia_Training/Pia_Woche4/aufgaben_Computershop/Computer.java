package Pia_Training.Pia_Woche4.aufgaben_Computershop;

import java.text.DecimalFormat;

public class Computer {

    //Eigenschaften

    public static final DecimalFormat df = new DecimalFormat("0.00");

    private String herstellerName;
    private int prozessorGeschwindigkeit;
    private int arbeitsspeicher;
    private int festplattenGroesse;
    private byte anzahlUsbPorts;
    private double bildschirmGroesse;
    private String computerTyp;
    private boolean betreibersystemVorinstalliert;
    private double einkaufsPreis;
    private double verkaufsPreis;

    // Konstruktoren

    public Computer() {
    }

    public Computer(String herstellerName, double bildschirmGroesse, boolean betreibersystemVorinstalliert) {
        this.setHerstellerName(herstellerName);
        this.setBildschirmGroesse(bildschirmGroesse);
        this.setBetreibersystemVorinstalliert(betreibersystemVorinstalliert);
    }

    public Computer(String herstellerName, int prozessorGeschwindigkeit, int arbeitsspeicher, int festplattenGroesse, byte anzahlUsbPorts, double bildschirmGroesse, String computerTyp, boolean betreibersystemVorinstalliert, double einkaufspreis, double verkaufspreis) {
        this.herstellerName = herstellerName;
        this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
        this.arbeitsspeicher = arbeitsspeicher;
        this.festplattenGroesse = festplattenGroesse;
        this.anzahlUsbPorts = anzahlUsbPorts;
        this.bildschirmGroesse = bildschirmGroesse;
        this.computerTyp = computerTyp;
        this.betreibersystemVorinstalliert = betreibersystemVorinstalliert;
        this.einkaufsPreis = einkaufspreis;
        this.verkaufsPreis = verkaufspreis;
    }

    public double einfacherGewinn() {
        double einfacherGewinn = verkaufsPreis - einkaufsPreis;
        return einfacherGewinn;
    }

    // Erweiterungs-Aufgabe

    public Computer(String herstellerName, double einkaufsPreis, double verkaufspreis) {
        this.setHerstellerName(herstellerName);
        this.setEinkaufsPreis(einkaufsPreis);
        this.setVerkaufsPreis(verkaufspreis);
    }

    // Getter / Setter

    public String getHerstellerName() {
        return herstellerName;
    }

    public void setHerstellerName(String herstellerName) {
        this.herstellerName = herstellerName;
    }

    public int getProzessorGeschwindigkeit() {
        return prozessorGeschwindigkeit;
    }

    public void setProzessorGeschwindigkeit(int prozessorGeschwindigkeit) {
        this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
    }

    public int getArbeitsspeicher() {
        return arbeitsspeicher;
    }

    public void setArbeitsspeicher(int arbeitsspeicher) {
        this.arbeitsspeicher = arbeitsspeicher;

    }

    public int getFestplattenGroesse() {
        return festplattenGroesse;
    }

    public void setFestplattenGroesse(int festplattenGroesse) {
        this.festplattenGroesse = festplattenGroesse;
    }

    public int getAnzahlUsbPorts() {
        return anzahlUsbPorts;
    }

    public void setAnzahlUsbPorts(byte anzahlUsbPorts) {
        this.anzahlUsbPorts = anzahlUsbPorts;
    }

    public double getBildschirmGroesse() {
        return bildschirmGroesse;
    }

    public void setBildschirmGroesse(double bildschirmGroesse) {
        this.bildschirmGroesse = bildschirmGroesse;
    }

    public String getComputerTyp() {
        return computerTyp;
    }

    public void setComputerTyp(String computerTyp) {
        this.computerTyp = computerTyp;
    }

    public boolean isBetreibersystemVorinstalliert() {
        return betreibersystemVorinstalliert;
    }

    public void setBetreibersystemVorinstalliert(boolean betreibersystemVorinstalliert) {
        this.betreibersystemVorinstalliert = betreibersystemVorinstalliert;
    }

    public double getEinkaufsPreis() {
        return einkaufsPreis;
    }

    public void setEinkaufsPreis(double einkaufsPreis) {
        this.einkaufsPreis = einkaufsPreis;
    }

    public double getVerkaufsPreis() {
        return verkaufsPreis;
    }

    public void setVerkaufsPreis(double verkaufsPreis) {
        this.verkaufsPreis = verkaufsPreis;
    }



    // toString
    public String toString() {
        return "Herstellername: " + getHerstellerName() +
                "\nProzessorgeschwindigkeit: " + getProzessorGeschwindigkeit() + " MHz" +
                "\nArbeitsspeicher: " + getArbeitsspeicher() + " GB" +
                "\nFestplattengröße: " + getFestplattenGroesse() + " GB" +
                "\nAnzahl der USB-Ports: " + getAnzahlUsbPorts() +
                "\nArbeitsspeicher: " + getArbeitsspeicher() + " GB" +
                "\nBildschirmgröße: " + getBildschirmGroesse() + " Zoll" +
                "\nComputertyp: " + getComputerTyp() +
                "\nVorinstalliertes Betriebssystem: " + isBetreibersystemVorinstalliert() +
                "\nEinkaufspreis: " + getEinkaufsPreis() + "Euro" +
                "\nVerkaufspreis: " + getVerkaufsPreis() + "Euro" +
                "\nGewinn nach Verkauf: " + df.format(einfacherGewinn()) + " Euro";
    }
}




