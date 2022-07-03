package com.animal.entites;

public class Order {
            // * Order degen klass tuzunuz:orderfree, Load degen poleleri bolsun
private  int orderfree;
private  String load;

    public Order(int orderfree, String load) {
        this.orderfree = orderfree;
        this.load = load;
    }

    public int getOrderfree() {
        return orderfree;
    }

    public void setOrderfree(int orderfree) {
        this.orderfree = orderfree;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderfree=" + orderfree +
                ", load='" + load + '\'' +
                '}';
    }
}
