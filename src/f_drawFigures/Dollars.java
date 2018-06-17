package f_drawFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dollars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
