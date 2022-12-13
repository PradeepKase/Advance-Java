package sprint2day2;

public class Main2 {

	public static void main(String[] args) {
		


		// TODO Auto-generated method stub
//		ThreadA a1 = new ThreadA();
//		ThreadB b1 = new ThreadB();
//		ThreadC c1 = new ThreadC();
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		

//		t1.start();
//		t2.start();
		t3.start();
		for(int i=15; i<20; i++) {
			System.out.println("inside main Thread");
		}
		
	}

}
