package sprint2day2;

public class Q7 {
public static void main(String[] args) {

	Q7A t1= new Q7A();
//	Q7B t2= new Q7B();
	Thread th1= new Thread(t1);
	Thread th2= new Thread(t1);
	
	th1.setName("Dhoni");
	th2.setName("Kholi");
	
	th1.setPriority(8);
	th2.setPriority(10);
	th1.start();
	th2.start();
	
	for(int i=0; i<10;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	
}

}
