package com.test.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import jdk.internal.dynalink.beans.StaticClass;
import android.R.integer;
import android.R.string;
import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.main.TestPort;
import com.test.test.TestR;
import com.test.utils.BitmapCut;
import com.test.utils.PictureContrast;
import com.test.utils.TimeUtil;

public abstract class BaseDevice {
	    public static final String dataFolder="/sdcard/test";
	    public static final PictureContrast P_CONTRAST=null;
	    public UiAutomatorTestCase uiAutomatorTestCase;
	    public static final BitmapCut BITMAP_CUT=null;
	    public UiDevice device;
	    public static final long Null=0;
	    public static PrintStream print;
	    public File file;
	    public static int start_app_by_name_times=5,click_wait_times=1,click_delay_times=1;
	    public UiObject object;
	    public int width,height,inner_left,inner_right,inner_up,inner_down;
		public BaseDevice(UiAutomatorTestCase uiAutomatorTestCase){
			this.uiAutomatorTestCase=uiAutomatorTestCase;
			device=uiAutomatorTestCase.getUiDevice();
			width=device.getDisplayWidth();
			height=device.getDisplayHeight();
			inner_left=width*1/15;
			inner_right=width*14/15;
			inner_up=height*1/12;
			inner_down=height*8/12;
			init();
	    }
		public void init(){
			new File(dataFolder).mkdir();
		}
		
	 //------------------baseMethod----------------------
		public  boolean openApps(){
			return false;
			
		}
		public  void wakeUp(){
			try {
				device.wakeUp();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    public void unlocke_Screen(){
	    	wakeUp();
	    	dragUp();
	    }
	    public abstract boolean set_sleep_time();
	    public boolean onClick(int x,int y,int times){
	    	device.click(x, y);
	    	sleep(times);
			return true;
	    	
	    }
	    public boolean onClick(int x,int y){
	    	boolean a=onClick(x, y,click_delay_times);
			return a;
	    	
	    }
	    public boolean onClickByClassName(String className,int click_wait_times,int click_delay_times){
	    	 return onClick(getByClassName(className),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByText(String text,int click_wait_times,int click_delay_times){
	    	return onClick(getByText(text),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByContainsText(String text,int click_wait_times,int click_delay_times){
	    	return onClick(getByContainsText(text),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByDescription(String desc,int click_wait_times,int click_delay_times){
	    	return onClick(getByDescription(desc),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByStartsText(String starts,int click_wait_times,int click_delay_times){
	    	return onClick(getByStartsText(starts),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByResourceId(String resourceId,int click_wait_times,int click_delay_times){
	    	return onClick(getByResourceId(resourceId),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByIndex(int index,int click_wait_times,int click_delay_times){
	    	return onClick(getByIndex(index),click_wait_times,click_delay_times);
	    }
	    public boolean onClickByClassName(String className){
    	       return onClickByClassName(className,click_wait_times,click_delay_times);
	    }
	    public boolean onClickByText(String text){
    	       return onClickByText(text,click_wait_times,click_delay_times);
	    }
	    public boolean onClickByDescription(String desc){
	    	return onClickByDescription(desc,click_wait_times,click_delay_times);
	    }
	    public boolean onClickByStartsText(String text){
    	    return onClickByStartsText(text,click_wait_times,click_delay_times);
	    }
	    
	    public boolean onClickByIndex(int index){
	    	return onClickByIndex(index,click_wait_times,click_delay_times);
	    }
	    public boolean onClickByResourceId(String resourceId){
	    	return onClickByResourceId(resourceId,click_wait_times,click_delay_times);
	    }
	    public boolean onClickByContainsText(String text){
	    	return onClickByContainsText(text,click_wait_times,click_delay_times);
	    }
	   public UiObject getByResourceId(String resourceId){
		  return new UiObject(new UiSelector().resourceId(resourceId));
		   
	   }
	   public UiObject getByIndex(int index){
			  return new UiObject(new UiSelector().index(index));
		   }
	   public UiObject getByDescription(String desc){
		  return new UiObject(new UiSelector().description(desc));
		   
	   }
	   public UiObject getByText(String text){
			return new UiObject(new UiSelector().text(text));		   
			}
	   public UiObject getByClassName(String className){
		   return new UiObject(new UiSelector().className(className));
	   }
	   public UiObject getByContainsText(String text){
			return new UiObject(new UiSelector().textContains(text));		   
			}
	   public UiObject getByMatchesText(String text){
			return new UiObject(new UiSelector().textMatches(text));		   
			}
	 
	   public UiObject getByStartsText(String starts){
			return new UiObject(new UiSelector().textStartsWith(starts));		   
			}
		public  boolean isApps(){
			return false;} ;
		public boolean backHome(){
		 return  device.pressHome();		 
	    }
		public  boolean isMain(){
			return false;} ;
		public boolean dragUp(){
    	boolean flags=device.drag(width*1/2, height*11/12, width*1/2, height*11/1, 15);
		return flags;
        }
		public boolean dragDown(){
    	boolean flags=device.drag( width*1/2, inner_up,width*1/2, inner_down, 15);
		return flags;
    }
		public boolean dragLeft(){
    	boolean flags=device.drag( inner_right, height*1/2,inner_left, height*1/2, 15);
		System.out.println("left==="+inner_right+","+height*1/2+","+inner_left+","+height*1/2);
    	return flags;
    }
		public boolean dragRight(){
    	boolean flags=device.drag( inner_left, height*1/2, inner_right, height*1/2,15);
		return flags;
    }
		public boolean startAppByName(String packages,int times){
			
			return false;
		}
		 public boolean startAppByName(String appName) {
				return startAppByName( appName, 5);
			}
		public boolean startAppByPackage(String packages){
			return startAppByPackage(packages, 5);
		}
		public boolean startAppByPackage(String packages,int times){
			try {
				String commend="am start "+packages;
				Runtime.getRuntime().exec(commend);
			
			} catch (Exception e) {			
				return false;
			}
			
			sleep(times);
			return true;
		}
		public void sleep(int times){
			try {
				Thread.sleep(times*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		private boolean onClick(UiObject o,int wait_times,int delay_times){
			o.waitForExists(wait_times*1000);
	    	if(o.exists()){
	    		try {
					o.click();
				} catch (UiObjectNotFoundException e) {
					return false;
				}
	    		sleep(delay_times);
	    		return true;
	        }
	    	return false;
		}
		public BaseDevice setStart_app_by_name_times(int start_app_by_name_times) {
			this.start_app_by_name_times = start_app_by_name_times;
			return this;
		}
		public BaseDevice setClick_wait_times(int click_wait_times) {
			this.click_wait_times = click_wait_times;
			return this;
		}
		public BaseDevice setClick_delay_times(int click_delay_times) {
			this.click_delay_times = click_delay_times;
			return this;
		}
		
		public static enum TestType{
			test(1),Scenes(2),BootFace(3);
			public int type;

			TestType(int type) {
				this.type = type;
			}
			
			
		}
}
