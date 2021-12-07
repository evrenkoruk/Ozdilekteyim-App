package com.ozdilekteyim.Logging;

import org.apache.log4j.Logger;

public class CustomLogger {

    private static Logger log= Logger.getLogger(CustomLogger.class.getName());

    public static void startLog(String testName){log.info(testName+" is starting.");}
    public static void endLog(String testName){log.info(testName+" is ending.");}

    public static void info(String msg){log.info(msg);}

}
