package introProgramming;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.valueOf(scan.nextLine());
        System.out.println(new String(new char[size]).replace("\0", "*"));
        for (int i = 0; i < size-2; i++) {
            System.out.print("*");
            System.out.print(new String(new char[size-2]).replace("\0", " "));
            System.out.println("*");
        }
        System.out.println(new String(new char[size]).replace("\0", "*"));
    }
}
