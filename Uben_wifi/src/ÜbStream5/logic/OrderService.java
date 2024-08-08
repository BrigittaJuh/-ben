package ÜbStream5.logic;

import ÜbStream5.date.Order;

import java.util.List;

public class OrderService {
    public  boolean isThereAnOrderAboveHundert(List<Order> orders){
        return orders.stream()
                .anyMatch(order -> order.total() > 100);
    }
}
