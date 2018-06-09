package b_simpleCalculations;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String city = scan.nextLine();
        System.out.println("You are " + firstName + " " + lastName +
                        ", a " + age + "-years old person from " + city + ".");
    }
}
