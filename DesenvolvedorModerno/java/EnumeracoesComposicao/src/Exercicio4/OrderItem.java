package Exercicio4;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;


    private List<Product> products = new ArrayList<>();
    private OrderStatus status;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
    public void setStatus(OrderStatus v) {
        status = v;
    }

    public double subTotal() {
        return quantity * price;
    }
}
