package com.lxn.littleProject_xiaoyuzhou;

import java.awt.Graphics;
import java.awt.Image;



public class Star {
	double x,y;
	Image img;
	
	Star(){
		
	}
	
	Star(String imagepath,double x,double y){
		this.img=GameUtil.GetImage(imagepath);
		this.x=x;
		this.y=y;
	}
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
}
