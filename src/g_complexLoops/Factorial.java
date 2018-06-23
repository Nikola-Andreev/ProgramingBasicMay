package g_complexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int num = 1;

        do {
            num = num * a;
            a--;
        } while (a > 0);
        System.out.println(num);
    }
}
