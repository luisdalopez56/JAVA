package Hilos;

public class Hilos {
	
	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria(123453, 10000, "Jesus");
		
		for (int i = 0; i < 10; i++) {
			Runnable hilo = new Proceso(c1);
			hilo.run();;
			try {
				Thread.sleep(2_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

