package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        int slashesCount = (n + 5 - 1) / 2;

        System.out.print(repeat("_", slashesCount));
        System.out.print("^");
        System.out.println(repeat("_", slashesCount));
        slashesCount--;

        System.out.print(repeat("_", slashesCount));
        System.out.print("/|\\");
        System.out.println(repeat("_", slashesCount));
        slashesCount--;

        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeat("_", slashesCount));
            System.out.print("/");
            System.out.print(repeat(".", i));
            System.out.print("|||");
            System.out.print(repeat(".", i));
            System.out.print("\\");
            System.out.println(repeat("_", slashesCount));
            slashesCount--;
        }

        slashesCount = (n + 5 - 9) / 2;
        for (int i = 2; i > 0; i--) {
            System.out.print(repeat("_", slashesCount));
            System.out.print("/");
            System.out.print(repeat(".", i));
            System.out.print("|||");
            System.out.print(repeat(".", i));
            System.out.print("\\");
            System.out.println(repeat("_", slashesCount));
            slashesCount++;
        }
        slashesCount++;

        for (int i = 0; i < n; i++) {
            System.out.print(repeat("_", slashesCount));
            System.out.print("|||");
            System.out.println(repeat("_", slashesCount));
        }

        System.out.print(repeat("_", slashesCount));
        System.out.print("~~~");
        System.out.println(repeat("_", slashesCount));

        for (int i = 0; i < n / 2; i++) {
            slashesCount--;
            System.out.print(repeat("_", slashesCount));
            System.out.print("//");
            System.out.print(repeat(".", i));
            System.out.print("!");
            System.out.print(repeat(".", i));
            System.out.print("\\\\");
            System.out.println(repeat("_", slashesCount));
        }
    }

    private static String repeat(String symbol, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}
