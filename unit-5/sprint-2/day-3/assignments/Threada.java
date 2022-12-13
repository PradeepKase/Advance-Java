package sprint2day3;

public class Threada extends Thread {
	int sum;
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 10; i++) {
//			System.out.println("inside A thread");
//			sum = sum + i;
//			}
		for (int i = 1; i < 20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		
		}
	}

}
