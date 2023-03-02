package aulas;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Enumerações
        Order order = new Order(1080, OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        // Conversao de String para enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("SHIPPED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
