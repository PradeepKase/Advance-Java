package sprint2day2;

public class ThreadB implements Runnable{
	public void run() {
		String Tname2=Thread.currentThread().getName();
		System.out.println(Tname2 +" is running ");
		for(int i=5; i<10; i++) {
			System.out.println("inside ThreadB");
		}
	}
}
