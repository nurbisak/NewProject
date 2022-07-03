package com.animal;

import com.animal.entites.Costumer;

public class Main {

    public static void main(String[] args) {
        /** Entities degen paket tuzunuz:
         * Load degen klass tuzunuz anin:height,width,weight degen poleleri bolsun.
         * Order degen klass tuzunuz:orderfree Load degen poleleri bolsun
         * Customer degen klass tuzunuz anin:customerName,Order degen poleleri bolsun
         * DeliveryCompany degen klass tuzunuz anin:deliveryCompanyName
         * (Constanta) pricePerkilogram customers,(konstanta)
         * maxCapacityPerSquareMeter (Constanta)  degen polesi bolsun
         *
         * Service degen paket tuzunuz ichine:DeliveryCompanyService degen klass tuzunuz ichine
         * deliveryCompanies polesi, acceptOrder degen metodu bir deliveryCompanyge zakaz kilat,
         * companynin batkizuu limiti teksherilet,
         * createDeliveryCompany metodu kompaniyalardy tuzup beret,
         * getTotalFree metodu bir belgiluu kishinin bardyk zakazdaryn summasin taap beret
         * getcompanyProfit metodu kompanienin tapkan paidasyn taap beret.
         * main deegen pakettin icinde Main klass bolsun mainden jazgan kodunuzdu
         * ishteshin teksheruuchu kod jaziniz.
         */
        Costumer costumer =new Costumer("s",1);

    }
}
