package g_complexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());

        while (b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println(a);
    }
}
