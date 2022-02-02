package application;

import java.util.Timer;
import java.util.TimerTask;

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
	}

}

//can have more than one class in a file, but only one of them
//is the public class
class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println("hello");
		
	}
	
}

