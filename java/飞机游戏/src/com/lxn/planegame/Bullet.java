package com.lxn.planegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.lxn.util.Constant;

public class Bullet extends MyGameObject{
	int speed=5;
	double degree;
	
	Bullet(){
		this.x=Constant.Game_Width/2;
		this.y=Constant.Game_Height/2;
		this.degree=Math.random()*Math.PI*2;	
		width=10;
		height=10;
	}
	
	
	public void draw(Graphics g){
		
		Color c=g.getColor();
		g.setColor(Color.yellow);
		g.fillOval((int)x, (int)y, (int)width, (int)height);
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		if(x>=Constant.Game_Width-width||x<=width)
			degree=Math.PI-degree;
		else if(y>=Constant.Game_Height-height||y<=30)
			degree=-degree;
		g.setColor(c);
		
		
		
	}
}
