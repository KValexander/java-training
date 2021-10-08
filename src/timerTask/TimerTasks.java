package timerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {

	public static void main(String[] nargs) {
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter + " seconds");
					counter--;
				}
				else {
					System.out.println("Task is complete");
					timer.cancel();
				}
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.OCTOBER);
		date.set(Calendar.DAY_OF_MONTH, 8);
		date.set(Calendar.HOUR_OF_DAY, 19);
		date.set(Calendar.MINUTE, 23);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
//		timer.schedule(task, 3000);
//		timer.schedule(task, date.getTime());
		timer.scheduleAtFixedRate(task, 0, 1000);
//		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}
}
