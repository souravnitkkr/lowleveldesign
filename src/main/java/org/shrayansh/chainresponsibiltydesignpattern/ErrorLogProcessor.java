package org.shrayansh.chainresponsibiltydesignpattern;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == LogProcessor.ERROR)
            System.out.println("ERROR: "+msg);
        else
            super.log(logLevel,msg);
    }

}
