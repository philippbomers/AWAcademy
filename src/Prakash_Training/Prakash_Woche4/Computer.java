package Prakash_Training.Prakash_Woche4;

import java.util.ArrayList;

public class Computer {
    private String herstellername;
    private int prozessorspeed;
    private int arbeitsspeicher;
    private int festplattengr;
    private int usbports;
    private int bildSchirmgr;
    private String computertyp;
    private boolean vorinstalliertesOS;
    public static ArrayList<Double> gewinnVal = new ArrayList<>();

    public double getEinkaufspreis() {
        return einkaufspreis;
    }
    public void setEinkaufspreis(double einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }
    public double getVerkaufspreis() {
        return verkaufspreis;
    }
    public void setVerkaufspreis(double verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    private static double einkaufspreis;
    private static double verkaufspreis;

    //Computer Konstruktor mit alle Eigenschaften
    public Computer(String herstellername, int prozessor, int ram, int harddisk, int usbports, int bildSchirmgr,
                    String computertyp, boolean vorinstalliertesOS, double einKaufsPreis, double verKaufsPreis) {
        this.herstellername = herstellername;
        this.prozessorspeed = prozessor;
        this.arbeitsspeicher = ram;
        this.festplattengr = harddisk;
        this.usbports = usbports;
        this.bildSchirmgr = bildSchirmgr;
        this.computertyp = computertyp;
        this.vorinstalliertesOS = vorinstalliertesOS;
        this.einkaufspreis=einKaufsPreis;
        this.verkaufspreis=verKaufsPreis;
    }
    //Method toString Overload alle Eigenschaften auszugeben
    //Beim toString aufruf, Gewinn[i] wird automatisch zum entsprechende Computer[i] addiert
    public String toString() {
        this.gewinnVal.add(verkaufspreis-einkaufspreis);

        return ("\nComputer Eigenschaften: Herstellername: " + herstellername + " Prozessorgeschwindigkeit: " +
                prozessorspeed + " MHz Arbeitsspeicher: " + arbeitsspeicher + " GB Festplattengr.: " + festplattengr +
                " GB Anzahl der USB-Ports: " + usbports + " Bildschirmgr.: " + bildSchirmgr + " \" \n\t\t\t\t\t\tComputertyp: "
                + computertyp + " Vorinstalliertes Betriebssystem Ja/Nein: " + vorinstalliertesOS+
                " Gewinn: "+this.gewinn()+" Eur");
    }
    //Diese Methode rechnet und ausgibt den Gewinn Wert
    //Aufruf dieser Methode Initialisiert kein Gewinn Array
    public static double gewinn() {
        return (verkaufspreis-einkaufspreis);
    }
    //Computer Konstruktor nur mit folgende 5 Eigenschaften
    public Computer(String herstellername, int bildSchirmgr, boolean vorinstalliertesOS, double einKaufsPreis, double verKaufsPreis) {
        this.herstellername = herstellername;
        this.bildSchirmgr = bildSchirmgr;
        this.vorinstalliertesOS = vorinstalliertesOS;
        this.einkaufspreis=einKaufsPreis;
        this.verkaufspreis=verKaufsPreis;
    }
    public String getHerstellername() {
        return herstellername;
    }
    public void setHerstellername(String herstellername) {
        this.herstellername = herstellername;
    }
    public int getProzessorSspeed() {
        return prozessorspeed;
    }
    public void setProzessorSpeed(int prozessorspeed) {
        this.prozessorspeed = prozessorspeed;
    }
    public int getArbeitsspeicher() {
        return arbeitsspeicher;
    }
    public void setArbeitsspeicher(int arbeitsspeicher) {
        this.arbeitsspeicher = arbeitsspeicher;
    }
    public int getFestplattengr() {
        return festplattengr;
    }
    public void setFestplattengr(int festplattengr) {
        this.festplattengr = festplattengr;
    }
    public int getUsbports() {
        return usbports;
    }
    public void setUsbports(byte usbports) {
        this.usbports = usbports;
    }
    public int getBildSchirmgr() {
        return bildSchirmgr;
    }
    public void setBildSchirmgr(int bildSchirmgr) {
        this.bildSchirmgr = bildSchirmgr;
    }
    public String getComputertyp() {
        return computertyp;
    }
    public void setComputertyp(String computertyp) {
        this.computertyp = computertyp;
    }
    public boolean getvorinstalliertesOS() {
        return vorinstalliertesOS;
    }
    public void setvorinstalliertesOS(boolean betSystem) {
        this.vorinstalliertesOS = betSystem;
    }

    //Methode gesamte Gewinn zu rechnen und Gewinn[i] aufzurufen
    public static void alleGewinn() {
        double totalGewinn = 0;
        for (int i = 0; i < gewinnVal.size(); i++) {
            System.out.printf("Computer"+(i+1)+": "+"%.2f",gewinnVal.get(i));
            System.out.print(" Eur");
            System.out.println();
            totalGewinn=totalGewinn+gewinnVal.get(i);
        } System.out.println("Gesamte Gewinn: "+totalGewinn+ " Eur");
    }
}