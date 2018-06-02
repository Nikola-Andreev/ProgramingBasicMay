package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleBorder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());
        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());

        boolean isOnLeftSide = (x == x1 && y >= y1 && y <= y2);
        boolean isOnRightSide = (x == x2 && y >= y1 && y <= y2);
        boolean isOnTopSide = (y == y1 && x >= x1 && x <= x2);
        boolean isOnBottomSide = (y == y2 && x >= x1 && x <= x2);
        if (isOnBottomSide || isOnLeftSide || isOnRightSide || isOnTopSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
