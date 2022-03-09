package Philipp_Training.Philipp_Woche6.Day2.Interfaces.GeometrischeFiguren;

public record Kreis(Punkt anfang,
                    Punkt ende) implements Figur {
    @Override
    public Punkt[] zeichne() {
        int anzahlPunkte = (((ende.x - anfang.x) + (ende.y - anfang.y)) * 2) + 4;
        Punkt[] punkte = new Punkt[anzahlPunkte];

        int zaehlerPunkte = 0;

        // Obere und untere Linien zeichnen.

        for (int i = anfang.x; i <= ende.x; i++) {
//            punkte[zaehlerPunkte++] = new Punkt(i, anfang.y);
//            punkte[zaehlerPunkte++] = new Punkt(i, ende.y);
        }

        // Linke und rechte Linien zeichnen.
//        for (int i = anfang.y; i <= ende.y; i++) {
//            punkte[zaehlerPunkte++] = new Punkt(anfang.x, i);
//            punkte[zaehlerPunkte++] = new Punkt(ende.x, i);
//        }

        return punkte;
    }
}
