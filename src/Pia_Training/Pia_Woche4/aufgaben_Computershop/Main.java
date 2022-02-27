package Pia_Training.Pia_Woche4.aufgaben_Computershop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Computer 1:");
        Computer computer1 = new Computer("HP", 2, 8, 512, (byte) 3, 15.6, "Laptop", true, 1267.99, 1300);
        System.out.println(computer1 + "\n");

        System.out.println("Nach der Speichererweiterung hat Computer 1 folgenden Arbeitsspeicher: " );
        computer1.setArbeitsspeicher(computer1.getArbeitsspeicher() * 2);
        System.out.println(computer1.getArbeitsspeicher() + " GB" + "\n");

        // Erweiterung um 4 weitere Computer

        Computer computer2 = new Computer("ASUS", 699, 650);
        Computer computer3 = new Computer("Apple", 879, 970);
        Computer computer4 = new Computer("Samsung", 930, 950);
        Computer computer5 = new Computer("Dell", 749.99, 740);
        Computer [] alleComputer = {computer1, computer2, computer3, computer4, computer5};

        String gewinn = Berechnung.gesamtGewinn(alleComputer);

        System.out.println("Der gesamte Gewinn nach Verkauf aller Computer beträgt: " + gewinn);
    }
}


