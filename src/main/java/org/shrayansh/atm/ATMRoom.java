package org.shrayansh.atm;

public class ATMRoom {

    ATM atm;
    User user;

    public static void main(String[] args) throws Exception {

        ATMRoom atmRoom=new ATMRoom();
        atmRoom.initialize();

        //want to withdraw cash

        //1. inserting ATM card in the ATM
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.getCard());

        //2. authenticating PIN
        atmRoom.atm.getAtmState().enterPIN(atmRoom.atm, atmRoom.user.getCard(),1234);

        //3. selecting operation
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard(),TransactionType.CASH_WITHDRAWAL);

        //4. withdrawing cash
        atmRoom.atm.getAtmState().withDrawCash(atmRoom.atm, atmRoom.user.getCard(),3600);

        //want to check balance

        //1. inserting ATM card in the ATM
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.getCard());

        //2. authenticating PIN
        atmRoom.atm.getAtmState().enterPIN(atmRoom.atm, atmRoom.user.getCard(),1234);

        //3. selecting operation
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard(),TransactionType.BALANCE_CHECK);

        //4. checking balance
        atmRoom.atm.getAtmState().checkBalance(atmRoom.atm, atmRoom.user.getCard());
    }

    private void initialize(){
        //getting ATM object
        atm=ATM.getInstance();
        //setting ATM initial balance
        atm.setAtmBalance(3500,1,2,5);
        user=createUser();
    }

    public BankAccount createBankAccount(int initialBalance){
        //creating bank account
        BankAccount bankAccount=new BankAccount(initialBalance);
        return bankAccount;
    }

    public Card createCard(BankAccount bankAccount){
        //creating card
        Card card=new Card();
        card.setBankAccount(bankAccount);
        return card;
    }

    public User createUser(){
        //creating user
        User user=new User();
        BankAccount bankAccount=createBankAccount(4700);
        user.setBankAccount(bankAccount);
        Card card = createCard(bankAccount);
        user.setCard(card);
        return user;
    }
}
