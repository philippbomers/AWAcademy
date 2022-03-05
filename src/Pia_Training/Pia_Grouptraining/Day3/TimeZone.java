package Pia_Training.Pia_Grouptraining.Day3;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeZone {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        String str = "";
        for (int i = 0; i < 200000; i++){
            str += "!";
        }
        long millis = now.until(ZonedDateTime.now(), ChronoUnit.MILLIS);
        System.out.println("String: " + millis + " ms");
        ZonedDateTime nowAgain = ZonedDateTime.now();
        StringBuilder strbldr = new StringBuilder();
        for (int j = 0; j < 200000; j++){
            strbldr.append("!");
        }
        long millisAgain = nowAgain.until(ZonedDateTime.now(), ChronoUnit.MILLIS);
        System.out.println("StringBuilder: " + millisAgain + " ms");
    }
}
