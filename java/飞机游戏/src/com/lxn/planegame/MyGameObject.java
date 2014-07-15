package com.lxn.planegame;

import java.awt.Image;
import java.awt.Rectangle;

public class MyGameObject {
	double x;
	double y;
	Image img;
	double width,height;
	
	public Rectangle getrectange(){
		return new Rectangle((int)x, (int)y, (int)width, (int)height);
	}
}
