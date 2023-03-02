package Exercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItens = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        orderItens.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItens.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem i : orderItens) {
            sum = i.getPrice();
        }
        return sum;
    }
}

