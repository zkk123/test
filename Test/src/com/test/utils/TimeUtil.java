package com.test.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String formatTime(long l){
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
		return formatter.format(new Date(l));
    }
    public static String formatTime(){
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
		return formatter.format(new Date(System.currentTimeMillis()));
    }
    public static String formatTime(String str){
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
		return formatter.format(new Long(str));
    }
    
}
