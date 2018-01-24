package com.test.cases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.test.utils.TimeUtil;

public class XiaoBang {
//	private BaseCase device;
//	private long baseSleep;
//	private static final long Null = 0;
//	private File file;
//	public static PrintStream print;
//	UzObject object;
//	/*
//	 * startTest:true testCase:false
//	 */
//	public boolean isStartCase = false;
//
//	public XiaoBang(BaseCase device, boolean isStartCase) {
//		this.device = device;
//		this.baseSleep = device.getBaseSleep();
//		this.isStartCase = isStartCase;
//		init();
//	}
//
//	public XiaoBang(BaseCase device) {
//		this.device = device;
//		this.baseSleep = device.getBaseSleep();
//		init();
//	}
//
//	public void init() {
//		File b = new File("/sdcard/camera");
//		b.mkdir();
//		b.delete();
//		b.mkdir();
//		file = new File("/sdcard/camera/log.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		FileOutputStream ops = null;
//		try {
//			ops = new FileOutputStream(file);
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		print = new PrintStream(ops);
//		print.println("");
//		try {
//			ops = new FileOutputStream(file, true);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		print = new PrintStream(ops);
//		print.println("=====start=" + TimeUtil.formatTime() + "======");
//	}
//
//	// test port
//	// ***************************start*******************************
//	public void startJumpLead() throws RemoteException, InterruptedException,
//			UiObjectNotFoundException {
//		// wakeUp();
//		// if(isStartCase){
//		// startTest();
//		// }else{
//		// testCase();
//		// }
//
//		 object = device
//				.byGetResourceId("com.huawei.camera:id/main_view");
//		int a = object.getChildCount();
//		System.out.println("++++++++++++++++++++++*****" + a);
//	}
//
//	public void startScenesTest() throws InterruptedException,
//			UiObjectNotFoundException, RemoteException {
//		wakeUp();
//		// openCamera();
//		testSwitchTakePictureMode2();
//
//	}
//
//	// ============================end==============================
//
//	// execute Test
//	// ***************************start*******************************
//	private void testCase() throws InterruptedException,
//			UiObjectNotFoundException, RemoteException {
//		wakeUp();
//		// startDrive();
//		// startNavi();
//		startSoftBank293();
//	}
//
//	private boolean startTest() throws RemoteException, InterruptedException,
//			UiObjectNotFoundException {
//
//		startYbackup(); // ok
//		startSoftBank(); // ok
//		startYahoo(); // ok
//		startMySoftBank(); // ok
//		startLink();// Fail
//		startWifiSet();// ok
//		startNavi();
//		startDrive();
//		openYmsetupman();
//
//		startChrome();
//		openPlayMusic();
//		openCamera();
//		openGooglePhotos();
//		openWord();
//		openPPT();
//		openExcel();
//		openOutLook();
//		startGoogleMap();
//		return true;
//	}
//
//	// ============================end==============================
//
//	// 切换拍照录像/摄像头
//	// ***************************start*******************************
//	private static String isSuccess(boolean isSuccess,int i){
//		String m=null;
//		if(isSuccess)m="Success";
//		else m="Fail";
//		return "--["+i+"]-----["+m+"]";
//		
//	}
//	public boolean repeatedlyTakePhotos() throws InterruptedException, UiObjectNotFoundException {
//		String name = "repeatedly_Take_Photos";
//		String time = "";
//		int sleeptime = 30000;
//		String a = Camera.camera_front;
//		print(true, TimeUtil.formatTime(),"--X--", "--open Camera--");
//		if (!device.startApp("com.huawei.camera")) {
//			Camera.printFailLog(device, "--X--", isSuccess(false, 0));
//			return false;
//		}
//		object=device.byGetDescription("切换到视频");
//		if(object.exists()){
//			print(true, TimeUtil.formatTime(),"--X--",isSuccess(true, 0));
//			try {
//				print(true, TimeUtil.formatTime(),"--0--", "-----switch  photo-->vedio");
//				object.click(2000);
//			} catch (UiObjectNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if(device.byGetDescription("切换到普通拍照").exists()){
//				print(true, TimeUtil.formatTime(),"--0--",isSuccess(true, 0));
//				repeatedly_init_TakePhotos();
//			}else{
//				Camera.printFailLog(device, "--0--",isSuccess(false, 0));
//			}
//		}else{
//			object=device.byGetDescription("切换到普通拍照");
//            if(object.exists()){
//            	print(true, TimeUtil.formatTime(),"--X--",isSuccess(true, 0));
//            	repeatedly_init_TakePhotos();
//			}else{
//				Camera.printFailLog(device, "--X--", isSuccess(false, 1));
//			}
//		}
//		
//		return isStartCase;
//
//	}
//    private boolean repeatedly_init_TakePhotos() throws UiObjectNotFoundException, InterruptedException{
//    	for(int i=0;i<1000;i++){
//    		
//    		print(true, TimeUtil.formatTime(),"---times--["+i+"]-", "=====vedio====");
//    		object=device.byGetDescription("停止录像");
//    		if(object.exists()){
//    			print(true, TimeUtil.formatTime(),"--w-!!!-","stop take vedio");
//    			object.click(2000);
//    		}
//    		if(device.byGetDescription("录像").exists())print(true, TimeUtil.formatTime(),"--w-!!!-",isSuccess(true, 0));
//    		else{
//    			Camera.printFailLog(device, "--w-!!!-", isSuccess(false,0));
//    			return false;
//    		}
//    	print(true, TimeUtil.formatTime(),"---3---", "----switch camera----");
//        object=device.byGetDescription("切换到前置摄像头");
//        if(object.exists()){
//        	print(true, TimeUtil.formatTime(),"---4---", "----switch front camera----");
//        	object.click(3000);
//        }else{
//        	object=device.byGetDescription("切换到后置摄像头");
//        	if(object.exists()){
//        		print(true, TimeUtil.formatTime(),"---4---", "----switch post camera----");	
//            	object.click(3000);
//            }else{
//            	Camera.printFailLog(device, "---3---", isSuccess(false,0));
//            	continue;
//            }
//        }
//        object=device.byGetDescription("切换到视频");
//        if(object.exists()){
//        	print(true, TimeUtil.formatTime(),"---5-!!!--", "----switch vedio----");	
//        	object.click(3000);
//        }
//        
//        object=device.byGetDescription("录像");
//    	if(object.exists()){
//    		print(true, TimeUtil.formatTime(),"---6---", "---start take vedio---");
//    		object.click(4000);
//    	}else{
//    		Camera.printFailLog(device, "---6---", isSuccess(false, 0));
//    		continue;
//    	}
//    	if(device.byGetDescription("暂停录像").exists())print(true, TimeUtil.formatTime(),"---6---",  isSuccess(true, 0));
//    	boolean a=takePhotosProgress();
//    	if(!a){
//    		continue;
//    	}
//    	print(true, TimeUtil.formatTime(), "---7---", "stop take vedio");	
//    	object=device.byGetDescription("停止录像");
//    	if(object.exists()){
//    		object.click(4000);
//    		if(device.byGetDescription("录像").exists())print(true, TimeUtil.formatTime(), "---7---",  isSuccess(true, 0));
//    	}else{
//    		Camera.printFailLog(device,"---7---",  isSuccess(true, 0));
//    		continue;
//    	}}
//		return isStartCase;
//    	
//    }
//    private boolean takePhotosProgress() throws UiObjectNotFoundException, InterruptedException{
//    	print(true, TimeUtil.formatTime(),"----8----", "pouse take vedio");
//    	object=device.byGetDescription("暂停录像");
//    	Thread.sleep(10000);
//    	if(object.exists()){
//    		object.click(3000);
//    		if(device.byGetDescription("恢复录像").exists()){
//    			print(true, TimeUtil.formatTime(),"----8----", isSuccess(true, 0));
//    		}
//    	}else{
//    		Camera.printFailLog(device, "----8----",  isSuccess(false, 0));
//    		return false;
//    	}
//    	Thread.sleep(20000);
//    	print(true, TimeUtil.formatTime(),"----9----", "restore take vedio");
//    	object=device.byGetDescription("恢复录像");
//    	if(object.exists()){
//    		object.click(3000);
//    		if(device.byGetDescription("暂停录像").exists())print(true, TimeUtil.formatTime(),"----9----",isSuccess(true, 0));
//    	}else{
//    		Camera.printFailLog(device, "----9----", isSuccess(false, 0));
//    		return false;
//    	}
//    	Thread.sleep(10000);
//		return true;
//    }
//	private boolean testSwitchTakePictureMode2() throws InterruptedException {
//		String name = "Switch_Take_Picture_Mode";
//		String time = "";
//		int sleeptime = 30000;
//		print(true, TimeUtil.formatTime(), name, "open Camera");
//		String a = Camera.camera_front;
//		UzObject object = null;
//		print.println();
//		if (!device.startApp("com.huawei.camera")) {
//			Camera.printFailLog(device, "open_Camera", "00001");
//			return false;
//		}
//		print(true, TimeUtil.formatTime(), "open open_Camera finash", "00002");
//		print(true, TimeUtil.formatTime(), "current_Camera_stauts",
//				Camera.getCurrentStatus(Camera.getCurrentStatus(device)));
//		for (int i = 0; i < 1000000; i++) {
//			print(true, TimeUtil.formatTime(), "times", "-------" + i
//					+ "-------");
//			object = device.byGetDescription(a);
//			if (!object.exists()) {
//				a = Camera.getRelativeState(a);
//				object = device.byGetDescription(a);
//			}
//			if (object.exists()) {
//				try {
//					print(true, time, "click",
//							"click_before---" + Camera.getIconMsg(a));
//					object.click();
//					Thread.sleep(sleeptime);
//					time = TimeUtil.formatTime();
//					String b = Camera.getRelativeState(a);
//					object = device.byGetDescription(b);
//					if (object.exists()) {
//						print(true, time, "click",
//								"click_after---" + Camera.getIconMsg(b));
//					} else {
//						Camera.printFailLog(device, "click_after---", "fail");
//					}
//					print(true, time, "current_Camera_stauts",
//							Camera.getCurrentStatus(Camera
//									.getCurrentStatus(device)));
//				} catch (UiObjectNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				object = device.byGetDescription(Camera.center_take_photo);
//				if (object.exists()) {
//					try {
//						object.click(3000);
//					} catch (UiObjectNotFoundException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				a = Camera.getRelativeState(a);
//				object = device.byGetDescription(a);
//				if (object.exists()) {
//					try {
//						print(true, time, "click",
//								"click---" + Camera.getIconMsg(a));
//						object.click();
//						Thread.sleep(sleeptime);
//						time = TimeUtil.formatTime();
//						String b = Camera.getRelativeState(a);
//						object = device.byGetDescription(b);
//						if (object.exists()) {
//							print(true, time, "click", "click_after---"
//									+ Camera.getIconMsg(b));
//						} else {
//							Camera.printFailLog(device, "click_after---",
//									"fail");
//						}
//						print(true, time, "current_Camera_stauts",
//								Camera.getCurrentStatus(Camera
//										.getCurrentStatus(device)));
//					} catch (UiObjectNotFoundException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				} else {
//					Camera.printFailLog(device, "001", Camera.getIconMsg(a));
//					print(true, TimeUtil.formatTime(), "current_Camera_stauts",
//							Camera.getCurrentStatus(Camera
//									.getCurrentStatus(device)));
//				}
//			} else {
//				Camera.printFailLog(device, "002", Camera.getIconMsg(a));
//				print(true,
//						TimeUtil.formatTime(),
//						"current_Camera_stauts",
//						Camera.getCurrentStatus(Camera.getCurrentStatus(device)));
//			}
//			a = Camera.switchTest(a);
//		}
//		return true;
//
//	}
//
//	private boolean testSwitchTakePictureMode() throws InterruptedException {
//		if (!device.startApp("com.huawei.camera")) {
//
//			return false;
//		}
//		// /device.getObject().
//		for (int i = 0; i < 1000000; i++) {
//			Thread.sleep(1000);
//			device.getUiDevice().click(953, 1695);// Switch the TakePicture
//			Thread.sleep(1000);
//			device.getUiDevice().click(1045, 45);// Switch the camera
//			Thread.sleep(1000);
//			device.getUiDevice().click(1045, 45);// Switch the camera
//			Thread.sleep(1000);
//		}
//		return true;
//
//	}
//
//	// 反复录像
//	private boolean repeatedCamera() throws InterruptedException {
//		if (!device.startApp("com.huawei.camera")) {
//
//			return false;
//		}
//		for (int i = 0; i < 1000000; i++) {
//			Thread.sleep(1000);
//			device.getUiDevice().click(1045, 45);// Switch the camera
//			device.getUiDevice().click(600, 1700);// TakePicture
//			Thread.sleep(500000);
//			device.getUiDevice().click(600, 1700);// TakePicture
//			Thread.sleep(1000);
//			device.getUiDevice().click(1045, 45);// Switch the camera
//			Thread.sleep(1000);
//		}
//		return true;
//	}
//
//	// ============================end==============================
//
//	// ***************************start*******************************
//	// ---------------------openApp-----------------
//
//	private boolean openCamera() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (!device.startApp("com.huawei.camera")) {
//			return false;
//		}
//		UzObject object = device
//				.byGetResourceId("com.huawei.camera:id/user_guide_center_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.huawei.camera:id/user_guide_right_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.huawei.camera:id/user_guide_right_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//
//	}
//
//	private boolean openGooglePhotos() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (!device.startApp("com.google.android.apps.photos")) {
//			return false;
//		}
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.google.android.apps.photos:id/auto_backup_switch");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		device.getUiDevice().click(300, 300);
//		Thread.sleep(1000);
//		object = device.byGetResourceId("android:id/button2");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean openPlayMusic() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (!device.startApp("com.google.android.music")) {
//			return false;
//		}
//		UzObject object = device
//				.byGetResourceId("com.google.android.music:id/skip_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startChrome() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (!device.startApp("com.android.chrome")) {
//			Thread.sleep(5000);
//			return false;
//		}
//		UzObject object = device
//				.byGetResourceId("com.android.chrome:id/terms_accept");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.chrome:id/negative_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//
//	}
//
//	private boolean openYmsetupman() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("かんたん設定", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("jp.co.yahoo.android.ymsetupman:id/list_next");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.ymsetupman:id/list_next");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		device.getUiDevice().drag(900, 1400, 900, 700, 15);
//		device.getUiDevice().drag(900, 1400, 900, 700, 15);
//		device.getUiDevice().drag(900, 1400, 900, 700, 15);
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.ymsetupman:id/main_ok");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.ymsetupman:id/btn_start");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return isStartCase;
//
//	}
//
//	private boolean startYahoo() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("Yahoo!", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("jp.co.yahoo.android.yjtop:id/ButtonPositive");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startYbackup() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("Y!バックアップ", Null) == null)
//			return false;
//		UzObject object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.ybackup:id/ButtonStart");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startSoftBank() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("メール", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.ymobile.mail:id/list_next");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		dragUp();
//		dragUp();
//		dragUp();
//		object = device.byGetResourceId("android:id/button3");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//
//	}
//
//	private boolean startSoftBank293() throws UiObjectNotFoundException {
//
//		if (launchApp("連携しよう", Null) == null)
//			return false;
//		UzObject object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			System.out.println("----------------------0x1-");
//			object.click(baseSleep);
//		}
//
//		object = device.byGetResourceId("jp.softbank.link:id/btn_can_do_id");
//		if (object.exists()) {
//			System.out.println("----------------------0x2-");
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_can_do_id");
//		if (object.exists()) {
//			System.out.println("----------------------0x3-");
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_can_do_id");
//		if (object.exists()) {
//			System.out.println("----------------------0x4-");
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_center");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		dragUp();
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/pager");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean openWord() throws InterruptedException,
//			UiObjectNotFoundException {
//		// word
//		if (!device
//				.startApp("com.microsoft.office.word/com.microsoft.office.apphost.LaunchActivity")) {
//			return false;
//		}
//		Thread.sleep(10000);
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		Thread.sleep(10000);
//		object = device.byGetText("スキップ");
//		// object=byGetResourceId("com.microsoft.office.excel:id/docsui_signinview_skipsignin");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return device.isShu();
//	}
//
//	private boolean openPPT() throws InterruptedException,
//			UiObjectNotFoundException {
//		// ppt
//		if (!device
//				.startApp("com.microsoft.office.powerpoint/com.microsoft.office.apphost.LaunchActivity")) {
//			return false;
//		}
//		Thread.sleep(5000);
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		Thread.sleep(5000);
//		object = device.byGetText("スキップ");
//		// object=byGetResourceId("com.microsoft.office.excel:id/docsui_signinview_skipsignin");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return device.isShu();
//	}
//
//	private boolean openExcel() throws InterruptedException,
//			UiObjectNotFoundException {
//		// EXCEL
//		if (!device
//				.startApp("com.microsoft.office.excel/com.microsoft.office.apphost.LaunchActivity")) {
//			return false;
//		}
//		Thread.sleep(5000);
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		Thread.sleep(5000);
//		object = device.byGetText("スキップ");
//		// object=byGetResourceId("com.microsoft.office.excel:id/docsui_signinview_skipsignin");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return device.isShu();
//	}
//
//	private boolean openOutLook() throws InterruptedException,
//			UiObjectNotFoundException {
//		// OUTLOOK
//		if (!device
//				.startApp("com.microsoft.office.outlook/com.microsoft.office.apphost.LaunchActivity")) {
//			return false;
//		}
//		Thread.sleep(10000);
//		UzObject object = device
//				.byGetResourceId("com.microsoft.office.outlook:id/btn_splash_start");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//
//	}
//
//	private boolean startGoogleMap() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (!device
//				.startApp("com.google.android.apps.maps/com.google.android.maps.MapsActivity")) {
//
//			Thread.sleep(5000);
//			return false;
//		}
//		device.getUiDevice().click(1100, 110);
//		Thread.sleep(1000);
//		UzObject object = device
//				.byGetResourceId("com.google.android.apps.maps:id/tutorial_side_menu_got_it");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startMySoftBank() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("My SoftBank+", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("jp.softbank.mb.dtm:id/okButton");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.mb.dtm:id/checkBox");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.mb.dtm:id/agree");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.mb.dtm:id/login");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	// 8
//	private boolean startLink() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("連携しよう", Null) == null)
//			return false;
//		UzObject object = device.byGetResourceId("android:id/button1");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		if (launchApp("連携しよう", Null) == null)
//			return false;
//		object = device.byGetResourceId("jp.softbank.link:id/btn_can_do_id");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_center");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		dragUp();
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_right");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetResourceId("jp.softbank.link:id/btn_start_link");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startWifiSet() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("Wi-Fiスポット設定", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device.byGetContainsText("OK");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startNavi() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("Y!カーナビ", Null) == null)
//			return false;
//		UzObject object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/list_close");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		System.out.println("------------fff");
//		object = device.byGetText("同意する");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_page1_start_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/login_guidance_left_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("jp.co.yahoo.android.apps.navi:id/review_encouragement_dialog_clear_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		object = device
//				.byGetResourceId("com.android.packageinstaller:id/permission_allow_button");
//		if (object.exists()) {
//			object.click(baseSleep);
//		}
//		return true;
//	}
//
//	private boolean startDrive() throws InterruptedException,
//			UiObjectNotFoundException {
//		if (launchApp("ドライブ", Null) == null)
//			return false;
//		device.getUiDevice().click(150, 1790);
//		Thread.sleep(1000);
//		return true;
//	}
//
//	// ------------------baseMethod----------------------
//	private UzObject launchApp(String appName, long time) {
//		try {
//			openApps();
//		} catch (UiObjectNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		UzObject object = null;
//		for (int i = 0; i < 4; i++) {
//			object = device.byGetText(appName);
//			if (object.exists()) {
//				try {
//					if (time == Null) {
//						object.click(3000);
//					} else {
//						object.click(time);
//					}
//				} catch (UiObjectNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return object;
//			}
//			dragUp();
//		}
//		return null;
//	}
//
//	private void openApps() throws UiObjectNotFoundException {
//		if (!isMain()) {
//			backHome();
//		}
//		UzObject object = device.byGetText("アプリ");
//		object.click(1000);
//	}
//
//	private void wakeUp() throws RemoteException {
//		UiDevice dv = device.getUiDevice();
//		dv.wakeUp();
//		int height = dv.getDisplayHeight();
//		int width = dv.getDisplayWidth();
//		if (height > width) {
//			device.setShu(true);
//			dv.drag(500, 1700, 500, 200, 15);
//		} else {
//			device.setShu(false);
//			dv.drag(979, 1000, 979, 118, 15);
//		}
//
//	}
//
//	private boolean isApps() {
//		return device.byGetClassName("android.support.v7.widget.RecyclerView")
//				.exists();
//
//	}
//
//	private boolean backHome() {
//		return device.getUiDevice().pressHome();
//
//	}
//
//	private boolean isMain() {
//		return device.byGetResourceId(
//				"com.huawei.android.launcher:id/workspace_screen").exists();
//	}
//
//	private boolean dragUp() {
//		boolean flags = device.getUiDevice().drag(900, 1800, 900, 700, 15);
//		return flags;
//	}
//
//	private boolean dragDown() {
//		boolean flags = device.getUiDevice().drag(900, 700, 900, 1800, 15);
//		return flags;
//	}
//
//	private boolean dragLeft() {
//		boolean flags = device.getUiDevice().drag(1100, 1100, 1100, 36, 15);
//		return flags;
//	}
//
//	private boolean dragRight() {
//		boolean flags = device.getUiDevice().drag(1100, 36, 1100, 1100, 15);
//		return flags;
//	}
//
//	private static void print(boolean isSuccess, String time, String type,
//			String msg) {
//		String flag = "";
//		if (!isSuccess) {
//			flag = "==!=Fail=!=,";
//		}
//		print.println(flag + "time:" + time + ", type=" + type + ",desc=" + msg);
//	}
//
//	private static class Camera {
//		public static String center_take_photo = "Touch to capture";// 拍照center
//		public static String center_vedio_none = "ビデオを録画";// 录像center(未录像)
//		public static String center_vedio_progress = "録画の停止";// 录像center(正在录像)
//		public static String camera_front = "Switch to front camera";// 前置
//		public static String camera_post = "Switch to rear camera";// 后置
//		public static String vedio_mode = "Switch to video mode";// 录像switch
//		public static String photo_mode = "Switch to photo mode";// 拍照switch
//		public static String take_photo = "center_take_photo";// 拍照center
//		public static String vedio_none = "center_vedio_none";// 录像center(未录像)
//		public static String vedio_progress = "center_vedio_progress";// 录像center(正在录像)
//		public static String front = "camera_front";// 前置
//		public static String post = "camera_post";// 后置
//		public static String vedio = "vedio_mode";// 录像switch
//		public static String photo = "photo_mode";// 拍照switch
//
//		public static String getIconMsg(String a) {
//			if (a.equals(vedio_mode)) {
//				return vedio;
//			} else if (a.equals(photo_mode)) {
//				return photo;
//			} else if (a.equals(camera_post)) {
//				return post;
//			} else if (a.equals(camera_front)) {
//				return front;
//			} else if (a.equals(center_take_photo)) {
//				return take_photo;
//			} else if (a.equals(center_vedio_none)) {
//				return vedio_none;
//			} else if (a.equals(center_vedio_progress)) {
//				return vedio_progress;
//			}
//			return a;
//
//		}
//
//		public static String getRelativeState(String a) {
//			if (a.equals(vedio_mode)) {
//				return photo_mode;
//			} else if (a.equals(photo_mode)) {
//				return vedio_mode;
//			} else if (a.equals(camera_post)) {
//				return camera_front;
//			} else if (a.equals(camera_front)) {
//				return camera_post;
//			} else if (a.equals(center_take_photo)) {
//				return center_vedio_none;
//			} else if (a.equals(center_vedio_none)) {
//				return center_vedio_progress;
//			} else if (a.equals(center_vedio_progress)) {
//				return center_take_photo;
//			}
//			return a;
//
//		}
//
//		public static String switchTest(String a) {
//			if (a.equals(photo_mode) || a.equals(vedio_mode)) {
//				return camera_post;
//			} else if (a.equals(camera_post) || a.equals(camera_front)) {
//				return photo_mode;
//			}
//			return a;
//
//		}
//
//		public static String[] getCurrentStatus(BaseCase device) {
//			String[] list = new String[] { null, null, null };
//			UzObject object = device.byGetDescription(center_take_photo);
//			if (object.exists())
//				list[0] = take_photo;
//			object = device.byGetDescription(center_vedio_none);
//			if (object.exists())
//				list[0] = vedio_none;
//			object = device.byGetDescription(center_vedio_progress);
//			if (object.exists())
//				list[0] = vedio_progress;
//			object = device.byGetDescription(photo_mode);
//			if (object.exists())
//				list[1] = photo;
//			object = device.byGetDescription(vedio_mode);
//			if (object.exists())
//				list[1] = vedio;
//			object = device.byGetDescription(camera_front);
//			if (object.exists())
//				list[2] = front;
//			object = device.byGetDescription(camera_post);
//			if (object.exists())
//				list[2] = post;
//			return list;
//		}
//
//		public static String getCurrentStatus(String[] a) {
//			return "[ " + a[0] + "-" + a[1] + "-" + a[2] + " ]";
//
//		}
//
//		public static void printFailLog(BaseCase device, String failType,
//				String failDesc) {
//			String time = TimeUtil.formatTime();
//			print(false, time, failType, failDesc);
//			File a1 = new File("/sdcard/camera/" + failType + "_" + time
//					+ ".png");
//			device.getUiDevice().takeScreenshot(a1);
//		}
//
//	}

}
