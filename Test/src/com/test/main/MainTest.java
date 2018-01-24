package com.test.main;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.math.util.Coordinate;
import com.test.cases.ALOO;
import com.test.cases.CY1668;
import com.test.cases.Moto;
import com.test.cases.RYJumpLead;
import com.test.cases.WangZhe;
import com.test.cases.XiaoBang;
import com.test.cases.honor;
import com.test.test.TestR;
import com.test.utils.BitmapCut;
import com.test.utils.ClassTools;
import com.test.utils.PictureContrast;

public class MainTest extends UiAutomatorTestCase{
	
	
	
	public void testDemo(){
		TestPort.startMyTest(this,getParams());
		//new CY1668(this).startTest(0);
		
	}
	
	
	
	

}
