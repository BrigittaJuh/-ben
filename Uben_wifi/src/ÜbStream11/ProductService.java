package ÜbStream11;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductService {
    public Set<String> findCategory(List<Product> products){
        return (Set<String>) products.stream()
                .map(Product::category)
                .collect(Collectors.toList());
    }
}
