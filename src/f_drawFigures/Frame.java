package f_drawFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        System.out.print("+ ");
        for (int j = 0; j < n - 2; j++) {
            System.out.print("- ");
        }
        System.out.println("+");

        for (int i = 0; i < n - 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }

        System.out.print("+ ");
        for (int j = 0; j < n - 2; j++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }
}
