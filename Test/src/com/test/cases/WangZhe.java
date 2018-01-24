package com.test.cases;

import java.io.File;
import java.io.IOException;


import android.R.integer;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.math.util.Coordinate;
import com.math.util.UnitCenter;
import com.test.base.BaseDevice;
import com.test.utils.PictureContrast;


public class WangZhe extends BaseDevice{
  public UnitCenter center,center2;
  private  int x0=1279,y0=984;
  private  int x9=1740,y9=943;
  private  int x1=1442,y1=926;
  private  int x2=1565,y2=743;
  private  int x3=1754,y3=909;
  private  int o1=240,o2=850;
  private  int readus=810,letter_move=40;
private static int big_move=400;
private int letter_time=10;
private static int big_time=100;
  private static File file1,file2;
//again_c=52.6/29.5  x=35.4  43.7  y=25.3 28.5
//chuangguan c=52.8/29.7   x=36.1 44.4 y=23.6 26.8
		//tiaoguo c=52.8/29.7   x=46.4 52.1  y=0.7 2.9
		//clickjx c=52.8/29.7 x=22.5 30.2 y=27.4 28.5
		//fangxiang c=52.8/29.7 x=23.5 y=6.4
		//huixue  c==52.8/29.7  x=33.2 36.2 y=25 28.2
		//auto   c=52.8/29.7 x=48.4 50.2   y=0.5 1.6
		//skill 1  c=52.8/29.7 x=37.7 41   y=24.1 28
		//skill 2  c=52.8/29.7 x=40.7 44.3   y=18.5 22.3
		//skill 3  c=52.8/29.7 x=46.7 50   y=15.4 19.1
		 //                        
		//skill puton c=52.8/29.7 x=45.5 50.9   y=22.5 28
    private Coordinate skill0=null,skill1=null,skill2=null,skill3=null,recorve=null,checkIn=null,skip=null,ctrl=null,antoSkill=null,proceed=null;
	public WangZhe(UiAutomatorTestCase uiAutomatorTestCase) {
		super(uiAutomatorTestCase);
		center=new UnitCenter(o1, o2, 200);
		file=new File("/sdcard/wz");
    	if(file.exists()){
    		file1=new File("/sdcard/wz/chg.png");
    		if(!file1.exists())System.exit(1);
    	}else{
    		System.exit(1);
    	}
		
    	
	}
	private void my_init(){
		if(width<height){
			int t=width;
			width=height;
			height=width;
		}
		this.skill0 = skill0;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.recorve = recorve;
		this.checkIn = checkIn;
		this.skip = skip;
		this.ctrl = ctrl;
		this.antoSkill = antoSkill;
		this.proceed = proceed;
	}
	public void start(){
    	RstartYX();
    	for(int i=0;i<300;i++){
    		startTest(1);
    	}
    }
	public boolean startTest(int a) {
		RstartYX();
		sleep(10);
		skip();
		move(115,8);
		move(45,2);
		System.out.println("-------0");
		skill();//==
		recove();
		move(45,8);
		System.out.println("-------1");
		move(335,4);
		skill(1);
		recove();
		System.out.println("-------2");
		move(50,8);
		skill(1);
		sleep(1);
		System.out.println("-------3");
		move(90,3);
		System.out.println("-------4");
		move(125,8);
		recove();
		skill(1);//----------1
		move(100,3);
		move(125,8);
		recove();
		skill(1);
		System.out.println("-------5");
		move(225,10);
		move(225,10);
		System.out.println("---boss----");
		skip();
		recove();
		System.out.println("---big_skill----");
		big_Skill();
		System.out.println("----finsh---");
		sleep(1);
		System.out.println("----skip---");
		skip();
		sleep(4);
		System.out.println("----jx---");
		clickJX();
		againSkill();
		return false;
	}
    private void RstartYX(){
    	sleep(2);
    	file2=new File("/sdcard/wz/chg2.png");
    	for(int i=0;i<11;i++){
    	device.takeScreenshot(file2);
    	if(compare()){
    	file2.delete();
    	System.out.println("----     like      ---");
    	break;}
    	else{
    		if(i==11)System.exit(1);
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	}
    	
    	chuangguan();
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
	private void move(int angle){
		move(angle,5);
	}
	
	private void move(int angle,int steps){
		GC gc=GC.switch_move(steps);
		int s_steps=gc.getMove(),s_time=gc.getTime();
		
		UnitCenter centerv=new UnitCenter(o1, o2, s_steps);
		int endX=(int) centerv.getCoorDinateByAngle(angle).getX();
    	int endY=(int) centerv.getCoorDinateByAngle(angle).getY();
    	for(int i=0;i<2;i++){
    	device.swipe(o1, o2,endX, endY, s_time);
    	System.out.println(o1+","+ o2+","+endX+" ,"+ endY);
    	}
    }
	private void skill1(){
		onClick(x1, y1);
	}
    private void skill2(){
    	onClick(x2, y2);
	}
    private void skill3(){
    	onClick(x3, y3);
	}
    private void skill9(){
    	onClick(x9, y9);
	}
    private void recove(){
		onClick(x0, y0);
	}
    private void big_Skill(){
    		skill9();
    		skill9();
    		skill3();
    		recove();
    		skill(1);
    		
    }
    private void skill(int times){
    	for(int i=0;i<times;i++){
    		if(i%2==0)skill1();
    		skill9();
    		skill9();
    		skill9();
    		skill9();
    	}
    	
    }
    private void skill(){
    	    skill1();
    		skill9();
    		skill9();
    }
    private void skip(){
    	onClick(1795,50);
    }
    private void clickJX(){
    	onClick(942,1017);
    	sleep(3);
    }
    private void againSkill(){
    	onClick(1439,997);
    }
    private void chuangguan(){
    	onClick(1472,920);
    }
    private boolean compare(){
    	double a=PictureContrast.similarity("/sdcard/wz/chg2.png", "/sdcard/wz/chg.png");
    	System.out.println("====like==="+a);
    	return a>80;
    }
    private static class GC{
    	private int time,move;

		private GC(int time, int move) {
			super();
			this.time = time;
			this.move = move;
		}
        
		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public int getMove() {
			return move;
		}
        
		public void setMove(int move) {
			this.move = move;
		}
		//1195/1919  1920 1080
		//cg_x=1470,cg_y=914
//		 private  int x0=1279,y0=984;
//		  private  int x9=1740,y9=943;
//		  private  int x1=1442,y1=926;
//		  private  int x2=1565,y2=743;
//		  private  int x3=1754,y3=909;
//		  private  int o1=240,o2=850;
		//again_c=52.6/29.5  x=35.4  43.7  y=25.3 28.5
		//chuangguan c=52.8/29.7   x=36.1 44.4 y=23.6 26.8
		//tiaoguo c=52.8/29.7   x=46.4 52.1  y=0.7 2.9
		//clickjx c=52.8/29.7 x=22.5 30.2 y=27.4 28.5
		//fangxiang c=52.8/29.7 x=23.5 y=6.4
		//huixue  c==52.8/29.7  x=33.2 36.2 y=25 28.2
		//auto   c=52.8/29.7 x=48.4 50.2   y=0.5 1.6
		//skill 1  c=52.8/29.7 x=37.7 41   y=24.1 28
		//skill 2  c=52.8/29.7 x=40.7 44.3   y=18.5 22.3
		//skill 3  c=52.8/29.7 x=46.7 50   y=15.4 19.1
		 //                        
		//skill puton c=52.8/29.7 x=45.5 50.9   y=22.5 28
//		  private  int readus=810,letter_move=40,big_move=400,letter_time=10,big_time=100;
		private void myInit(){
			
		}
		public static GC switch_move(double a){
			double i_move=a/10*big_move;
			double i_time=a/10*big_time;
			return new GC((int)i_time, (int)i_move);
	    }
    	
    }
	@Override
	public boolean set_sleep_time() {
		// TODO Auto-generated method stub
		return false;
	}
}
