package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.valueOf(reader.readLine());
        int length = Integer.valueOf(reader.readLine());
        int piecesCount = width * length;

        while (true) {
            String command = reader.readLine();
            if (command.equals("STOP")) {
                System.out.println(piecesCount + " pieces are left.");
                break;
            }
            piecesCount -= Integer.parseInt(command);
            if (piecesCount < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCount));
                break;
            }
        }
    }
}
