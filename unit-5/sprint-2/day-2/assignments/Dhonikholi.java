package sprint2day2;

public class Dhonikholi implements Runnable{
	public void run(){
		for(int i=0;i<25;i++){
		String tname=Thread.currentThread().getName();
		System.out.println(tname +": is running");
		}
}
}
