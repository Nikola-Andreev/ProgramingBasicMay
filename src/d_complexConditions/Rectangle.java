package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());
        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
