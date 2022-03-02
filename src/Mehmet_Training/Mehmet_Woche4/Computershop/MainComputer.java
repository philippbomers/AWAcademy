package Mehmet_Training.Mehmet_Woche4.Computershop;

public class MainComputer {
    public static void main(String[] args) {
        //Objekt computer1 der Klasse Computer
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer1 = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer("Lenovo", 17.6, true);
        computer1.setComputerTyp("Laptop");
        computer1.setArbeitSpeicher(16);
        computer1.setFestPlattenGroesse(500);
        computer1.setGewicht(1.9);
        computer1.setGrafikKartenSpeicher(8);
        computer1.setMitTouchScreen(false);
        computer1.setEinkaufsPreis(520);
        computer1.setVerkaufsPreis(750);
        System.out.println(computer1);

        //Speichererweiterung
        //Arbeitsspeichergröße eines Computers wird erst aufgerufen, dann wird es verdoppelt und der neue Wert
        //wird wieder eingesetzt.
        //Natürlich bringt dieser Prozess eine Preiserhöhung mit sich :)
        computer1.setArbeitSpeicher(2 * computer1.getArbeitSpeicher());
        computer1.setVerkaufsPreis(computer1.getVerkaufsPreis() + 50);
        System.out.println("Nach der Speichererweiterung:");
        System.out.println(computer1);

        //Gewinn

        //4 neuen Instanzen des Objekts Computer
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer2 = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer(450, 600);
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer3 = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer(790, 990);
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer4 = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer(790, 1000);
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer5 = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer(1300, 1750);

        //Zuweisung der Computer einem Array, um gesamten Gewinn zu berechnen.
        Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer[] verkaufteComputer = new Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer[]{computer1, computer2, computer3, computer4, computer5};
        System.out.println("Totalgewinn nach Verkauf von 5 Computern ist: " + getGewinn(verkaufteComputer) + "€");

    }

    public static double getGewinn(Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer[] computerArray) {
        double gesamterGewinn = 0;
        for (Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop.Computer computer : computerArray) {
            gesamterGewinn += computer.gewinnProComputer();
        }
        return gesamterGewinn;
    }
}
