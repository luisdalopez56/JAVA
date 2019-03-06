package PoolHilos;

public class Pool implements Runnable{

	static private int count = 0;
	private int taskNumber;
	
	Pool(){
		count ++;
		taskNumber = count;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i+=5) {
			System.out.println("Tarea numero: " + taskNumber + ", tanto por ciento completado = " + i +"%");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
