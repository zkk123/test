package com.test.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Log {
	public static void printLog(String flags,String contains){
		String time=TimeUtil.formatTime(System.currentTimeMillis());
		System.out.println("*["+time+"]*log** :"+"< "+flags+" >-----:"+contains);
	}
	public static void printLog(String contains){
		String time=TimeUtil.formatTime(System.currentTimeMillis());
		System.out.println("*["+time+"]*log** :"+contains);
	}
	public static void clear(String log_path){
		printlnLog(log_path, "",false);
	}
	public static void printlnLog(String log_path,String log_contains){
		printlnLog(log_path, log_contains,true);
	}
	public static void printlnLog(String log_path,String log_contains,boolean isAppend){
		PrintStream printStream=null;
		String time=TimeUtil.formatTime(System.currentTimeMillis());
		try {
			if(isAppend){
		    printStream=new PrintStream(new FileOutputStream(new File(log_path),true),true);
			}else{
				printStream=new PrintStream(new FileOutputStream(new File(log_path)),true);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String logString="*["+time+"]*log** :"+log_contains;
		printStream.println(logString);
		printStream.close();
	}
}
