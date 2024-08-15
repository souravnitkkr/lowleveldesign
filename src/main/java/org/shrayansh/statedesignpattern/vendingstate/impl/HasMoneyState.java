package org.shrayansh.statedesignpattern.vendingstate.impl;

import org.shrayansh.statedesignpattern.Coin;
import org.shrayansh.statedesignpattern.Item;
import org.shrayansh.statedesignpattern.VendingMachine;
import org.shrayansh.statedesignpattern.vendingstate.State;

import java.util.Collections;
import java.util.List;

public class HasMoneyState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine obj) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine obj) throws Exception {
        obj.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine obj) throws Exception {
        System.out.println("Adding the coin");
        obj.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine obj, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine obj, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine obj) throws Exception {
        System.out.println("Refunding full money in the tray");
        obj.setVendingMachineState(new IdleState());
        return obj.getCoinList();
    }
}
