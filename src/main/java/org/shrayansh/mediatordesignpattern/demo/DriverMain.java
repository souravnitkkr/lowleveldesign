package org.shrayansh.mediatordesignpattern.demo;

public class DriverMain {
    public static void main(String[] args) {
        AuctionMediator auctionMediator=new Auction();
        Colleague bidder1=new Bidder(auctionMediator,"Ram");
        Colleague bidder2=new Bidder(auctionMediator,"Shyam");
        Colleague bidder3=new Bidder(auctionMediator,"Radhe");
        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);
        auctionMediator.addBidder(bidder3);

        bidder3.placeBid(1000);
        bidder2.placeBid(2000);


    }
}
