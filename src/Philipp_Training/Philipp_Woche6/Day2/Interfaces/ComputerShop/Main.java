package Philipp_Training.Philipp_Woche6.Day2.Interfaces.ComputerShop;

public class Main {

    public static void main(String[] args) {

        Prozessor prozessor1 = new Prozessor();
        prozessor1.id = 1;
        prozessor1.produktName = "Intel Core I7";
        prozessor1.geschwindigkeit = 3000;
        prozessor1.anzahlKerne = 2;

        Prozessor prozessor2 = new Prozessor();
        prozessor2.id = 2;
        prozessor2.produktName = "Amd threadripper";
        prozessor2.geschwindigkeit = 3500;
        prozessor2.anzahlKerne = 3;

        Tastatur tastatur = new Tastatur();
        tastatur.id = 3;
        tastatur.farbe = "dunkelgrün";
        tastatur.produktName = "Microsoft Natural keyboard";

        Monitor monitor = new Monitor();
        monitor.id = 4;
        monitor.produktName = "Samsung T191T";
        monitor.groesse = 24;
        monitor.gewicht = 5.5f;

        // Aufgabe B: Lege eine Bestandsliste (Array) mit den unterschiedlichen Produkten an.
        ProductInterface[] products = new ProductInterface[]{prozessor1, prozessor2, tastatur, monitor};
        for (ProductInterface product : products) {
            druckeProdukte(product);
        }
    }

    private static void druckeProdukte(ProductInterface product) {
        /* Aufgabe C: Gib die Beschreibungen über eine separate Methode aus. */
        System.out.println(product.beschreibe());
    }

}
