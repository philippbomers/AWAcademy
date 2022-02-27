package Anja_Training.woche4.computershop;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Acer", 27, true);
        computer1.setArbeitsspeicher(4);
        System.out.println(computer1 + "\n");

        computer1.speichererweiterung();
        System.out.println("Der Arbeitsspeicher nach der Speichererweiterung lautet: "+computer1.getArbeitsspeicher());

        computer1.setEinkaufspreis(600);
        computer1.setVerkaufspreis(900);
        System.out.println("Der Gewinn pro Computer ist " + computer1.gewinnProComputer() + " Euro\n");

        Computer.addToList(computer1);

        // 2. Computer
        Computer computer2 = new Computer("HP",3, 2, 125, 3, 7, "Laptop", false, 500, 550, "N.A");
        Computer.addToList(computer2);

        //3. Computer
        Computer computer3 = new Computer("ASUS",3, 2, 125, 3, 7, "PC", false, 1500, 2550, "N.A");
        Computer.addToList(computer3);

        // 4. Computer
        Computer computer4 = new Computer("Lenovo",3, 2, 125, 5, 7, "Laptop", false, 1000, 1050, "N.A");
        Computer.addToList(computer4);

        // 5. Computer
        Computer computer5 = new Computer("Lenovo",3, 2, 125, 2, 7, "PC", false, 600, 700, "N.A");
        Computer.addToList(computer5);

        System.out.println("Erweiterung: \nWerden alle PCs verkauft gibt es ein Gewinn von: "+ Computer.gesamtGewinn() + " Euro");
    }
}
