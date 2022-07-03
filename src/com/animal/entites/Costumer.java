package com.animal.entites;

public class Costumer {
    //* costumer degen klass tuzunuz anin:customerName,Order degen poleleri bolsun

     private String costumerName;
     private int order;

     public Costumer(String costumerName, int order) {
          this.costumerName = costumerName;
          this.order = order;
     }

     public String getCostumerName() {
          return costumerName;
     }

     public void setCostumerName(String costumerName) {
          this.costumerName = costumerName;
     }

     public int getOrder() {
          return order;
     }

     public void setOrder(int order) {
          this.order = order;
     }

     @Override
     public String toString() {
          return "Costumer:" +
                  "costumerName:'" + costumerName + '\'' +
                  ", order:" + order;
     }
}
