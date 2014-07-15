package com.lxn.planegame;

import java.util.Date;
import java.util.Timer;

public class CountTime {

	long starttime;
	
	CountTime(){
		starttime=System.currentTimeMillis();
	}
	
	public int running(){
		return (int)(System.currentTimeMillis()-starttime)/1000;
	}
}
