package com.util;

import java.util.TimerTask;

public class TimeOutTask  extends TimerTask implements Runnable {
	 public boolean isTimedOut = false;
	
	public void run() {
		isTimedOut=true;
	}

	
}
