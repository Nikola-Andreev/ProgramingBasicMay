package c_simpleConditions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualNums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
