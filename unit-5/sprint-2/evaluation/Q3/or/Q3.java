package eval2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Prntnum p1= new Prntnum(6);

//		p.start();
		Prntnum[] p1= {
				new Prntnum(2),
				new Prntnum(3),
				new Prntnum(4),
				new Prntnum(5),
				new Prntnum(6),
				new Prntnum(7),
		};
//		Thread p=new Thread(p1);
		ExecutorService service =Executors.newFixedThreadPool(3);
		for(Prntnum p:p1) {
			service.submit(p);
		}
		service.shutdown();
		
	}

}
