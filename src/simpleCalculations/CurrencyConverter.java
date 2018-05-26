package simpleCalculations;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.valueOf(scan.nextLine());
        String from = scan.nextLine();
        String to = scan.nextLine();

        switch (from) {
            case "USD": sum *= 1.79549; break;
            case "EUR": sum *= 1.95583; break;
            case "GBP": sum *= 2.53405; break;
        }

        switch (to) {
            case "USD": sum /= 1.79549; break;
            case "EUR": sum /= 1.95583; break;
            case "GBP": sum /= 2.53405; break;
        }

        System.out.printf("%.2f %s", sum, to);
    }
}
