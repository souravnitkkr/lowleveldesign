package org.shrayansh.interpreterdesignpattern.demo;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String,Integer> contextMap=new HashMap<>();

    public void setContext(String key,Integer value){
        contextMap.put(key,value);
    }

    public Integer getContext(String key){
        return contextMap.get(key);
    }
}
