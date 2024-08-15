package org.shrayansh.statedesignpattern;

import org.shrayansh.statedesignpattern.vendingstate.State;

import static org.shrayansh.statedesignpattern.Inventory.displayInventory;
import static org.shrayansh.statedesignpattern.Inventory.fillUpInventory;

public class DriverMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        try{

            System.out.println("|");
            System.out.println("Filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("Click on the InsertCoinButton");
            System.out.println("|");

            State vendingState=vendingMachine.getState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState=vendingMachine.getState();
            vendingState.insertCoin(Coin.NICKEL,vendingMachine);
            vendingState.insertCoin(Coin.QUARTER,vendingMachine);

            System.out.println("|");
            System.out.println("Click on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState=vendingMachine.getState();
            vendingState.chooseProduct(vendingMachine,102);

            displayInventory(vendingMachine);

        }catch (Exception ex){
            displayInventory(vendingMachine);
        }
    }
}
