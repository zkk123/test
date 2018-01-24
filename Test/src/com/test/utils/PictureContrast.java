package com.test.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.test.base.BaseDevice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Base64;

public class PictureContrast {
    private static int t = 0;
    private static int f = 0;
    public static void cutImage(Rect rect, String filePath) {  
        BitmapFactory.Options bfOptions = new BitmapFactory.Options();  
        bfOptions.inDither = false;  
        bfOptions.inTempStorage = new byte[12 * 1024];  
        bfOptions.inJustDecodeBounds = true;  
        Bitmap m = BitmapFactory.decodeFile(filePath);  
        m = m.createBitmap(m, rect.left, rect.top, rect.width(), rect.height());//获取头像  
    
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        m.compress(Bitmap.CompressFormat.JPEG, 90, bos);//压缩图片  
        byte[] data = bos.toByteArray();//转换成字节  
        String img=new String(Base64.encodeToString(data,Base64.DEFAULT));//base64编码  
    
        //保存图片到sdcard  
        saveImage(m, "cutImage");  
    }  
    
    public static void saveImage(Bitmap bitmap, String name) {  
        FileOutputStream out = null;  
        try {  
            out = new FileOutputStream(name);  
            if (out != null) {  
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);  
                out.close();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
    
    public static void getImage(BaseDevice dv,UiDevice device,String objectResourceId) {  
        UiObject uiObject = dv.getByResourceId(objectResourceId);  
        try {  
            Rect rect = uiObject.getBounds();  
            String path = "/storage/emulated/0/Pictures/screenshot.png";  
            File file = new File(path);  
            device.takeScreenshot(file);  
            cutImage(rect, path);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
    public static double similarity (String url_one,String url_two) {
        //把图片转换为Bitmap
        Bitmap bm_one = BitmapFactory.decodeFile(url_one);
        Bitmap bm_two = BitmapFactory.decodeFile(url_two);
        //保存图片所有像素个数的数组，图片宽×高
        int[] pixels_one = new int[bm_one.getWidth()*bm_one.getHeight()];
        int[] pixels_two = new int[bm_two.getWidth()*bm_two.getHeight()];
        //获取每个像素的RGB值
        bm_one.getPixels(pixels_one,0,bm_one.getWidth(),0,0,bm_one.getWidth(),bm_one.getHeight());
        bm_two.getPixels(pixels_two,0,bm_two.getWidth(),0,0,bm_two.getWidth(),bm_two.getHeight());
        //如果图片一个像素大于图片2的像素，就用像素少的作为循环条件。避免报错
        if (pixels_one.length >= pixels_two.length) {
            //对每一个像素的RGB值进行比较
            for(int i = 0; i < pixels_two.length; i++){
                int clr_one = pixels_one[i];
                int clr_two = pixels_two[i];
                //RGB值一样就加一（以便算百分比）
                if (clr_one == clr_two) {
                    t++;
                }else {
                    f++;
                   }
            }
        }else {
            for(int i = 0; i < pixels_one.length; i++){
                int clr_one = pixels_one[i];
                int clr_two = pixels_two[i];
                if (clr_one == clr_two) {
                    t++;
                }else {
                    f++;
                }
            }
             
        }
         
        return myPercent(t,t+f);
         
    }
    /**
     * 百分比的计算
     * @author xupp
     * @param y(母子)
     * @param z（分子）
     * @return 百分比（保留小数点后两位）
     */
    public static double myPercent(int y,int z)
    {
        double baiy=y*1.0;
        double baiz=z*1.0;
        double fen=baiy/baiz;
        return fen*100;
    }
     
}