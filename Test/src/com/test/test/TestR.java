package com.test.test;

import java.io.File;
import java.util.Set;

import com.test.utils.ClassTools;


public class TestR {
    public static String basePath;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[]a=new byte[10];
		System.out.println("------"+a[8]);
	}
	public static void p(){
		System.out.println("----");
	//	String s1 = TestDemo.class.getResource("/").getPath();
		System.out.println("----"+TestR.class.getResource("/lib").getPath() );
//	    File file=new File(s1);
//	    for(String a:file.list()){
//		System.out.println(a );
//	    }
	}
}
