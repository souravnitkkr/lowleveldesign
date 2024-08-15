package org.shrayansh.mediatordesignpattern;

public class DriverMain {
    public static void main(String[] args) {

        AuctionMediator auctionMediator=new Auction();

        Colleague bidder1=new Bidder("Rajat",auctionMediator);
        Colleague bidder2=new Bidder("Sourav",auctionMediator);
        Colleague bidder3=new Bidder("Anant",auctionMediator);
        Colleague bidder4=new Bidder("Alok",auctionMediator);

        System.out.println("When Rajat is placing a bid");
        bidder1.placeBid(200);

        System.out.println("When Sourav is placing a bid");
        bidder2.placeBid(300);

//        auctionMediator.placeBid(bidder1,200);
//        auctionMediator.placeBid(bidder2,300);
    }
}
