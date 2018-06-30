package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double budged = Double.parseDouble(reader.readLine());
        double chocolatesCount = Double.valueOf(reader.readLine());
        double milkLitres = Double.valueOf(reader.readLine());

        double chocolatesCost = chocolatesCount * 0.65;
        double milkCost = milkLitres * 2.7;
        double mandarinCount = Math.floor(chocolatesCount - (chocolatesCount * 0.35));
        double mandarinCost = mandarinCount * 0.2;
        double totalCost = chocolatesCost + milkCost + mandarinCost;
        double difference = Math.abs(budged - totalCost);

        if (budged >= totalCost) {
            System.out.printf("You got this, %.2f money left!", difference);
        } else {
            System.out.printf("Not enough money, you need %.2f more!", difference);
        }
    }
}
