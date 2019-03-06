package PoolHilos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestPool {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);

		executor.execute(new Pool());
		executor.execute(new Pool());		
		executor.execute(new Pool());
		Future<String> future = executor.submit(new ClaseCallable(6));

		
		while (!future.isDone()) {
			   
			}
			try {
				String resultado = future.get(1, TimeUnit.SECONDS);
				System.out.println(resultado);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	
	}
	
}
