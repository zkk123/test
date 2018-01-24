package com.wz.util;

public class ICON {
   private double under,upper,left,right;

public ICON(DeviceSize size,double under, double upper, double left, double right) {
	super();
	this.under = under;
	this.upper = upper;
	this.left = left;
	this.right = right;
}

public double getUnder() {
	return under;
}

public double getUpper() {
	return upper;
}

public double getLeft() {
	return left;
}

public double getRight() {
	return right;
}
   
}
