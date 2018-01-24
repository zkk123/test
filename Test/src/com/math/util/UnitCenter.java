package com.math.util;

public class UnitCenter {
	private double Center_X=0,Center_Y=0,radius=1;
	
	public UnitCenter(double center_X, double center_Y, double radius) {
		super();
		Center_X = center_X;
		Center_Y = center_Y;
		this.radius = radius;
	}

	public Coordinate getCoorDinateByAngle(double angle){
		angle=angle%360;
		angle=angle/180*Math.PI;
		int x=(int)(Math.cos(angle)*radius+Center_X);
		int y=(int)(Center_Y-Math.sin(angle)*radius);
		return new Coordinate(x, y);
	}
}
