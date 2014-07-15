package com.lxn.planegame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import com.lxn.util.GameUtil;

public class Plane extends MyGameObject{
	
	boolean left,right,up,down;
	int speed=8;
	
	
	Plane(String imgpath,double x,double y){
		this.x=x;
		this.y=y;
		img=GameUtil.GetImage(imgpath);
		width=img.getWidth(null)-10;
		height=img.getHeight(null)-10;
	}
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y,null);
		move();
	}
	
	public void checkmove(KeyEvent e){
		if(e.getKeyCode()==37)
			left=true;
		if(e.getKeyCode()==38)
			up=true;
		if(e.getKeyCode()==39)
			right=true;
		if(e.getKeyCode()==40)
			down=true;
	}
	
	public void checkedmove(KeyEvent e){
		if(e.getKeyCode()==37)
			left=false;
		if(e.getKeyCode()==38)
			up=false;
		if(e.getKeyCode()==39)
			right=false;
		if(e.getKeyCode()==40)
			down=false;
	}
	
	public void move(){
		if(left)
			x-=speed;
		if(right)
			x+=speed;
		if(up)
			y-=speed;
		if(down)
			y+=speed;
	}
}
