package org.shrayansh.chainresponsibiltydesignpattern;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == LogProcessor.INFO)
            System.out.println("INFO:" +msg);
        else
            super.log(logLevel,msg);
    }

}
