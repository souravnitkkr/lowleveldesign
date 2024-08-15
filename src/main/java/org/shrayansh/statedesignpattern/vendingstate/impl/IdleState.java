package org.shrayansh.statedesignpattern.vendingstate.impl;

import org.shrayansh.statedesignpattern.Coin;
import org.shrayansh.statedesignpattern.Item;
import org.shrayansh.statedesignpattern.VendingMachine;
import org.shrayansh.statedesignpattern.vendingstate.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Currently vending machine is in idle state");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently vending machine is in idle state");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine obj) throws Exception {
        obj.setVendingMachineState(new HasMoneyState());
        System.out.println("Vending machine has been set to HasMoneyState");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine obj) throws Exception {
        throw new Exception("Can't start product selection in Idle state");
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine obj) throws Exception {
        throw new Exception("Can't insert coin in Idle state");
    }

    @Override
    public void chooseProduct(VendingMachine obj, int codeNumber) throws Exception {
        throw new Exception("Can't choose product in Idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Can't get change in Idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine obj, int codeNumber) throws Exception {
        throw new Exception("Can't dispense product in Idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine obj) throws Exception {
        throw new Exception("Can't refund full money in Idle state");
    }
}
