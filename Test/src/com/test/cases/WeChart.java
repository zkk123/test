package com.test.cases;

import android.R.integer;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;

public class WeChart extends BaseDevice{

	public WeChart(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean set_sleep_time() {
		// TODO Auto-generated method stub
		return false;
	}
	public void scenes_sendMessage3(int times){
		for(int i=0;i<1000000;i++){
		sendMessage("How are you "+i);
		sleep(3);
		}
	}
    private void sendMessage(String msg){
    	UiObject obt=getByResourceId("com.tencent.mm:id/a3b");
    	try {
    		
			obt.setText(msg);
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sleep(5);
    	sendButton();
    }
    private void sendButton(){
    	onClickByResourceId("com.tencent.mm:id/a3h");
    }

}
