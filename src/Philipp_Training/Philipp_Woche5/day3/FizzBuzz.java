package Philipp_Training.Philipp_Woche5.day3;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            StringBuilder value = new StringBuilder();
            if (i % 3 == 0) value.append("Fizz");
            if (i % 5 == 0) value.append("Buzz");
            if (!(i % 3 == 0 || i % 5 == 0)) value.append(i);
            System.out.print("\n" + value);
        }
    }

}
