package ÜbStream5;

import java.util.List;

public class OrderService {
    public  boolean isThereAnOrderAboveHundert(List<Order> orders){
        return orders.stream()
                .anyMatch(order -> order.total() > 100);
    }
}
