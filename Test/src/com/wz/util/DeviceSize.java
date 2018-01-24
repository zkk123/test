package com.wz.util;

public class DeviceSize {
    private double width,hight;

	private DeviceSize(double width, double hight) {
		super();
		this.width = width;
		this.hight = hight;
	}
    
	public double getWidth() {
		return width;
	}

	public double getHight() {
		return hight;
	}
     
}
