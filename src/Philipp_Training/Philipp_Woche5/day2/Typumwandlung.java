package Philipp_Training.Philipp_Woche5.day2;

public class Typumwandlung {
    public static void main(String[] args) {
        task2();
        task22();
    }

    public static void task2(){
        // autoboxing, implizites casten
        Integer x=3;
        Double y=5.0;
        System.out.println("result = " + (((x*4)-(y/8))+7));
    }

    public static void task22(){
        // boxing, explizites casten
        Integer x= Integer.valueOf(3);
        Double y = Double.valueOf(5.0);
        double result = ((x.intValue()*4)-(y.doubleValue()/8))+7;
        System.out.println("result = " + result);
    }

    public static void task1(){
        // explizit einschränkend
        int intNumber = 200;
        byte byteNumber = (byte) intNumber;
        System.out.println("int: "+ intNumber);
        System.out.println("byte: "+ byteNumber);

        System.out.println();

        // implizit erweiternd
        short shortNumber = 2134;
        float floatNumber = shortNumber;
        System.out.println("short: "+ shortNumber);
        System.out.println("float: " + floatNumber);

        System.out.println();

        // Nur explizit möglich bei einschränkend
        float floatNumber2 = 1234f;
        short shortNumber2 = (short) floatNumber2;
        System.out.println("short: "+ shortNumber2);
        System.out.println("float: " + floatNumber2);

        System.out.println();

        // implizit erweiternd (explizit nicht notwendig)
        short shortNumber3 = 123;
        int intNumber2 = shortNumber3;
        System.out.println("short: " + shortNumber3);
        System.out.println("int: " + intNumber2);
    }
}
