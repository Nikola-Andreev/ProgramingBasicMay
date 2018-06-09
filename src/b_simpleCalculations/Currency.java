package b_simpleCalculations;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine());
        String from = scan.nextLine();
        String to = scan.nextLine();
        // BGN EUR GBP USD
        if (from.equals("USD")) {
            sum = sum * 1.79549;
        } else if (from.equals("EUR")) {
            sum = sum * 1.95583;
        } else if (from.equals("GBP")) {
            sum = sum * 2.53405;
        }
        // BGN
        if (to.equals("USD")) {
            sum = sum / 1.79549;
        } else if (to.equals("EUR")) {
            sum = sum / 1.95583;
        } else if (to.equals("GBP")) {
            sum = sum / 2.53405;
        }
        System.out.printf("%.2f %s", sum, to);
    }
}
