package eval2;

public class ThreadB extends Thread{
public void run() {
	int sum = 0;
	for(int i=1; i<=20; i++) {
		sum+=i;
	}
	System.out.println("Kholi thread"+sum);
}
}
