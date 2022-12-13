package sprint2day2;

public class X extends Thread {
	@Override
 public void run() {
	 for(int i=5;i<10; i++) {
		 System.out.println("Insode thread class"+ i);
	 }
 }
}
