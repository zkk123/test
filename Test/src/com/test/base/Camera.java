package com.test.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.test.utils.TimeUtil;

public class Camera {
     public String POST_CAMERA;
     public String FRONT_CAMERA;
     public String SHUTTER_PHOTO_CAMERA;
     public String SHUTTER_VEDIO_STOPE;
     public String SHUTTER_VEDIO_START;
     public String MODE_VEDIO;
     public String MODE_PHOTO;
     public String VEDIO_PAUSE;
     public String VEDIO_CONTINUE;
     public File logFile;
     public static PrintStream print;
     public void init(){
    	 File b=new File("/sdcard/camera");
			b.mkdir();
			b.delete();
			b.mkdir();
			logFile=new File("/sdcard/camera/log.txt");
			try {
				logFile.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FileOutputStream ops=null;
			try {
				ops=new FileOutputStream(logFile);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			print=new PrintStream(ops);
			print.println("");
			try {
				ops=new FileOutputStream(logFile,true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			print=new PrintStream(ops);
     }
}
