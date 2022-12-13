package sprint2day3;

public class Main2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Threada a1=new Threada();
		Threadb b1=new Threadb();
//		Thread t1=new Thread(a1);
//		Thread t2=new Thread(b1);
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b1.start();
		
	}

}
