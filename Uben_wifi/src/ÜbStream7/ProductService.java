package ÜbStream7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProductService {
    public Optional<Product> findMostExpensiveProduct (List<Product> products){
        return  products.stream()
                .max(Comparator.comparingDouble(Product::price));
    }
}
