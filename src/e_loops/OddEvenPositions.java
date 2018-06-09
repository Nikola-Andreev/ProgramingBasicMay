package e_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class OddEvenPositions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -Double.MAX_VALUE;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(reader.readLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.################");
        System.out.println("OddSum=" + df.format(oddSum));
        System.out.println("OddMin=" + (oddMin == Double.MAX_VALUE ? "No" : df.format(oddMin)));
        System.out.println("OddMax=" + (oddMax == -Double.MAX_VALUE ? "No" : df.format(oddMax)));
        System.out.println("EvenSum=" + df.format(evenSum));
        System.out.println("EvenMin=" + (evenMin == Double.MAX_VALUE ? "No" : df.format(evenMin)));
        System.out.println("EvenMax=" + (evenMax == -Double.MAX_VALUE ? "No" : df.format(evenMax)));
    }
}
