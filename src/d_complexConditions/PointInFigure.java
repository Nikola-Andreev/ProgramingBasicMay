package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointInFigure {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.valueOf(reader.readLine());
        int x = Integer.valueOf(reader.readLine());
        int y = Integer.valueOf(reader.readLine());

        boolean insideBottom = (x > 0 && x < h * 3 && y > 0 && y < h);
        boolean insideTop = (x > h && x < h * 2 && y > 0 && y < h * 4);
        boolean outsideTop = (x < h || x > h * 2 || y < 0 || y > h * 4);
        boolean outsideBottom = (x < 0 || x > h * 3 || y < 0 || y > h);

        if (insideBottom || insideTop) {
            System.out.println("Inside");
        } else if (outsideTop && outsideBottom) {
            System.out.println("Outside");
        } else {
            System.out.println("Border");
        }
    }
}
