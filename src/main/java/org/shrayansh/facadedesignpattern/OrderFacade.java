package org.shrayansh.facadedesignpattern;

public class OrderFacade {
    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    SendNotification sendNotification;

    public OrderFacade() {
        productDao = new ProductDao();
        payment = new Payment();
        invoice = new Invoice();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        productDao.getProduct(101);
        payment.makePayment(1000);
        invoice.generateInvoice();
        sendNotification.sendNotification();
        //new step for order creation
        //order creation successful
    }
}
