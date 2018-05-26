package simpleConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hours = Integer.valueOf(reader.readLine());
        int minutes = Integer.valueOf(reader.readLine()) + 15;

        if (minutes >= 60) {
            hours++;
            minutes = minutes - 60;
            if (hours > 23) {
                hours = 0;
            }
        }

        if (minutes < 10) {
            System.out.println(hours + ":0" + minutes);
        } else {
            System.out.println(hours + ":" + minutes);
        }
    }
}
