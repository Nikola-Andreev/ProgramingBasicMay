package g_complexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence2k {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int num = 1;

        while (num <= a) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
