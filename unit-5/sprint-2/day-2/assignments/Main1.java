package sprint2day2;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1= new X();
		x1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("inside main thread"+ i);
		}
	}

}
