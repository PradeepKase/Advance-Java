package eval2;

public class ThreadC extends Thread{
public void run() {
	int pro=1;
	for(int i=1; i<=10; i++) {
		pro=pro*i;
	}
	System.out.println("Rohit thread"+ pro);
}
}
