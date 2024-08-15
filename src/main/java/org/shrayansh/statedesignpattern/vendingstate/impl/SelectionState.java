package org.shrayansh.statedesignpattern.vendingstate.impl;

import org.shrayansh.statedesignpattern.Coin;
import org.shrayansh.statedesignpattern.Item;
import org.shrayansh.statedesignpattern.VendingMachine;
import org.shrayansh.statedesignpattern.vendingstate.State;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine obj) throws Exception {
        throw new Exception("Can't click on insert coin button during selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine obj) throws Exception {
        return;
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine obj) throws Exception {
        throw new Exception("Can't insert coin during selection state");
    }

    @Override
    public void chooseProduct(VendingMachine obj, int codeNumber) throws Exception {

        //1. get item of this codeNumber
        Item item=obj.getInventory().getItem(codeNumber);

        //2. total amount paid by the user
        int paidByUser=0;
        for(Coin coin: obj.getCoinList()){
            paidByUser += coin.getValue();
        }

        //3. compare product price and amount paid by the user
        if(paidByUser < item.getPrice()){
            System.out.println("Price of the product is "+item.getPrice() + " and you paid "+paidByUser);
            refundFullMoney(obj);
            throw new Exception("Insufficient amount!");
        } else if (paidByUser >= item.getPrice()) {
            if(paidByUser>item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            obj.setVendingMachineState(new DispenseState(obj,codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returning the change money of "+returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine obj, int codeNumber) throws Exception {
        throw new Exception("Product could not be dispensed during selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine obj) throws Exception {
        System.out.println("Refunding full money in the tray");
        obj.setVendingMachineState(new IdleState());
        return obj.getCoinList();
    }
}
