package org.shrayansh.mediatordesignpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> bidderList=new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
        for(Colleague colleague: bidderList){
            if(!bidder.getName().equals(colleague.getName()))
                colleague.receiveNotification(bidder, amount);
        }
    }
}
