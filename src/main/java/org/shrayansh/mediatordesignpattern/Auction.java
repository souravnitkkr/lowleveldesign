package org.shrayansh.mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> bidderList=new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague:bidderList){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidder,bidAmount);
            }
        }
    }
}
