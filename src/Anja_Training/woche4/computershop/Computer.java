package Anja_Training.woche4.computershop;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    //Eigenschaften
    private String herstellername;
    private int prozessorgeschwindigkeit;
    private int arbeitsspeicher;
    private int festplattengroeße;
    private int anzahlUsbPort;
    private int bilschirmgroeße;


    private String computerTyp;
    boolean betriebssystem;
    private int einkaufspreis;
    private int verkaufspreis;
    private String grafikkarte;

    //Konstruktor
    public Computer() {
    }

    public Computer(String herstellername, int bilschirmgroeße, boolean betriebssystem) {
        this.herstellername = herstellername;
        this.bilschirmgroeße = bilschirmgroeße;
        this.betriebssystem = betriebssystem;
    }

    public Computer(String herstellername, int prozessorgeschwindigkeit, int arbeitsspeicher, int festplattengroeße, int anzahlUsbPort, int bilschirmgroeße, String computerTyp, boolean betriebssystem, int einkaufspreis, int verkaufspreis, String grafikkarte) {
        this.herstellername = herstellername;
        this.prozessorgeschwindigkeit = prozessorgeschwindigkeit;
        this.arbeitsspeicher = arbeitsspeicher;
        this.festplattengroeße = festplattengroeße;
        this.anzahlUsbPort = anzahlUsbPort;
        this.bilschirmgroeße = bilschirmgroeße;
        this.computerTyp = computerTyp;
        this.betriebssystem = betriebssystem;
        this.einkaufspreis = einkaufspreis;
        this.verkaufspreis = verkaufspreis;
        this.grafikkarte = grafikkarte;
    }


    public int speichererweiterung() {
        arbeitsspeicher *= 2;
        return arbeitsspeicher;
    }

    public int gewinnProComputer(){
        int gewinn = verkaufspreis - einkaufspreis;
        return gewinn;
    }

    // Erweiterung
    private static List<Computer> computerList = new ArrayList<Computer>();

    public static int gesamtGewinn(){
        int ergebnis = 0;
        for (Computer c: computerList
             ) {
            ergebnis+=c.getVerkaufspreis();
        }
        return ergebnis;
    }

    public static void addToList(Computer c){
        computerList.add(c);
    }

    @Override
    public String toString() {
        return "Die Computereigenschaften lauten:" +
                "\nHerstellername: " + herstellername +
                "\nProzessorgeschwindigkeit: " + prozessorgeschwindigkeit + " MHz" +
                "\nArbeitsspeicher: " + arbeitsspeicher + " GB" +
                "\nFestplattengroeße :" + festplattengroeße + " GB" +
                "\nAnzahlUsbPort: " + anzahlUsbPort +
                "\nBilschirmgroeße: " + bilschirmgroeße + " Zoll" +
                "\nComputertyp: " + computerTyp +
                "\nVorinstalliertes Betriebssystem: " + betriebssystem +
                "\nEinkaufspreis: " + einkaufspreis + " Euro"+
                "\nVerkaufspreis: " + verkaufspreis + " Euor"+
                "\nGrafikkarte: " + grafikkarte;
    }

    //Getter&Setter
    public String getHerstellername() {
        return herstellername;
    }

    public void setHerstellername(String herstellername) {
        this.herstellername = herstellername;
    }

    public int getProzessorgeschwindigkeit() {
        return prozessorgeschwindigkeit;
    }

    public void setProzessorgeschwindigkeit(int prozessorgeschwindigkeit) {
        this.prozessorgeschwindigkeit = prozessorgeschwindigkeit;
    }

    public int getArbeitsspeicher() {
        return arbeitsspeicher;
    }

    public void setArbeitsspeicher(int arbeitsspeicher) {
        this.arbeitsspeicher = arbeitsspeicher;
    }

    public int getFestplattengroeße() {
        return festplattengroeße;
    }

    public void setFestplattengroeße(int festplattengroeße) {
        this.festplattengroeße = festplattengroeße;
    }

    public int getAnzahlUsbPort() {
        return anzahlUsbPort;
    }

    public void setAnzahlUsbPort(int anzahlUsbPort) {
        this.anzahlUsbPort = anzahlUsbPort;
    }

    public int getBilschirmgroeße() {
        return bilschirmgroeße;
    }

    public void setBilschirmgroeße(int bilschirmgroeße) {
        this.bilschirmgroeße = bilschirmgroeße;
    }

    public String getComputerTyp() {
        return computerTyp;
    }

    public void setComputerTyp(String computerTyp) {
        this.computerTyp = computerTyp;
    }

    public boolean isBetriebssystem() {
        return betriebssystem;
    }

    public void setBetriebssystem(boolean betriebssystem) {
        this.betriebssystem = betriebssystem;
    }

    public int getEinkaufspreis() {
        return einkaufspreis;
    }

    public void setEinkaufspreis(int einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }

    public String getGrafikkarte() {
        return grafikkarte;
    }

    public void setGrafikkarte(String grafikkarte) {
        this.grafikkarte = grafikkarte;
    }

    public int getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }



}
