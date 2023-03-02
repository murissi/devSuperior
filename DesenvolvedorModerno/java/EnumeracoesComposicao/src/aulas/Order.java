package aulas;

import aulas.OrderStatus;

import java.sql.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    // Sobrecarga
    public Order() {
    }

    public Order(Integer id,  OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        return "aulas.Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
