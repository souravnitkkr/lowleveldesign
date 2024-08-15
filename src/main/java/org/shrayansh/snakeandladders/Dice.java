package org.shrayansh.snakeandladders;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    private int min=1;
    private int max=6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int totalSum=0;
        int count=1;
        while (count<=diceCount){
            int roll = ThreadLocalRandom.current().nextInt(min,max+1);
            totalSum += roll;
            count++;
        }
        return totalSum;
    }
}
