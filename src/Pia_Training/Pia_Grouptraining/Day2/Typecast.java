package Pia_Training.Pia_Grouptraining.Day2;

public class Typecast {
    public static void main(String[] args) {

        //Einschränkende, explizite Typumwandlung mit int und short
        int valueInt = 128;
        byte valueByte = (byte) valueInt;

        //Erweiternde, implizite Typumwandlung mit short und float
        short valueShort = 2022;
        float valueFloat = valueShort;
        System.out.println(valueFloat);

        //Einschränkende, implizite Typumwandlung mit short und float in einer Division
        short sho = 32;
        float flo = sho/8;
        System.out.println(flo);

        //Erweiternde, explizite Typumwandlung mit int und short
        valueInt = (int) sho;

        //Implizites Autoboxing
        Integer x = 3;
        Double y = 5.0;
        System.out.println((x*4-(y/8)) + 7);

        //Explizites Boxing
        Integer.valueOf(3);
        Double.valueOf(5.0);
        System.out.println(x.intValue()*4-y.doubleValue()/8+7);



    }
}
