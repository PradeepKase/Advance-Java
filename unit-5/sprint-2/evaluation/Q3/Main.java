package Question_3;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService ES= Executors.newFixedThreadPool(2);
        List<Integer> L= Arrays.asList(10,5,6,8,9,7);

        for(int i:L) {
            Future<Long>x=ES.submit(new Mycall(i));
            try {
                System.out.println( x.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        ES.shutdown();
    }
}
