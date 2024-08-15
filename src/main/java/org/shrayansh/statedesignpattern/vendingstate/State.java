package org.shrayansh.statedesignpattern.vendingstate;

import org.shrayansh.statedesignpattern.Coin;
import org.shrayansh.statedesignpattern.Item;
import org.shrayansh.statedesignpattern.VendingMachine;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine obj) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine obj) throws Exception;
    void insertCoin(Coin coin,VendingMachine obj) throws Exception;
    void chooseProduct(VendingMachine obj,int codeNumber) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    Item dispenseProduct(VendingMachine obj,int codeNumber) throws Exception;
    List<Coin> refundFullMoney(VendingMachine obj) throws Exception;
}
