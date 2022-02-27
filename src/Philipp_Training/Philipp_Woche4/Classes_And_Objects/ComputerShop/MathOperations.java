package Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop;

public class MathOperations {
    public static double reduceDecimals(double value) {
        return Math.round(Math.pow(10.0, 2) * value) / Math.pow(10.0, 2);
    }

    public static double getComputerProfit(Computer[] computers){
        double completeProfit = 0;
        for (Computer computer : computers) {
            completeProfit += computer.getProfit();
        }
        return MathOperations.reduceDecimals(completeProfit);
    }
}
