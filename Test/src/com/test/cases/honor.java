

package com.test.cases;

import android.R.integer;
import android.widget.TextView;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.test.base.BaseDevice;

public class honor extends BaseDevice {

	public honor(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		// TODO Auto-generated constructor stub
	}

	public boolean startTest(int a) {
		wakeUp();
		unlocke_Screen();
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
		page("com.huawei.appmarket/.MarketActivity");
		id("com.huawei.appmarket:id/notice_push_check_box");
		id("com.huawei.appmarket:id/protocol_check_box");
		id("com.huawei.appmarket:id/base_okBtn");
		page("com.android.mms/.ui.ConversationList");
		id("com.android.mms:id/ckb_not_disturb");
		id("com.android.mms:id/btn_privacy_agreement");
		page("com.huawei.camera/com.huawei.camera");
		id("android:id/button1");
		id("android:id/button1");
		page("com.huawei.himovie/.ui.main.PhoneMainActivity");
		id("com.huawei.himovie:id/cb_push");
		id("android:id/button1");
		id("com.android.packageinstaller:id/permission_allow_button");
		page("");
		dragLeft();
		dragLeft();
		id("");
		page("com.android.mediacenter/.MainActivity");
		id("android:id/button1");
		page("com.huawei.hnreader/com.qq.reader.activity.MainFragmentActivity");
		id("com.huawei.hnreader:id/dialogcheckbox");
		id("android:id/button1");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.huawei.hnreader:id/boy");
		page("com.android.gallery3d/com.huawei.gallery.app.GalleryMain");
		id("com.android.gallery3d:id/check_notips");
		id("android:id/button1");
		page("com.huawei.systemmanager/.mainscreen.MainScreenActivity");
		id("com.huawei.systemmanager:id/checkbox_notremind");
		id("android:id/button1");
		page("com.huawei.android.thememanager/.HwThemeManagerActivity");
		id("com.huawei.android.thememanager:id/agree_checkbox");
		id("android:id/button1");
		page("com.huawei.hidisk/.filemanager.FileManager");
		id("com.huawei.hidisk:id/dialog_checkbox_id");
		id("android:id/button1");
		page("com.huawei.gamebox/.GameBoxMainActivity");
		id("com.huawei.gamebox:id/protocol_check_box");
		id("com.huawei.gamebox:id/update_download_check_box");
		id("com.huawei.gamebox:id/base_okBtn");
		page("com.huawei.android.remotecontrol/.ui.PhoneFinderActivity");
		id("android:id/button1");
		page("com.huawei.android.totemweather/.WeatherHome");
		dragDown();
		page("com.android.hwmirror/.Mirror");
		id("com.android.hwmirror:id/steam_checkbox");
		id("android:id/button1");
		id("com.android.hwmirror:id/brightnessbar_plus");
		page("com.huawei.KoBackup/.InitializeActivity");
		id("com.huawei.KoBackup:id/dialog_checkbox_id");
		id("android:id/button1");
		page("com.huawei.betaclub/.home.LoginActivity");
		id("com.baidu.input_huawei:id/ciku_checkbox");
		id("android:id/button1");
		page("com.netease.newsreader.activity/com.netease.nr.phone.main.MainActivity");
		id("com.netease.newsreader.activity:id/biz_ad_flowremind_checkbox");
		id("com.netease.newsreader.activity:id/ok");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		page("com.huawei.hwvplayer.youku/com.huawei.hwvplayer.framework.MainActivity");
		id("com.huawei.hwvplayer.youku:id/dialog_checkbox");
		id("android:id/button1");
		page("cn.wps.moffice_eng/cn.wps.moffice.main.local.home.PadHomeActivity");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("cn.wps.moffice_eng:id/checkBox_flow");
		id("cn.wps.moffice_eng:id/dialog_button_positive");
		page("com.vmall.client/.activity.VmallWapActivity");
		id("com.vmall.client:id/checkbox_tips");
		id("com.vmall.client:id/button_positive");
		page("com.huawei.hwid/.ui.extend.setting.StartUpGuideLoginActivity");
		onClick(588, 1614);
		id("com.huawei.wallet:id/accept_license_checkbox");
		id("android:id/button1");
		page("com.huawei.phoneservice/.ui.HelpCenterActivity");
		id("com.huawei.phoneservice:id/remind_checkbox");
		id("android:id/button1");
		page("com.huawei.fans/.activity.MainActivity");
		id("com.huawei.fans:id/fans_no_reminder");
		id("android:id/button1");
		page("com.huawei.lives/com.huawei.lifeservice.basefunction.ui.homepage.HWSYNewActivit");
		id("com.huawei.lives:id/hw_cb");
		id("com.huawei.lives:id/hw_dialog_queding");
		id("com.huawei.lives:id/hw_cb");
		id("com.huawei.lives:id/hw_dialog_queding");
		page("com.baidu.BaiduMap/com.baidu.baidumaps.MapsActivity");
		id("com.baidu.BaiduMap:id/positiveButton");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.baidu.BaiduMap:id/negativeButton");
		page("com.dianping.v1/.NovaMainActivity");
		id("com.dianping.v1:id/checkBox");
		id("android:id/button1");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.dianping.v1:id/guidance_skip");
		id("android:id/text1");
		page("com.jingdong.app.mall/.MainFrameActivity");
		onClick(99, 1174);
		id("android:id/button1");
		id("com.android.packageinstaller:id/permission_allow_button");
		dragLeft();
		dragLeft();
		dragLeft();
		dragLeft();
		dragLeft();
		id("com.android.packageinstaller:id/permission_allow_button");
		page("com.achievo.vipshop/.newactivity.MainActivity");
		id("com.achievo.vipshop:id/ok");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.android.packageinstaller:id/permission_allow_button");
		dragLeft();
		dragLeft();
		id("com.achievo.vipshop:id/ok");
		id("com.android.packageinstaller:id/permission_allow_button");
		id("com.achievo.vipshop:id/text");
		
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
