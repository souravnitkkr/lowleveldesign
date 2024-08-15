package org.shrayansh.facadedesignpattern;

public class ProductDao {
    Product getProduct(int pId){
        System.out.println("Getting the product of productId = "+pId);
        return new Product();
    }
}
