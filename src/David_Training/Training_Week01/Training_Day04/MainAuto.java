package David_Training.Training_Week01.Training_Day04;

public class MainAuto {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto("David");
        Auto a3 = new Auto("David", 120,"Blau");

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
    }
}
