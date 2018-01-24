package com.test.cases;

import android.R.integer;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;
import com.test.utils.Log;

public class Moto extends BaseDevice{

	public Moto(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		// TODO Auto-generated constructor stub
	}

	public void usb(){
		startAppByPackage("com.android.settings/.Settings");
		dragDown();
		onClickByText("Network & Internet");
		onClickByText("Hotspot & tethering");
		boolean flags=false;
		UiObject object=null;
		object=getByResourceId("android:id/switch_widget");
	//	sleep(3);
		for(int i=0;i<20;i++){
			System.out.println("----test---["+i+"]");
			object=getByText("Tethered");
			if(object.exists()){
				System.out.println("-------["+i+"]:close---"+"usb");
			    onClick(950,340);
			}else{
				object=getByText("USB connected, check to tether");
				if(object.exists()){
					System.out.println("-------["+i+"]:open---"+"usb");
					onClick(950,340);
				}
			}
			System.out.println("-------["+i+"]:finsh---"+"usb");
			sleep(15);
		}
		
		
	    
	}
	public void scenes_wifi2(int times){
		set_sleep_time();
		scenes_init();
		boolean flags=false;
		UiObject object=null;
		for(int i=0;i<10000;i++){
			System.out.println("----test---["+i+"]");
			object=getByText("Not sharing this phone’s Internet connection via hotspot");
			if(object.exists()){
				System.out.println("-------["+i+"]:open---"+"wifi");
				onClick(950,560);
			}else{
				object=getByContainsText("is active");
				if(object.exists()){
					System.out.println("-------["+i+"]:close---"+"wifi");
					onClick(950,560);
				}else{
					scenes_init();
					continue;
				}
			}
			System.out.println("-------["+i+"]:finsh---"+"wifi");
			sleep(15);
		}
		
		
	    
	}
	public void scenes_Bluetooth3(int a){
		 set_sleep_time();
		 scenes_init();
		 Log.clear(dataFolder+"log.lg");
		 UiObject object=null;
		 Log.printlnLog(dataFolder+"log.lg",logContent("Start Bluetooth Test", "=========="));
		for(int i=0;i<10000;i++){
			Log.printlnLog(dataFolder+"log.lg",logContent("start", "running "+i+" times"));
			object=getByText("Not sharing this phone’s Internet connection via Bluetooth");
			if(object.exists()){
				Log.printlnLog(dataFolder+"log.lg",logContent("test running", "open Bluetooth hotspot"));
				onClick(970,1039);
			}else{
				object=getByText("Sharing this phone’s Internet connection via Bluetooth");
				if(object.exists()){
					Log.printlnLog(dataFolder+"log.lg",logContent("test running", "close Bluetooth hotspot"));
					onClick(970,1039);
				}else{
					scenes_init();
					continue;
				}
			}
			Log.printlnLog(dataFolder+"log.lg",logContent("finshed", "the "+i+" times"));
			sleep(15);
		}
		
		
	    
	}
	private void scenes_init(){
		backHome();
		startAppByPackage("com.android.settings/.Settings",5);
		device.swipe(width*1/2, height*2/12,width*1/2,height*11/12,15);
		device.swipe(width*1/2, height*2/12,width*1/2,height*11/12,15);
		onClickByText("Network & Internet");
		onClickByText("Hotspot & tethering");
	}
	
	
	private String logContent(String type,String con){
		return "["+type+"]"+con;
		
	}
	@Override
	public boolean set_sleep_time() {
		// TODO Auto-generated method stub
		return false;
	}

	
}