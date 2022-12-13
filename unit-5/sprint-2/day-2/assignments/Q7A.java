package sprint2day2;

public class Q7A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getPriority());
		}
	}

}
