package eval2;

public class Prntnum implements Runnable{
	int num;
	Prntnum(int num){
		this.num=num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int pro=1;
		for(int i=1; i<=num; i++) {
			pro=pro*i;
		}
		System.out.println(pro);
	}

}
