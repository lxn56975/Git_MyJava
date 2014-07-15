package com.lxn.littleProject_xiaoyuzhou;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
	private GameUtil(){}
	
    /**
     * 游戏工具，传进来路径，返回图片
     * @param path
     * @return
     */
	public static Image GetImage(String path){
		URL url=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage image=null;
		try {
			image=ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}

}
