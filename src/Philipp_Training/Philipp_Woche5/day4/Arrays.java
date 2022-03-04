package Philipp_Training.Philipp_Woche5.day4;

public class Arrays {
    public static void main(String[] args) {
//        taskOne();
//        taskOneBonus();

        int[] myNumbers = {1,4,51,532,1,-124,-125,32};
        System.out.println("max: "+ArrayHelper.maxNumber(myNumbers));
        System.out.println("min: "+ArrayHelper.minNumber(myNumbers));
        System.out.println("sum: "+ArrayHelper.sum(myNumbers));
    }

    public static void taskOne() {
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int minimum, maximum, sum;
        minimum = maximum = input[0];
        sum = 0;
        for (int item : input) {
            sum += item;
            if (item < minimum) minimum = item;
            if (item > maximum) maximum = item;
        }
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);
        System.out.println("sum = " + sum);
    }

    public static void taskOneBonus() {
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};

        int counter = input.length;
        int[] result = new int[counter];
        for (int item : input) {
            if (item % 2 == 0) {
                result[input.length - counter] = item;
                counter--;
            } else {
                int[] newArray = new int[input.length - 1];
                int i = 0;
                for (int value : input) {
                    if(value!=item){
                        newArray[i++] = value;
                        result = newArray;
                    }
                }
            }
        }

        for (int value : result) {
            System.out.println("item = " + value);
        }

    }
}
