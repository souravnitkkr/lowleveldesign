package org.shrayansh.chainresponsibiltydesignpattern;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel,String msg){
        if(logLevel == LogProcessor.DEBUG)
            System.out.println("DEBUG: "+msg);
        else
            super.log(logLevel,msg);
    }

}
