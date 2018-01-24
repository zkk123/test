package com.test.cases;


import android.R.integer;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;
import com.test.utils.Log;



public class CY1668 extends BaseDevice{
    public CY1668(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		// TODO Auto-generated constructor stub
	}
	
	public boolean boot_Test() {
		wakeUp();
		unlocke_Screen();
		set_sleep_time();
		startCamera();
		startChrome();
		startClock();
		startDrive();
		startDuo();
		startFeedback();
		startGmail();
		startGoogleMusic();
		startMagicMovie();//
		startMusic();//
		startPhone_Master();//
		startGallery();
		startBoomplay();
		startFiles();
		startFont();
		startPalmstore();
		startSwiftKey();
		startwhatsApp();
		startXlend();
		startPalmchat();
		startPhotos();
		startService();
		startVideos();
		startWeather();//
		startXaccount();//
		startXshare();//
		startXTheme();//
		return false;
	}

	public boolean openApps() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isApps() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isMain() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean set_sleep_time(){
		startAppByPackage("com.android.settings", 3);
		onClickByText("Display");
		onClickByText("Advanced");
		onClickByText("Sleep");
		onClickByText("10 minutes");
		return false;
	}
	public boolean startPalmchat(){
		startAppByPackage("com.transsnet.chat/com.afmobi.palmchat.ui.activity.register.RegistrationActivity");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	dragLeft();
    	dragLeft();
    	dragLeft();
    	dragLeft();
    	return false;
	}
	private boolean startXlend() {
		startAppByPackage("cn.xender/.ui.activity.MainActivity");
    	dragLeft();
    	dragLeft();
    	dragLeft();
		onClickByResourceId("cn.xender:id/a0b");
		onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		onClickByResourceId("cn.xender:id/i8");
		onClickByResourceId("android:id/switch_widget");
		backHome();
		startAppByPackage("cn.xender/.ui.activity.MainActivity");
		onClickByResourceId("com.android.systemui:id/clock_view");
    	return false;
	}
	private boolean startwhatsApp() {
		startAppByPackage("com.touchtype.swiftkey/com.touchtype.materialsettings.HomeContainerActivity");
    	onClickByResourceId("com.whatsapp:id/close");
    	return false;
	}
	public boolean startSwiftKey(){
		startAppByPackage("com.touchtype.swiftkey/com.touchtype.materialsettings.HomeContainerActivity");
    	onClickByResourceId("com.touchtype.swiftkey:id/cloud_setup_not_now");
    	return false;
	}
	public boolean startPalmstore(){
		startAppByPackage("com.hzay.market/com.afmobi.palmplay.main.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	sleep(5);
    	onClickByResourceId("com.hzay.market:id/btn_enter");
    	onClickByResourceId("com.hzay.market:id/iv_img");
		return false;
		
	}
	public boolean startFont(){
		startAppByPackage("com.valitl.muldelux/com.iekie.lovelyfonts.fonts.activity.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("android:id/text1");
    	return false;
	}
    public boolean startCamera(){
    	startAppByPackage("org.codeaurora.snapcam");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startChrome(){
    	startAppByPackage("com.android.chrome");
    	onClickByResourceId("com.android.chrome:id/terms_accept");
    	onClickByResourceId("com.android.chrome:id/negative_button");
		return false;
    }
    public boolean startGmail(){
    	startAppByPackage("com.google.android.gm");
    	onClickByResourceId("com.google.android.gm:id/welcome_tour_got_it");
    	onClickByResourceId("com.android.chrome:id/negative_button");
		return false;
    }
    public boolean startDrive(){
    	startAppByPackage("com.google.android.apps.docs");
    	onClickByResourceId("com.google.android.apps.docs:id/skip");
		return false;
    }
    public boolean startGoogleMusic(){
    	startAppByPackage("com.google.android.music/com.android.music.activitymanagement.TopLevelActivity");
    	onClickByResourceId("com.google.android.music:id/skip_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startDuo(){
    	startAppByPackage("com.google.android.apps.tachyon/.MainActivity");
    	onClickByResourceId("com.google.android.apps.tachyon:id/welcome_agree_button");
    	onClickByResourceId("com.google.android.apps.tachyon:id/permission_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startPhotos(){
    	startAppByPackage("com.google.android.apps.photos/.home.HomeActivity");
    	onClickByResourceId("com.google.android.apps.photos:id/auto_backup_switch");
    	onClick(350, 750);
    	onClickByResourceId("android:id/button2");
    	
		return false;
    }
    public boolean startMagicMovie(){
    	backHome();
    	backHome();
    	onClickByText("MagicMovie");
    	onClickByResourceId("com.transsion.magicshow:id/skipBtn");
    	onClickByResourceId("android:id/ok");
    	onClickByResourceId("com.transsion.magicshow:id/fab");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	
		return false;
   
    }
    public boolean startXshare(){
    	startAppByPackage("com.infinix.xshare/.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startXTheme(){
    	startAppByPackage("com.transsion.XOSLauncher/com.transsion.theme.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startFeedback(){
    	startAppByPackage("com.rlk.feedback/.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startPhone_Master(){
    	startAppByPackage("com.transsion.phonemaster/com.cyin.himgr.widget.activity.MainActivity2");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startGallery(){
    	startAppByPackage("com.android.gallery3d/.app.GalleryActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    	
    }
    public boolean startWeather(){
    	startAppByPackage("com.rlk.weathers/.activity.WeatherMainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByText("Tap to select city");
    	onClickByText("Al Iskandariyah , Egypt");
		return false;
    }
    public boolean startXaccount(){
    	startAppByPackage("com.rlk.mi/.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startMusic(){
    	startAppByPackage("com.android.music/.MusicBrowserActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startVideos(){
    	startAppByPackage("com.myself.videoplayer/.MovieListActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startClock(){
    	startAppByPackage("com.android.deskclock/.DeskClock");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startService(){
    	startAppByPackage("com.afmobi.carlcare/.HomeActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }
    public boolean startBoomplay(){
    	startAppByPackage("com.afmobi.boomplayer/com.tecno.boomplayer.newUI.MainActivity");
    	onClickByResourceId("com.afmobi.boomplayer:id/btn_ok");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
    	onClickByResourceId("com.afmobi.boomplayer:id/rl_start_boomplayer");
		return false;
    }
    public boolean startFiles(){
    	startAppByPackage("com.transsion.filemanager/.activity.MainActivity");
    	onClickByResourceId("com.android.packageinstaller:id/permission_allow_button");
		return false;
    }

  
	   public void scenes_usb1(int a){
		   Log.clear(dataFolder+"log.lg");
			startAppByPackage("com.android.settings/.Settings",5);
			dragDown();
			onClickByText("Network & internet");
			onClickByText("Hotspot & tethering");
			boolean flags=false;
			UiObject object=null;
			Log.printlnLog(dataFolder+"log.lg",logContent("Start USB Test", "=========="));
			for(int i=0;i<20;i++){
				Log.printlnLog(dataFolder+"log.lg",logContent("start", "running "+i+" times"));
				object=getByText("Not sharing this phone’s Internet connection via Bluetooth");
				if(object.exists()){
					Log.printlnLog(dataFolder+"log.lg",logContent("test running", "open USB hotspot"));
					onClick(630,200);
				}else{
					object=getByText("Sharing this phone’s Internet connection via Bluetooth");
					if(object.exists()){
						Log.printlnLog(dataFolder+"log.lg",logContent("test running", "close USB hotspot"));
						onClick(630,200);
					}
				}
				Log.printlnLog(dataFolder+"log.lg",logContent("finshed", "the "+i+" times"));
				sleep(15);
			}
			
			
		    
		}
				//		cy1668.onClick(630,200);
			
		public void scenes_wifi2(int a){
			System.out.println("---------wifi---------");
			 set_sleep_time();
			 scenes_init();
			 Log.clear(dataFolder+"log.lg");
			UiObject object=null;
			Log.printlnLog(dataFolder+"log.lg",logContent("Start Wifi Test", "=========="));
			for(int i=0;i<10000;i++){
				Log.printlnLog(dataFolder+"log.lg",logContent("start", "running "+i+" times"));
				object=getByText("Not sharing this phone’s Internet connection via hotspot");
				if(object.exists()){
					Log.printlnLog(dataFolder+"log.lg",logContent("test running", "open wifi hotspot"));
					onClick(630,310);
				}else{
					object=getByText("itel S42 is active");
					if(object.exists()){
						Log.printlnLog(dataFolder+"log.lg",logContent("test running", "close wifi hotspot"));
						onClick(630,310);
					}else{
						scenes_init();
						continue;
					}
				}
				Log.printlnLog(dataFolder+"log.lg",logContent("finshed", "the "+i+" times"));
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
					onClick(630,700);
				}else{
					object=getByText("Sharing this phone’s Internet connection via Bluetooth");
					if(object.exists()){
						Log.printlnLog(dataFolder+"log.lg",logContent("test running", "close Bluetooth hotspot"));
						onClick(630,700);
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
			onClickByText("Network & internet");
			onClickByText("Hotspot & tethering");
		}
		
		private String logContent(String type,String con){
			return "["+type+"]"+con;
			
		}
  
   
}
