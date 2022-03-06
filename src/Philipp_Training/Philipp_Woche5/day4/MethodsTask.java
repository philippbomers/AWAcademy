package Philipp_Training.Philipp_Woche5.day4;

public class MethodsTask {
    public static void main(String[] args) {
        System.out.println(openCar(true));
        System.out.println(getMaxSpeed(130, 1000));
        System.out.println(startMotor());
        turnLeft();

    }

    public static String openCar(boolean keyPressed) {
        return (keyPressed ? "Offen." : "Geschlossen. Bitte öffnen.");
    }

    public static int getMaxSpeed(int ps, int weight) {
        return weight / ps * 15;
    }

    public static String startMotor() {
        return "Motor gestartet";
    }

    public static void turnLeft() {
        System.out.println("Fahre links.");
    }

}


