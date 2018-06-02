package d_complexConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitOrVegetable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String item = reader.readLine();

        if (item.equals("banana") || item.equals("apple") || item.equals("kiwi")
                || item.equals("cherry") || item.equals("lemon") || item.equals("grapes")) {
            System.out.println("fruit");
        } else if (item.equals("tomato") || item.equals("cucumber")
                || item.equals("pepper") || item.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
