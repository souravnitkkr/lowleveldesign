package org.shrayansh.singletondesignpattern.synchronize;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){

    }

    public static synchronized DBConnection getInstance(){
        if(conObject == null){
            conObject=new DBConnection();
        }
        return conObject;
    }
}
