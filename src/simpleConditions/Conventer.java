package simpleConditions;

import java.util.Scanner;

public class Conventer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        String from = scan.nextLine();
        String to = scan.nextLine();

        if (from.equals("mm")) {
            input = input / 1000;
        } else if (from.equals("cm")) {
            input = input / 100;
        } else if (from.equals("mi")) {
            input = input / 0.000621371192;
        } else if (from.equals("in")) {
            input = input / 39.3700787;
        } else if (from.equals("km")) {
            input = input / 0.001;
        } else if (from.equals("ft")) {
            input = input / 3.2808399;
        } else if (from.equals("yd")) {
            input = input / 1.0936133;
        }
        // Аз съм сигурен че входа е в МЕТРИ
        if (to.equals("mm")) {
            input = input * 1000;
        } else if (to.equals("cm")) {
            input = input * 100;
        } else if (to.equals("mi")) {
            input = input * 0.000621371192;
        } else if (to.equals("in")) {
            input = input * 39.3700787;
        } else if (to.equals("km")) {
            input = input * 0.001;
        } else if (to.equals("ft")) {
            input = input * 3.2808399;
        } else if (to.equals("yd")) {
            input = input * 1.0936133;
        }
        System.out.printf("%.8f %s", input, to);
    }
}
