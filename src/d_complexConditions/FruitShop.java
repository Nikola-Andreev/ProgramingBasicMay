package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitShop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fruit = reader.readLine();
        String day = reader.readLine();
        double quantity = Double.parseDouble(reader.readLine());
        boolean isWeekDay = (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"));
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        boolean flag = false;

        if (fruit.equals("banana")) {
            if (isWeekend) {
                System.out.println(quantity * 2.7);
            } else if (isWeekDay) {
                System.out.println(quantity * 2.5);
            }
        } else if (fruit.equals("apple")) {
            if (isWeekend) {
                System.out.println(quantity * 1.25);
            } else if (isWeekDay) {
                System.out.println(quantity * 1.2);
            }
        } else if (fruit.equals("orange")) {
            if (isWeekend) {
                System.out.println(quantity * 0.9);
            } else if (isWeekDay) {
                System.out.println(quantity * 0.85);
            }
        } else if (fruit.equals("grapefruit")) {
            if (isWeekend) {
                System.out.println(quantity * 1.6);
            } else if (isWeekDay) {
                System.out.println(quantity * 1.45);
            }
        } else if (fruit.equals("kiwi")) {
            if (isWeekend) {
                System.out.println(quantity * 3);
            } else if (isWeekDay) {
                System.out.println(quantity * 2.7);
            }
        } else if (fruit.equals("pineapple")) {
            if (isWeekend) {
                System.out.println(quantity * 5.6);
            } else if (isWeekDay) {
                System.out.println(quantity * 5.5);
            }
        } else if (fruit.equals("grapes")) {
            if (isWeekend) {
                System.out.println(quantity * 4.2);
            } else if (isWeekDay) {
                System.out.println(quantity * 3.85);
            }
        } else {
            System.out.println("error");
            flag = true;
        }

        if (!isWeekDay && !isWeekend && !flag) {
            System.out.println("error");
        }
    }
}
