package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commission {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String town = reader.readLine();
        double sum = Double.parseDouble(reader.readLine());

        if (sum < 0) {
            System.out.println("error");
        } else {
            if (town.equals("Sofia")) {
                if (sum > 0 && sum <= 500) {
                    System.out.printf("%.2f", sum * 0.05);
                } else if (sum <= 1000) {
                    System.out.printf("%.2f", sum * 0.07);
                } else if (sum <= 10000) {
                    System.out.printf("%.2f", sum * 0.08);
                } else if (sum > 10000) {
                    System.out.printf("%.2f", sum * 0.12);
                }
            } else if (town.equals("Plovdiv")) {
                if (sum > 0 && sum <= 500) {
                    System.out.printf("%.2f", sum * 0.055);
                } else if (sum > 0 && sum <= 1000) {
                    System.out.printf("%.2f", sum * 0.08);
                } else if (sum <= 10000) {
                    System.out.printf("%.2f", sum * 0.12);
                } else if (sum > 10000) {
                    System.out.printf("%.2f", sum * 0.145);
                }
            } else if (town.equals("Varna")) {
                if (sum > 0 && sum <= 500) {
                    System.out.printf("%.2f", sum * 0.045);
                } else if (sum <= 1000) {
                    System.out.printf("%.2f", sum * 0.075);
                } else if (sum <= 10000) {
                    System.out.printf("%.2f", sum * 0.10);
                } else if (sum > 10000) {
                    System.out.printf("%.2f", sum * 0.13);
                }
            } else {
                System.out.println("error");
            }
        }
    }
}
