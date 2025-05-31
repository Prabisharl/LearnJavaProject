package org7.example.encapsulation;

public class Product {
    private String productName;
    private double price;
    private double discount;


    public String getProductname(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }


    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price>0) {
            this.price = price;
        }else{
            System.out.println("Invalid price");
        }
    }


    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        if(discount>0 && discount<=50){
            this.discount=discount;
        }else{
            System.out.println("Discount must be 0% and 50%");
        }
    }



    public double getFinalprice(){
        return price-(price*discount/100);
    }

    public static void main(String[] args) {

        Product productPhone1 = new Product();
        productPhone1.setProductName("Samsung galaxy");
        productPhone1.setPrice(10000);
        productPhone1.setDiscount(10);
        System.out.println("Final price:"+productPhone1.getFinalprice());


        Product productPhone2 = new Product();
        productPhone2.setProductName("Vivo");
        productPhone2.setPrice(20000);
        productPhone2.setDiscount(10);
        System.out.println("Final price:"+productPhone2.getFinalprice());

    }
}
