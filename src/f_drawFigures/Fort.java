package f_drawFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());

        System.out.print("/");
        System.out.print(repeatString("^", n / 2));
        System.out.print("\\");
        int slashesCount = n * 2 - ((n / 2 + 2) * 2);
        System.out.print(repeatString("_", slashesCount));
        System.out.print("/");
        System.out.print(repeatString("^", n / 2));
        System.out.println("\\");

        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            System.out.print(repeatString(" ", 2 * n - 2));
            System.out.println("|");
        }

        System.out.print("|");
        System.out.print(repeatString(" ", n / 2 + 1));
        System.out.print(repeatString("_", slashesCount));
        System.out.print(repeatString(" ", n / 2 + 1));
        System.out.println("|");

        System.out.print("\\");
        System.out.print(repeatString("_", n / 2));
        System.out.print("/");
        System.out.print(repeatString(" ", slashesCount));
        System.out.print("\\");
        System.out.print(repeatString("_", n / 2));
        System.out.println("/");
    }

    private static String repeatString(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}
