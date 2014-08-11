package misc.javaPapers.timers;

import java.util.Timer;

public class TimerPiano {
	 
	  Timer dingTimer;
	  Timer dongTimer;
	 
	  public TimerPiano(int ding,int dong) {
	 
	    dingTimer = new Timer();
	    dingTimer.schedule(new Sound("Ding!"), ding * 1000, ding * 1000);
	    dingTimer.scheduleAtFixedRate(new Sound("Ding!"), ding * 1000, ding * 1000);
	 
	    dongTimer = new Timer();
	    dongTimer.schedule(new Sound("Dong!"), dong * 1000, dong * 1000);
	    dongTimer.scheduleAtFixedRate(new Sound("Dong!"), dong * 1000, dong * 1000);
	  }
	 
	  public static void main(String args[]) {
	    new TimerPiano(2,4);
	  }
	}