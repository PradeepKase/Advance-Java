package eval2;

public class B {
public static void main(String[] args) throws Exception {
	A a1= new A();
	a1.start();
	synchronized(a1) {
		a1.wait();
		System.out.println(a1.total); //exception is not handled
	}

}
}
