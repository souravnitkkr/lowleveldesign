package org.shrayansh.flyweightdesignpattern.wordprocessor;

public class DocumentCharacter implements ILetter{
    private char character;
    private String fontType;
    private int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Display the character = "+character+" at x = "+x+" at y = "+y);
    }
}
