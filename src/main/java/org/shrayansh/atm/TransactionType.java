package org.shrayansh.atm;

public enum TransactionType {
    CASH_WITHDRAWAL,BALANCE_CHECK;

    public static void showAllTransactionType(){
        for(TransactionType transactionType:TransactionType.values()){
            System.out.println(transactionType.name());
        }
    }

}
