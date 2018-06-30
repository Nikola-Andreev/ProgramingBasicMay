package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char a = reader.readLine().charAt(0);
        int aIncrement = Integer.valueOf(reader.readLine());
        char b = reader.readLine().charAt(0);
        int bIncrement = Integer.valueOf(reader.readLine());
        char c = reader.readLine().charAt(0);
        int cIncrement = Integer.valueOf(reader.readLine());

        char aResult = (char) (a + aIncrement);
        char bResult = (char) (b + bIncrement);
        char cResult = (char) (c + cIncrement);
        String result = "" + aResult + bResult + cResult;

        System.out.println(result);
        if (result.equals("@@@")) {
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else if (result.equals("777")) {
            System.out.println("*** JACKPOT ***");
        }
    }
}
