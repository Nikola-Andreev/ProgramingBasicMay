package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDay {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());

        switch (a) {
            case 1 :
            case 2:
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
