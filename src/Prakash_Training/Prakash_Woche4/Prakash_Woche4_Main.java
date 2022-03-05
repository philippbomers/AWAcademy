package Prakash_Training.Prakash_Woche4;

public class Prakash_Woche4_Main {
    public static void main(String[] args) {

        //Taschenrechner Code
        Taschenrechner meinRechner = new Taschenrechner();

        System.out.println("Initiale Ergebniswert: "+meinRechner.getErgebnis());
        meinRechner.plus(10);
        meinRechner.minus(4);
        meinRechner.mal(5);
        meinRechner.geteilt(2);
        meinRechner.geteilt(0);
        meinRechner.minus(5);
        System.out.println("Ergebnis: "+meinRechner.getErgebnis());

        //Computershop Code
        System.out.println("\nAufgabe: Computershop");
        Computer computer = new Computer("Dell",6,4,500,10,
                29,"Desktop",true,520.58,890.89);
        System.out.println("Computer Eigenschaften: \nHerstellername: "+computer.getHerstellername()+
                " \nProzessorgeschwindigkeit: "+computer.getProzessorSspeed()+" MHz \nArbeitsspeicher: "+
                computer.getArbeitsspeicher()+" GB \nFestplattengroesse: " +computer.getFestplattengr()+
                " GB \nAnzahl der USB-Ports: "+computer.getUsbports()+" \nBildschirmgröße in Zoll: "
                +computer.getBildSchirmgr()+"\" \nComputertyp (z.B. Desktoprechner, Laptop): "+computer.getComputertyp()
                +" \nVorinstalliertes Betriebssystem Ja/Nein: "+computer.getvorinstalliertesOS()+"\nGewinn: "+computer.gewinn()+" Eur");
        System.out.println(computer);
        computer.setHerstellername("HP");
        System.out.println("Aufruf getHerstellername Methode: "+computer.getHerstellername());
        Computer computer2 = new Computer("HP",16,true,625.18,790.95);
        System.out.println(computer2);
        System.out.println("Speicher Erweiterung: ");
        computer.setArbeitsspeicher(2* computer.getArbeitsspeicher());
        computer.setVerkaufspreis(computer.getVerkaufspreis()+70);
        System.out.println("Speicherung erweiterte Rechner: "+ computer);
        Computer computer3 = new Computer("MaC",21,true,1225.18,1791.95);
        System.out.println(computer3);
        computer.setVerkaufspreis(2000.79);
        computer.setEinkaufspreis(1500.87);
        System.out.println("Gewinn:"+computer.gewinn()+" Eur");
        System.out.println(computer3);
        Computer computer4 = new Computer("Lenovo",29,false,425.18,650.45);
        System.out.println(computer4);
        Computer computer5 = computer4;
        computer5.setHerstellername("HP");
        computer5.setVerkaufspreis(820.15);
        computer5.setEinkaufspreis(510.87);
        System.out.println(computer5);
        System.out.println("Computershop Gewinn:");
        Computer.alleGewinn();
    }
}