package com.test.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

import android.R.integer;
import android.os.Bundle;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;
import com.test.utils.Log;
public class TestPort{
	public static HashMap<String, Class> allClasses=new HashMap();
    private static boolean startTest(UiAutomatorTestCase ui,String projectName,int type,int caseNumber,int times){
    	CasesManifest.initCase();
    	Class<?> caseClass=getCaseClass(projectName);
    	System.out.println("project:"+projectName);
    	if(caseClass==null){ 
    		System.out.println("Not have TestCases");
    		return false;
    	}
    	Constructor co=null;
    	Object cObject=null;
    	try {
			co=caseClass.getConstructor(UiAutomatorTestCase.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   try {
    		   cObject=co.newInstance(ui);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(type==BaseDevice.TestType.test.type){//dubug_method
			
			for(Method method:caseClass.getMethods()){
				String methodName=method.getName();
				if(methodName.startsWith("debug_")){
					Log.printLog("run "+methodName);
				try {
					method.invoke(cObject);
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}}
				
			}
		}else if(type==BaseDevice.TestType.Scenes.type){//scenes_method
			for(Method method:caseClass.getMethods()){
				String methodName=method.getName();
				if(methodName.startsWith("scenes_")&&method.getName().endsWith(caseNumber+"")){
				try {
					Log.printLog("run "+methodName);
					method.invoke(cObject,times);
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}}
			}
		}else if(type==BaseDevice.TestType.BootFace.type){//boot_method
			for(Method method:caseClass.getMethods()){
				String methodName=method.getName();
				if(methodName.startsWith("boot_")){
				try {
					Log.printLog("run "+methodName);
					method.invoke(cObject);
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}}
			}
		}
		return false;
		
	}
    private static Class<?> getCaseClass(String projectName){
    	Iterator<String> iterator=allClasses.keySet().iterator();
    	while(iterator.hasNext()){
    		String key=iterator.next();
    		if(key.contains(projectName.toLowerCase())){
    			return allClasses.get(key);
    		}
    	}
    	return null;
    }
    public static void startMyTest(UiAutomatorTestCase ui,Bundle params) {
		String projectName=params.getString("projectName");//
		int run_Type=new Integer(params.getString("types"));
		int case_Number=new Integer(params.getString("caseNumber"));
		int run_Times=new Integer(params.getString("times"));
		startTest(ui,projectName , run_Type, case_Number,run_Times);
	} 
    public static void  watchCases(){
    	for(String a:allClasses.keySet()){
    		System.out.println("project:"+a);
    	}
    }
    public static void putCases(Class cls){
		TestPort.allClasses.put(cls.getName().substring(cls.getName().lastIndexOf('.')+1).toLowerCase(), cls);
	}
}
