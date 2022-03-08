package David_Training.Training_Week01.Training_Day04;

public class Methoden {
    public static void main(String[] args) {

    }

    // Mit Argument und Rückgabe
    public String concatString(String nachName) {
        return "David ".concat(nachName);
    }

    // Mit mehreren Argumenten und Rückgabe
    public long addiere(int x, int y) {
        return x + y;
    }

    // Mit Argument und ohne Rückgabe
    public void sageHallo(String name1, String name2) {
        System.out.println("Hallo" + name1 + " und " + name2);
    }

    // Ohne Argument und mit Rückgabe
    public int fuenf() {
        return 5;
    }

    // Ohne Argument und ohne Rückgabe
    public void halloWelt() {
        System.out.println("Hallo Welt!");
    }
}
