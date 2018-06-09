package c_simpleConditions;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        double bonus = 0.0;

        if (num <= 100) {
            bonus = bonus + 5;
        } else if (num > 1000) {
            bonus = bonus + num * 0.1;
        } else {
            bonus = bonus + num * 0.2;
        }

        if (num % 2 == 0) {
            bonus += 1;
        } else if (num % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
