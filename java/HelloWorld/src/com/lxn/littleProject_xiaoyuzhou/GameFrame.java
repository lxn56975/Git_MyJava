package com.lxn.littleProject_xiaoyuzhou;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.plaf.ColorUIResource;

/**
 *  第一个小游戏      画太阳系
 * @author xiaoning
 *
 */
public class GameFrame extends Frame{
	/**
	 * 加载窗口
	 * 
	 */
	public void lauchFrame(){
		setSize(Constant.Game_Width, Constant.Game_Height);
		setLocation(300, 100);
		setVisible(true);
		new paintTread().start();
		
		/**
		 * 关闭窗口
		 */
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	
	/**
	 *在程序上画东西。。。。
	 *类似画笔的作用，Frame会自动调用此重写函数
	 */
	@Override
	public void paint(Graphics g) {	
		/**
		 *图片运动的实现
		 */
				
	}
	
	
/**
 * 定义一个重画窗体的内部类，内部类哦
 * @author xiaoning
 *
 */
class paintTread extends Thread{
	public void run(){
		while(true){
			repaint();
			try {
				super.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}
