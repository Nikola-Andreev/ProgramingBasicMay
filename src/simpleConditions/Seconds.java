package simpleConditions;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sec1 = Integer.parseInt(scan.nextLine());
        int sec2 = Integer.parseInt(scan.nextLine());
        int sec3 = Integer.parseInt(scan.nextLine());

        int total = sec1 + sec2 + sec3;
        int min = total / 60;
        int sec = total % 60;

        if (sec < 10) {
            System.out.println(min + ":0" + sec);
        } else {
            System.out.println(min + ":" + sec);
        }
    }
}
