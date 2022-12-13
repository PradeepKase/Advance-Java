package eval2;

public class ThreadA extends Thread{
public void run() {
	for(int i=1; i<=10; i++) {
		System.out.println("Dhoni thread"+i);
	}
}
}
