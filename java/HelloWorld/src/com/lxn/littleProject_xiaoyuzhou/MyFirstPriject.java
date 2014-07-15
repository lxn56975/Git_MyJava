package com.lxn.littleProject_xiaoyuzhou;

import java.awt.Graphics;
import java.awt.Image;


public class MyFirstPriject extends GameFrame{

	Image img=GameUtil.GetImage("Image/bg.jpg");
	Star sun=new Star("Image/sun.jpg", Constant.Game_Width/2, Constant.Game_Height/2);
	Planet earth=new Planet("Image/Earth.jpg", Constant.Game_Width/2, Constant.Game_Height/2, 150, 90, sun);
	Planet mars=new Planet("Image/Mars.jpg", earth.x, earth.y, 30, 20, earth);
	
	@Override	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0,null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
	}



	public static void main(String[] args) {
		MyFirstPriject  my=new MyFirstPriject();
		my.lauchFrame();
	}
}
