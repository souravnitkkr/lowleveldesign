package org.shrayansh.chainresponsibiltydesignpattern;

public class MainDriver {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"Error happens sometime");
        logProcessor.log(LogProcessor.DEBUG,"Need to debug this");
        logProcessor.log(4,"Just for info");
    }
}
