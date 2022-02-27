package Anja_Training.woche3.zeichenketten;

import java.util.Scanner;

public class WoerterZaehlen {
    public static void main(String[] args) {
        System.out.println("Gebe einen Text ein: ");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        /*String eingabe = "Weit draußen in den unerforschten Einöden eines total aus der Mode gekommenen " +
        "Ausläufers des westlichen Spiralarms der Galaxis leuchtet unbeachtet eine kleine gelbe " +
        "Sonne. Um sie kreist in einer Entfernung von ungefähr auchtundneunzig Millionen Meilen " +
        "ein absolut unbedeutender, kleiner blaugrüner Planet, dessen vom Affen stammende " +
        "Bioformen so erstaunlich primitiv sind, daß sie Digitaluhren noch immer für eine " +
        "unwahrscheinlich tolle Erfindung halten."; */

        String[] woerter = eingabe.split(" ");

        System.out.println("Der Text besitzt " + woerter.length + " Wörter");
    }
}
