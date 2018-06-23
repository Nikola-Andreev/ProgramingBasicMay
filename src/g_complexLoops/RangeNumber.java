package g_complexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int a = Integer.valueOf(reader.readLine());
            if (a > 0 && a < 101) {
                System.out.println("The number is: " + a);
                break;
            }
            System.out.println("Invalid number!");
        }
    }
}
