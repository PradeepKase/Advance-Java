package sprint2day2;

public class ThreadA implements Runnable{
	public void run() {
		String Tname1=Thread.currentThread().getName();
		System.out.println(Tname1 +" is running ");
		for(int i=0; i<5; i++) {
			System.out.println("inside ThreadA");
		}
	}

 


}
