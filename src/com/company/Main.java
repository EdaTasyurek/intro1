package com.company;

public class Main {
    //camelCase : ilk harf küçük diğerleri büyük fonksiyonlar camelCase ile yazılır
    //SOLID kod yzarken uyulması gereken prensipler.
    //Single Respon : her classın bir işi olmalı.birden faazla işi olmamalı.
    //

    public static void main(String[] args) {

        Product product1 = new Product(1,"Dell",10000,"8 gb ram" ,10 ); //instance

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println("1.değişiklik");

        System.out.println(product1.getDetail());
        product1.setDetail("16 gb ram");
        System.out.println(product1.getDetail());
        System.out.println(product1.getUnitPriceAfterDiscount());


      //  Product product2 = new Product();
       // product2.name = "Asus";
        //product2.id = 2;
       // product2.unitPrice = 20000;
        //product2.detail = "16 gb ram";


        //Product product3 = new Product();
        //product3.name = "Lenovo";
        //product3.id = 3;
        //product3.unitPrice = 30000;
        //product3.detail = "32 gb ram";

        //ProductManager productManager  = new ProductManager();
       // productManager.addToCard(product1);
       // productManager.addToCard(product2);
      //  productManager.addToCard(product3);


      //  Product[] products ={product1  , product2 , product3};
// class a : array --> productsın içindeki arrayleri dolaşıyor. her seferinde a değeri değişir
        //for(Product product:products) {
           // System.out.println(product.name);
        }
    }


