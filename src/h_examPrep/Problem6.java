package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char startSymbol = reader.readLine().charAt(0);
        char endSymbol = reader.readLine().charAt(0);
        char symbolToSkip = reader.readLine().charAt(0);
        int counter = 0;

        for (char i = startSymbol; i <= endSymbol; i++) {
            for (char j = startSymbol; j <= endSymbol; j++) {
                for (char k = startSymbol; k <= endSymbol; k++) {
                    if (i != symbolToSkip && j != symbolToSkip && k != symbolToSkip) {
                        System.out.print("" + i + j + k + " ");
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
