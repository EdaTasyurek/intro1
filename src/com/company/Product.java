package com.company;

import java.util.SplittableRandom;

public class Product { //Entitiy
    private int id;
    private String name;
    private double unitPrice;
    private  String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    //Overload

    public Product(){   //constructor
        System.out.println("ben çalıştm");

    }
    //constructor verilen değerleri classdaki değerlere esitle this. ile.
    public Product(int id , String name , double unitPrice , String detail ,double discount){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount=
        this.unitPriceAfterDiscount = unitPrice - unitPrice*(discount/100);

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return this.name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public double getDiscount() {
        return discount;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPrice - unitPrice*(discount/100);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
