package sprint2day2;

public class Main3 {
public static void main(String[] args) {
	for(int i=0; i<5; i++) {
		System.out.println(i);
	}
	ThreadA t1= new ThreadA();
	ThreadB t2= new ThreadB();
	Thread a= new Thread(t1);
	Thread b= new Thread(t1);
	a.setName("Dhoni thread..");
	b.setName("Kohli thread..");
	a.start();
	b.start();
}
}
