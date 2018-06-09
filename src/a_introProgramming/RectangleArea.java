package a_introProgramming;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.valueOf(scan.nextLine());
        double b = Double.valueOf(scan.nextLine());
        double result = a * b;
        System.out.println(result);
    }
}
