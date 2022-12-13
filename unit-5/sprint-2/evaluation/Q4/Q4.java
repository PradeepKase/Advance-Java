package eval2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA a1= new ThreadA();
		ThreadB b1= new ThreadB();
		ThreadC c1= new ThreadC();
		
		a1.setName("Dhoni");
		b1.setName("Kholi");
		c1.setName("Rohit");
		
		
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c1.start();
		try {
			b1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b1.start();
	}

}
