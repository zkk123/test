package com.test.cases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import android.R.integer;
import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;
import com.test.utils.TimeUtil;

public class RYJumpLead extends BaseDevice {
	private File file;
	public static PrintStream print;
	public RYJumpLead(UiAutomatorTestCase device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	/*
	 * startTest:true testCase:false
	 */
	public boolean isStartCase = true;
    
	public void init() {
		File b = new File("/sdcard/camera");
		b.mkdir();
		b.delete();
		b.mkdir();
		
		file = new File("/sdcard/camera/log.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileOutputStream ops = null;
		try {
			ops = new FileOutputStream(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print = new PrintStream(ops);
		print.println("");
		try {
			ops = new FileOutputStream(file, true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print = new PrintStream(ops);
		print.println("=====start=" + TimeUtil.formatTime() + "======");
	}

	public boolean boot_Test() {
		wakeUp();
		unlocke_Screen();
		set_sleep_time();
		
		startYbackup(); // ok
		startSoftBank(); // ok
		startYahoo(); // ok
		startMySoftBank(); // ok
		startLink();// Fail
		startWifiSet();// ok
		startNavi();
		startDrive();
		openYmsetupman();
		startChrome();
		openPlayMusic();
		openCamera();
		openGooglePhotos();
		openWord();
		openPPT();
		openExcel();
		openOutLook();
		startGoogleMap();
		return false;
	}

	// ***************************start*******************************
	private void testCase() {
		wakeUp();
		// startDrive();
		// startNavi();
		startSoftBank293();
	}

	// ============================end==============================

	// 切换拍照录像/摄像头
	// ***************************start*******************************
	public boolean scenes_SwitchTakePictureMode3(int a1) {
		System.out.println("---------Switch_Take_Picture_Mode3");
		String name = "Switch_Take_Picture_Mode";
		String time = "";
		int sleeptime = 10;
		print(true, TimeUtil.formatTime(), name, "open Camera");
		String a = Camera.camera_front;
		UiObject object = null;
		print.println();
		if (!startAppByPackage("com.huawei.camera")) {
			Camera.printFailLog(device, "open_Camera", "00001");
			return false;
		}
		print(true, TimeUtil.formatTime(), "open open_Camera finash", "00002");
		print(true, TimeUtil.formatTime(), "current_Camera_stauts",
				Camera.getCurrentStatus(Camera.getCurrentStatus(this)));
		for (int i = 0; i < 1000000; i++) {
			print(true, TimeUtil.formatTime(), "times", "-------" + i
					+ "-------");
			object = getByDescription(a);
			if (!object.exists()) {
				a = Camera.getRelativeState(a);
				object = getByDescription(a);
			}
			if (object.exists()) {
				try {
					print(true, time, "click",
							"click_before---" + Camera.getIconMsg(a));
					object.click();
					sleep(sleeptime);
					time = TimeUtil.formatTime();
					String b = Camera.getRelativeState(a);
					object = getByDescription(b);
					if (object.exists()) {
						print(true, time, "click",
								"click_after---" + Camera.getIconMsg(b));
					} else {
						Camera.printFailLog(device, "click_after---", "fail");
					}
					print(true, time, "current_Camera_stauts",
							Camera.getCurrentStatus(Camera
									.getCurrentStatus(this)));
				} catch (UiObjectNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a = Camera.getRelativeState(a);
				object = getByDescription(a);
				if (object.exists()) {
					try {
						print(true, time, "click",
								"click---" + Camera.getIconMsg(a));
						object.click();
						sleep(sleeptime);
						time = TimeUtil.formatTime();
						String b = Camera.getRelativeState(a);
						object = getByDescription(b);
						if (object.exists()) {
							print(true, time, "click", "click_after---"
									+ Camera.getIconMsg(b));
						} else {
							Camera.printFailLog(device, "click_after---",
									"fail");
						}
						Object object2=getByDescription(Camera.center_take_photo);
						if(object.exists()){
						    onClickByDescription(Camera.center_take_photo);
						}
						print(true, time, "current_Camera_stauts",
								Camera.getCurrentStatus(Camera
										.getCurrentStatus(this)));
					} catch (UiObjectNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					Camera.printFailLog(device, "001", Camera.getIconMsg(a));
					print(true, TimeUtil.formatTime(), "current_Camera_stauts",
							Camera.getCurrentStatus(Camera
									.getCurrentStatus(this)));
				}
			} else {
				Camera.printFailLog(device, "002", Camera.getIconMsg(a));
				print(true, TimeUtil.formatTime(), "current_Camera_stauts",
						Camera.getCurrentStatus(Camera.getCurrentStatus(this)));
			}
			a = Camera.switchTest(a);
		}
		return true;

	}
	public boolean scenes_SwitchTakePictureMode2(int a1) {
		System.out.println("---------Switch_Take_Picture_Mode");
		String name = "Switch_Take_Picture_Mode";
		String time = "";
		int sleeptime = 10;
		print(true, TimeUtil.formatTime(), name, "open Camera");
		String a = Camera.camera_front;
		UiObject object = null;
		print.println();
		if (!startAppByPackage("com.huawei.camera")) {
			Camera.printFailLog(device, "open_Camera", "00001");
			return false;
		}
		print(true, TimeUtil.formatTime(), "open open_Camera finash", "00002");
		print(true, TimeUtil.formatTime(), "current_Camera_stauts",
				Camera.getCurrentStatus(Camera.getCurrentStatus(this)));
		for (int i = 0; i < 1000000; i++) {
			print(true, TimeUtil.formatTime(), "times", "-------" + i
					+ "-------");
			object = getByDescription(a);
			if (!object.exists()) {
				a = Camera.getRelativeState(a);
				object = getByDescription(a);
			}
			if (object.exists()) {
				try {
					print(true, time, "click",
							"click_before---" + Camera.getIconMsg(a));
					object.click();
					sleep(sleeptime);
					time = TimeUtil.formatTime();
					String b = Camera.getRelativeState(a);
					object = getByDescription(b);
					if (object.exists()) {
						print(true, time, "click",
								"click_after---" + Camera.getIconMsg(b));
					} else {
						Camera.printFailLog(device, "click_after---", "fail");
					}
					print(true, time, "current_Camera_stauts",
							Camera.getCurrentStatus(Camera
									.getCurrentStatus(this)));
				} catch (UiObjectNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a = Camera.getRelativeState(a);
				object = getByDescription(a);
				if (object.exists()) {
					try {
						print(true, time, "click",
								"click---" + Camera.getIconMsg(a));
						object.click();
						sleep(sleeptime);
						time = TimeUtil.formatTime();
						String b = Camera.getRelativeState(a);
						object = getByDescription(b);
						if (object.exists()) {
							print(true, time, "click", "click_after---"
									+ Camera.getIconMsg(b));
						} else {
							Camera.printFailLog(device, "click_after---",
									"fail");
						}
						print(true, time, "current_Camera_stauts",
								Camera.getCurrentStatus(Camera
										.getCurrentStatus(this)));
					} catch (UiObjectNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					Camera.printFailLog(device, "001", Camera.getIconMsg(a));
					print(true, TimeUtil.formatTime(), "current_Camera_stauts",
							Camera.getCurrentStatus(Camera
									.getCurrentStatus(this)));
				}
			} else {
				Camera.printFailLog(device, "002", Camera.getIconMsg(a));
				print(true, TimeUtil.formatTime(), "current_Camera_stauts",
						Camera.getCurrentStatus(Camera.getCurrentStatus(this)));
			}
			a = Camera.switchTest(a);
		}
		return true;

	}

	public boolean testSwitchTakePictureMode() {
		if (!startAppByPackage("com.huawei.camera")) {

			return false;
		}
		// /device.getObject().
		for (int i = 0; i < 1000000; i++) {
			sleep(5);
			device.click(953, 1695);// Switch the TakePicture
			sleep(5);
			device.click(1045, 45);// Switch the camera
			sleep(5);
			device.click(1045, 45);// Switch the camera
			sleep(5);
		}
		return true;

	}

	// 反复录像
	private boolean repeatedCamera() {
		if (!startAppByPackage("com.huawei.camera")) {

			return false;
		}
		for (int i = 0; i < 1000000; i++) {
			sleep(5);
			device.click(1045, 45);// Switch the camera
			device.click(600, 1700);// TakePicture
			sleep(5);
			device.click(600, 1700);// TakePicture
			sleep(5);
			device.click(1045, 45);// Switch the camera
			sleep(5);
		}
		return true;
	}

	// ============================end==============================

	// ***************************start*******************************
	// ---------------------openApp-----------------

	private boolean openCamera() {
		startAppByPackage("com.huawei.camera");
		onClickByResourceId("com.huawei.camera:id/user_guide_center_button");
		onClickByResourceId("com.huawei.camera:id/user_guide_right_button");
		onClickByResourceId("com.huawei.camera:id/user_guide_right_button");
		return true;

	}

	private boolean openGooglePhotos() {
		if (!startAppByPackage("com.google.android.apps.photos")) {
			return false;
		}
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.google.android.apps.photos:id/auto_backup_switch");
		device.click(300, 300);
		sleep(2);
		onClickByResourceId("android:id/button2");
		return true;
	}

	private boolean openPlayMusic() {
		if (!startAppByPackage("com.google.android.music")) {
			return false;
		}
		return onClickByResourceId("com.google.android.music:id/skip_button");
	}

	private boolean startChrome() {
		if (!startAppByPackage("com.android.chrome", 5)) {
			return false;
		}
		onClickByResourceId("com.android.chrome:id/terms_accept");
		onClickByResourceId("com.android.chrome:id/negative_button");
		return true;

	}

	private boolean openYmsetupman() {
		if (!startAppByName("かんたん設定"))
			return false;
		onClickByResourceId("jp.co.yahoo.android.ymsetupman:id/list_next");
		onClickByResourceId("jp.co.yahoo.android.ymsetupman:id/list_next");
		device.drag(900, 1400, 900, 700, 15);
		device.drag(900, 1400, 900, 700, 15);
		device.drag(900, 1400, 900, 700, 15);
		onClickByResourceId("jp.co.yahoo.android.ymsetupman:id/main_ok");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("jp.co.yahoo.android.ymsetupman:id/btn_start");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return isStartCase;

	}

	private boolean startYahoo() {
		if (!startAppByName("Yahoo!"))
			return false;
		onClickByResourceId("jp.co.yahoo.android.yjtop:id/ButtonPositive");
		onClickByResourceId("android:id/button1");
		return true;
	}

	private boolean startYbackup() {
		if (!startAppByName("Y!バックアップ"))
			return false;
		onClickByResourceId("android:id/button1");
		onClickByResourceId("jp.co.yahoo.android.ybackup:id/ButtonStart");
		return true;
	}

	private boolean startSoftBank() {
		if (!startAppByName("メール"))
			return false;
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("jp.co.yahoo.android.ymobile.mail:id/list_next");
		dragUp();
		dragUp();
		dragUp();
		onClickByResourceId("android:id/button3");
		onClickByResourceId("android:id/button1");
		return true;

	}

	private boolean startSoftBank293() {

		if (!startAppByName("連携しよう"))
			return false;
		onClickByResourceId("android:id/button1");
		onClickByResourceId("jp.softbank.link:id/btn_can_do_id");
		onClickByResourceId("jp.softbank.link:id/btn_can_do_id");
		onClickByResourceId("jp.softbank.link:id/btn_can_do_id");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_center");
		dragUp();
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/pager");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("android:id/button1");
		return true;
	}

	private boolean openWord() {
		// word
		if (!startAppByPackage("com.microsoft.office.word/com.microsoft.office.apphost.LaunchActivity")) {
			return false;
		}
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		sleep(5);
		onClickByText("スキップ");
		return true;
	}

	private boolean openPPT() {
		// ppt
		if (!startAppByPackage("com.microsoft.office.powerpoint/com.microsoft.office.apphost.LaunchActivity")) {
			return false;
		}
		sleep(5);
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByText("スキップ");
		return true;
	}

	private boolean openExcel() {
		// EXCEL
		if (!startAppByPackage("com.microsoft.office.excel/com.microsoft.office.apphost.LaunchActivity")) {
			return false;
		}
		sleep(5);
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByText("スキップ");
		return true;
	}

	private boolean openOutLook() {
		// OUTLOOK
		if (!startAppByPackage("com.microsoft.office.outlook/com.microsoft.office.apphost.LaunchActivity")) {
			return false;
		}
		sleep(5);
		onClickByResourceId("com.microsoft.office.outlook:id/btn_splash_start");
		return true;

	}

	private boolean startGoogleMap() {
		if (!startAppByPackage("com.google.android.apps.maps/com.google.android.maps.MapsActivity",5)) {
			return false;
		}
		onClick(1100, 110);
		sleep(5);
		onClickByResourceId("com.google.android.apps.maps:id/tutorial_side_menu_got_it");
		return true;
	}

	private boolean startMySoftBank() {
		if (!startAppByName("My SoftBank+"))
			return false;
		onClickByResourceId("jp.softbank.mb.dtm:id/okButton");
		onClickByResourceId("jp.softbank.mb.dtm:id/checkBox");
		onClickByResourceId("jp.softbank.mb.dtm:id/agree");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("jp.softbank.mb.dtm:id/login");
		return true;
	}

	// 8
	private boolean startLink() {
		if (!startAppByName("連携しよう"))
			return false;
		onClickByResourceId("android:id/button1");
		if (!startAppByName("連携しよう"))
			return false;
		onClickByResourceId("jp.softbank.link:id/btn_can_do_id");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_center");
		dragUp();
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("jp.softbank.link:id/btn_right");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("jp.softbank.link:id/btn_start_link");
		return true;
	}

	private boolean startWifiSet() {
		if (!startAppByName("Wi-Fiスポット設定"))
			return false;
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByContainsText("OK");
		return true;
	}

	private boolean startNavi() {
		if (!startAppByName("Y!カーナビ"))
			return false;
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/list_close");
		onClickByText("同意する");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_page1_start_button");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/initiative_guidance_right_button");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/login_guidance_left_button");
		onClickByResourceId("jp.co.yahoo.android.apps.navi:id/review_encouragement_dialog_clear_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return true;
	}

	private boolean startDrive() {
		if (!startAppByName("ドライブ"))
			return false;
		device.click(150, 1790);
		sleep(5);
		return true;
	}

	// ------------------baseMethod----------------------
	public boolean openApps() {
		if (!isMain()) {
			backHome();
		}
		return onClickByText("アプリ");
	}

	public boolean isApps() {
		return getByClassName("android.support.v7.widget.RecyclerView")
				.exists();

	}

	public boolean backHome() {
		return device.pressHome();

	}

	public boolean isMain() {
		return getByResourceId(
				"com.huawei.android.launcher:id/workspace_screen").exists();
	}

	public boolean dragUp() {
		return device.drag(900, 1800, 900, 700, 15);
	}

	public boolean dragDown() {
		return device.drag(900, 700, 900, 1800, 15);
	}

	public boolean dragLeft() {
		return device.drag(1100, 1100, 1100, 36, 15);
	}

	public boolean dragRight() {
		return device.drag(1100, 36, 1100, 1100, 15);
	}

	public boolean startAppByName(String appName, int times) {
		openApps();
		for (int i = 0; i < start_app_by_name_times; i++) {
			if (onClickByText(appName)) {
				sleep(5);
				return true;
			}
			dragUp();
		}
		return false;
	}

	private static void print(boolean isSuccess, String time, String type,
			String msg) {
		String flag = "";
		if (!isSuccess) {
			flag = "==!=Fail=!=,";
		}
		print.println(flag + "time:" + time + ", type=" + type + ",desc=" + msg);
	}

	private static class Camera {
		public static String center_take_photo = "点击拍照";// 拍照center
		public static String center_vedio_none = "录像";// 录像center(未录像)
		public static String center_vedio_progress = "停止录像";// 录像center(正在录像)
		public static String camera_front = "切换到后置摄像头";// 前置
		public static String camera_post = "切换到前置摄像头";// 后置
		public static String vedio_mode = "切换到视频";// 录像switch
		public static String photo_mode = "切换到普通拍照";// 拍照switch
//		public static String center_take_photo = "タップして撮影";// 拍照center
//		public static String center_vedio_none = "ビデオを録画";// 录像center(未录像)
//		public static String center_vedio_progress = "録画の停止";// 录像center(正在录像)
//		public static String camera_front = "リアカメラに切り替え";// 前置
//		public static String camera_post = "フロントカメラに切り替え";// 后置
//		public static String vedio_mode = "動画に切り替え";// 录像switch
//		public static String photo_mode = "写真モードに切り替え";// 拍照switch
		public static String take_photo = "center_take_photo";// 拍照center
		public static String vedio_none = "center_vedio_none";// 录像center(未录像)
		public static String vedio_progress = "center_vedio_progress";// 录像center(正在录像)
		public static String front = "camera_front";// 前置
		public static String post = "camera_post";// 后置
		public static String vedio = "vedio_mode";// 录像switch
		public static String photo = "photo_mode";// 拍照switch

		public static String getIconMsg(String a) {
			if (a.equals(vedio_mode)) {
				return vedio;
			} else if (a.equals(photo_mode)) {
				return photo;
			} else if (a.equals(camera_post)) {
				return post;
			} else if (a.equals(camera_front)) {
				return front;
			} else if (a.equals(center_take_photo)) {
				return take_photo;
			} else if (a.equals(center_vedio_none)) {
				return vedio_none;
			} else if (a.equals(center_vedio_progress)) {
				return vedio_progress;
			}
			return a;

		}

		public static String getRelativeState(String a) {
			if (a.equals(vedio_mode)) {
				return photo_mode;
			} else if (a.equals(photo_mode)) {
				return vedio_mode;
			} else if (a.equals(camera_post)) {
				return camera_front;
			} else if (a.equals(camera_front)) {
				return camera_post;
			} else if (a.equals(center_take_photo)) {
				return center_vedio_none;
			} else if (a.equals(center_vedio_none)) {
				return center_vedio_progress;
			} else if (a.equals(center_vedio_progress)) {
				return center_take_photo;
			}
			return a;

		}

		public static String switchTest(String a) {
			if (a.equals(photo_mode) || a.equals(vedio_mode)) {
				return camera_post;
			} else if (a.equals(camera_post) || a.equals(camera_front)) {
				return photo_mode;
			}
			return a;

		}

		public static String[] getCurrentStatus(RYJumpLead device) {
			String[] list = new String[] { null, null, null };
			UiObject object = device.getByDescription(center_take_photo);
			if (object.exists())
				list[0] = take_photo;
			object = device.getByDescription(center_vedio_none);
			if (object.exists())
				list[0] = vedio_none;
			object = device.getByDescription(center_vedio_progress);
			if (object.exists())
				list[0] = vedio_progress;
			object = device.getByDescription(photo_mode);
			if (object.exists())
				list[1] = photo;
			object = device.getByDescription(vedio_mode);
			if (object.exists())
				list[1] = vedio;
			object = device.getByDescription(camera_front);
			if (object.exists())
				list[2] = front;
			object = device.getByDescription(camera_post);
			if (object.exists())
				list[2] = post;
			return list;
		}

		public static String getCurrentStatus(String[] a) {
			return "[ " + a[0] + "-" + a[1] + "-" + a[2] + " ]";

		}

		public static void printFailLog(UiDevice device, String failType,
				String failDesc) {
			String time = TimeUtil.formatTime();
			print(false, time, failType, failDesc);
			File a1 = new File("/sdcard/camera/" + failType + "_" + time
					+ ".png");
			device.takeScreenshot(a1);
		}

	}

	@Override
	public boolean set_sleep_time() {
		// TODO Auto-generated method stub
		return false;
	}
}
