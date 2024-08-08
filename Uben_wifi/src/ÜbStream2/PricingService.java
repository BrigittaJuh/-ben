package ÜbStream2;

import java.util.List;

public class PricingService {
    public List<Double> getPricesWithVat(List<Double> prices) {
        return prices.stream()
                .map(price -> price * 1.2)
                .toList();

    }
}
