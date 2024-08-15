package org.shrayansh.statedesignpattern;

import java.util.Map;

public class Inventory {

    private ItemShelf inventory[]=null;

    public Inventory(int shelfCount){
        inventory=new ItemShelf[shelfCount];
        initiateEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initiateEmptyInventory(){
        int startCode=101;
        for(int i=0;i< inventory.length;i++){
            ItemShelf space=new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]=space;
            startCode++;
        }
    }

    public void addItem(Item item,int codeNumber) throws Exception{
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.getCode() == codeNumber){
                if(itemShelf.isSoldOut){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }
                else{
                    throw new Exception("Can't add item, as it is already present");
                }
            }
        }
    }

    public static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for(int i=0;i< slots.length;i++){
            Item item=new Item();
            if(i>=0 && i <3){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(10);
            } else if (i>=3 && i<5) {
                item.setItemType(ItemType.COKE);
                item.setPrice(15);
            } else if (i>=5 && i<7) {
                item.setItemType(ItemType.JUICE);
                item.setPrice(18);
            } else if(i>=7 && i<10) {
                item.setItemType(ItemType.SODA);
                item.setPrice(20);
            }
            slots[i].setSoldOut(false);
            slots[i].setItem(item);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for(int i=0;i<slots.length;i++){
            System.out.println("Item code = "+ slots[i].code + " Item price = "+slots[i].item.getPrice() +
             " Item Type = "+slots[i].item.itemType + " Is sold out " +slots[i].isSoldOut);
        }
    }

    public Item getItem(int codeNumber){
        for(int i=0;i< inventory.length;i++){
            if(inventory[i].getCode() == codeNumber)
                return inventory[i].getItem();
        }
        return null;
    }

    public void updateSoldOutItem(int codeNumber){
        for(int i=0;i< inventory.length;i++){
            if(inventory[i].getCode() == codeNumber)
                inventory[i].setSoldOut(true);
        }
    }

}
