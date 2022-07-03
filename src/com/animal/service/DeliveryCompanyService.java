package com.animal.service;

import com.animal.entites.DeliveryCompany;

import java.util.List;
import java.util.Scanner;

public class DeliveryCompanyService {
    private List<DeliveryCompany> deliveryCompanies;

    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public List<DeliveryCompany> getDeliveryCompanies() {
        return deliveryCompanies;
    }

    public void setDeliveryCompanies(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    @Override
    public String toString() {
        return "DeliveryCompanyService{" +
                "deliveryCompanies=" + deliveryCompanies +
                '}';
    }

    Scanner scanner = new Scanner(System.in);

    public void acceptOrder() {
        String accept = scanner.nextLine();


    }

    public void createDeliveryCompany() {


    }

    public void getTotalFree() {

    }

    public void getcompanyProfit() {

    }


}
