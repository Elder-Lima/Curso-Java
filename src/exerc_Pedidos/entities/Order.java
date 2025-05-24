package exerc_Pedidos.entities;

import aulas.Data;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Data moment;
    private OrderItem status;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Data moment, OrderItem status) {
        this.moment = moment;
        this.status = status;
    }

    public Data getMoment() {
        return moment;
    }

    public void setMoment(Data moment) {
        this.moment = moment;
    }

    public OrderItem getStatus() {
        return status;
    }

    public void setStatus(OrderItem status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {

    }
}
