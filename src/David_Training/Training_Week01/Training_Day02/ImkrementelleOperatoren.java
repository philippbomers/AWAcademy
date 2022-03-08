package David_Training.Training_Week01.Training_Day02;

public class ImkrementelleOperatoren {
    public static void main(String[] args) {
        int i = 1;

        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // Kundencode
        int j = 42;
        int k = j++ + ++j;
        // int k = 42 + 44;
        System.out.println("k = " + k);

        // Assioziative Operatoren
        int num = 43;
        num += 100;
        num -= 24;
        num *= 2;
        num /= 5;
        System.out.println("num = " + num);
    }
}
