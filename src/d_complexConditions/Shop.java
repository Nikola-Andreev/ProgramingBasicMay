package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String product = reader.readLine();
        String town = reader.readLine();
        double quantity = Double.parseDouble(reader.readLine());

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.5);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.8);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.2);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.60);
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.4);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.50);
            }
        } else {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.1);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}
