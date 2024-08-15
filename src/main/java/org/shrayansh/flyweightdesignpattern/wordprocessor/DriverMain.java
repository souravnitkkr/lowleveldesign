package org.shrayansh.flyweightdesignpattern.wordprocessor;

public class DriverMain {
    public static void main(String[] args) {
        ILetter letterT1=LetterFactory.createLetter('t',"Arial",10);
        letterT1.display(1,1);

        ILetter letterT2=LetterFactory.createLetter('t',"Arial",10);
        letterT2.display(1,2);
    }
}
