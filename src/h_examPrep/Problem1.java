package h_examPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double processorPriceUSD = Double.parseDouble(reader.readLine());
        double videoCardPriceUSD = Double.parseDouble(reader.readLine());
        double ramPriceUSD = Double.parseDouble(reader.readLine());
        double ramQuantity = Double.parseDouble(reader.readLine());
        double discountPercent = Double.parseDouble(reader.readLine());

        double processorPriceLeva = processorPriceUSD * 1.57;
        double processorTotalPrice = processorPriceLeva - (processorPriceLeva * discountPercent);

        double videoCardPriceLeva = videoCardPriceUSD * 1.57;
        double videoCardTotalPrice = videoCardPriceLeva - (videoCardPriceLeva * discountPercent);

        double totalRamPrice = ramPriceUSD * ramQuantity * 1.57;

        double result = processorTotalPrice + videoCardTotalPrice + totalRamPrice;
        System.out.printf("Money needed - %.2f leva.", result);
    }
}

