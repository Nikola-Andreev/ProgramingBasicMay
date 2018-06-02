package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volleyball {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String isLeap = reader.readLine();
        double yearHolidays = Double.parseDouble(reader.readLine());
        double yearWeekends = Double.parseDouble(reader.readLine());

        double saturdayPlays = (48 - yearWeekends) * 3 / 4;
        double holidayPlays = yearHolidays * 2 / 3;
        double totalPlays = saturdayPlays + holidayPlays + yearWeekends;

        if (isLeap.equals("leap")) {
            totalPlays += totalPlays * 0.15;
        }
        System.out.println(Math.floor(totalPlays));
    }
}
