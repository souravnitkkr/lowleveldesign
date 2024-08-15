package org.shrayansh.interpreterdesignpattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String,Integer> hMap=new HashMap<>();

    public void setContext(String key,Integer value){
        hMap.put(key,value);
    }

    public Integer getContext(String key){
        return hMap.get(key);
    }
}
