package org.shrayansh.statedesignpattern;

import org.shrayansh.statedesignpattern.vendingstate.State;
import org.shrayansh.statedesignpattern.vendingstate.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Coin> coinList;
    State state;
    Inventory inventory;

    public VendingMachine() {
        coinList=new ArrayList<>();
        state=new IdleState();
        inventory=new Inventory(10);
    }

    public void setCoinList(List<Coin> coinList){
        this.coinList=coinList;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setVendingMachineState(State state){
        this.state=state;
    }

    public State getState() {
        return state;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
