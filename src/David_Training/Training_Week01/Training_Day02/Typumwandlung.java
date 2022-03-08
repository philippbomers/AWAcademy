package David_Training.Training_Week01.Training_Day02;

public class Typumwandlung {
    public static void main(String[] args) {

        int i1 = 200;
        byte b1;
        b1 = (byte) i1;

        System.out.printf("1: Explizite, einschränkende: ");
        System.out.println("(Von int zu byte mit i1 = 200): b1 = " + b1);

        float f2;
        short s2 = 31000;
        f2 = s2;

        System.out.printf("2: Implizite, erweiternde: ");
        System.out.println("(Von short zu float mit s2 = 31_000): f2 = " + f2);

        int i3;
        short s3 = 33;
        i3 = (int) s3;

        System.out.printf("3: (Ersatz) Explizite, erweiternde: ");
        System.out.println("(Von short zu int mit s3 = 33): i3 = " + i3);

        short s4 = 2;
        float f4;
        f4 = s4/3;

        System.out.printf("4: Implizierte, einschränkende: ");
        System.out.println("(Von short zu float mit s4 = 2 und s4 / 3): f4 = " + f4);

    }
}
