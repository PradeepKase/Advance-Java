package sprint2day2;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhonikholi dk= new Dhonikholi();
		Thread t1= new Thread(dk);
		Thread t2= new Thread(dk);
		t1.setName("dhoni");
		t2.setName("kholi");
		t1.start();
		t2.start();
	}

}
