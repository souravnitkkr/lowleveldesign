package org.shrayansh.flyweightdesignpattern.wordprocessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<Character,ILetter> letterCacheMap=new HashMap<>();
    public static ILetter createLetter(char character,String fontType,int size){
        if(letterCacheMap.containsKey(character)){
            System.out.println("Data fetched from cache");
            return letterCacheMap.get(character);
        }else{
            ILetter iLetter=new DocumentCharacter(character,fontType,size);
            letterCacheMap.put(character,iLetter);
            return iLetter;
        }
    }
}
