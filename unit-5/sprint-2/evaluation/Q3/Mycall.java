package Question_3;

import java.util.concurrent.Callable;

public class Mycall implements Callable<Long> {
    long num;



    public Mycall(long num) {

        this.num = num;
    }



    @Override
    public Long call() throws Exception {
        synchronized (this) {
            long x=1;
            for(int i=1;i<=num; i++) {
                x*=i;
            }
            System.out.println("Inside -"+ Thread.currentThread().getName());
            return x;
        }
    }





}
