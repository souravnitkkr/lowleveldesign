package org.shrayansh.statedesignpattern.vendingstate.impl;

import org.shrayansh.statedesignpattern.Coin;
import org.shrayansh.statedesignpattern.Item;
import org.shrayansh.statedesignpattern.VendingMachine;
import org.shrayansh.statedesignpattern.vendingstate.State;

import java.util.Collections;
import java.util.List;

public class DispenseState implements State {

    private VendingMachine vendingMachine;
    private int codeNumber;

    public DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {
        this.vendingMachine = vendingMachine;
        this.codeNumber = codeNumber;
        dispenseProduct(vendingMachine,codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine obj) throws Exception {
        throw new Exception("Can't click on insertcoinbutton in dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine obj) throws Exception {
        throw new Exception("can't click on start product selection button in dispense state");
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine obj) throws Exception {
        throw new Exception("Can't insert coin in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine obj, int codeNumber) throws Exception {
        throw new Exception("Product can't be choosen in dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Changed can't be given during dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine obj, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item=obj.getInventory().getItem(codeNumber);
        obj.getInventory().updateSoldOutItem(codeNumber);
        obj.setVendingMachineState(new IdleState(obj));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine obj) throws Exception {
        throw new Exception("Can't refund full money during dispense state");
    }

}
