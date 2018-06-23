package g_complexLoops.examProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        for (int m = 1; m <= 9; m++) {
                            for (int n = 1; n <= 9; n++) {
                                int result = i * j * k * l * m * n;
                                if (result == a) {
                                    System.out.print("" + i+j+k+l+m+n + " ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
