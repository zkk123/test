package com.test.cases;

import android.widget.TextView;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;

public class ALOO extends BaseDevice {

	public ALOO(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		// TODO Auto-generated constructor stub
	}

	public boolean boot_Test() {
		test();
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
	public void test(){
		wakeUp();
		unlocke_Screen();
		page("com.huawei.hwid/.ui.extend.setting.StartUpGuideLoginActivity");
		id("com.huawei.wallet:id/next_step");
		page("com.huawei.lives/com.huawei.lifeservice.basefunction.ui.homepage.HWSYNew");
		id("android:id/button1");
		id("android:id/button1");
		page("com.vmall.client/.activity.VmallWapActivity");
		id("com.vmall.client:id/button_positive");
		page("com.huawei.phoneservice/.ui.MainActivity");
		id("android:id/button1");
		page("com.huawei.fans/.activity.MainActivity");
		dragLeft();
		dragLeft();
		dragLeft();
		id("android:id/button1");
		page("com.huawei.appmarket/.MarketActivity");
		id("android:id/button1");
		page("com.huawei.himovie/.ui.main.PhoneMainActivity");
		id("com.huawei.himovie:id/mainActivity_btn_config");
		page("com.android.mediacenter/.MainActivity");
		id("android:id/button1");
		page("com.huawei.hwireader/com.zhangyue.iReader.bookshelf.ui.ActivityMain");
		id("android:id/button1");
		id("com.huawei.hwireader:id/iv_male");
		id("com.huawei.hwireader:id/iv_publish");
		id("com.huawei.hwireader:id/bt_start");
		page("com.android.gallery3d/com.huawei.gallery.app.GalleryMain");
		id("com.android.gallery3d:id/negative_button");
		id("com.android.gallery3d:id/id_list");
		page("com.huawei.android.thememanager/.HwThemeManagerActivity");
		id("android:id/button1");
		page("com.huawei.hidisk/.filemanager.FileManager");
		id("android:id/button1");
		page("com.huawei.gamebox/.GameBoxMainActivity");
		id("android:id/button1");
		page("com.android.settings/.ChooseLockGeneric");
		id("com.huawei.trustspace:id/page1_next_button");
		id("com.huawei.trustspace:id/page3_setup_button");
		page("com.huawei.vassistant/.ui.VAssistantActivity");
		id("android:id/button1");
		page("com.huawei.parentcontrol/.ui.activity.MainActivity");
		id("com.huawei.parentcontrol:id/guide_next");
		id("com.huawei.parentcontrol:id/tv_privacy_confirm_agree");
		page("com.android.soundrecorder/.SoundRecorder");
		id("android:id/button1");
		page("com.huawei.KoBackup/.InitializeActivity");
		id("android:id/button1");
		page("com.huawei.android.findmyphone/.ui.FindMyPhoneActivity");
		id("android:id/button1");
		page("com.huawei.hwvplayer.youku/com.huawei.hwvplayer.framework.MainPageActivi");
		id("android:id/button1");
		id("com.android.packageinstaller:id/do_not_ask_checkbox");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/do_not_ask_checkbox");
		id("com.android.packageinstaller:id/permission_allow_button");
		page("com.microsoft.office.word/.WordActivity");
		id("com.android.packageinstaller:id/do_not_ask_checkbox");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.microsoft.office.word:id/skip_disclaimer_check_box");
		id("android:id/button1");
		page("com.microsoft.office.word/.WordActivity");
		id("com.microsoft.office.excel:id/skip_disclaimer_check_box");
		id("android:id/button1");
		page("com.microsoft.office.powerpoint/.PPTActivity");
		id("com.microsoft.office.powerpoint:id/skip_disclaimer_check_box");
		id("android:id/button1");
		page("com.microsoft.office.outlook/com.acompli.acompli.ui.onboarding.AddAccoun");
		id("com.microsoft.office.outlook:id/dont_ask_switch");
		id("com.microsoft.office.outlook:id/ok_button");
		id("com.microsoft.office.outlook:id/btn_splash_start");
		id("android:id/button1");
		page("com.slanissue.apps.pad.bevafamily/com.slanissue.apps.mobile.bevafamilyed");
		id("com.slanissue.apps.pad.bevafamily:id/tv_dialog_state_ns");
		onClickByText("点击确定");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		page("com.sinoangel.kids.mode_new.ks/.core.MainActivity");
		onClickByText("点击确定");
	    id("com.sinoangel.kids.mode_new.ks:id/tv_ok");
	    id("com.android.packageinstaller:id/permission_allow_button");
	    id("com.android.packageinstaller:id/permission_allow_button");
	    page("com.tencent.news/.activity.SplashActivity");
	    id("com.tencent.news:id/buttonRight");
	    
		
	}
	public void page(String page){
		startAppByPackage(page);
	}
	public void id(String id){
	    onClickByResourceId(id);
	}

	@Override
	public boolean set_sleep_time() {
		// TODO Auto-generated method stub
		return false;
	}
}
