package sprint2day2;

public class ThreadC extends Thread {
	public void run() {
		for(int i=10; i<15; i++) {
			System.out.println("inside ThreadC");
		}
	}
}
