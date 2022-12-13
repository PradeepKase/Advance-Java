package eval2;

public class A extends Thread {
int total=0;
public void run() {
	for(int i=1; i<=10; i++) {
		total+=i;
	}
	this.notify();
}
}
