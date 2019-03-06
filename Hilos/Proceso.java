package Hilos;

public class Proceso implements Runnable {
	
	CuentaBancaria cuenta;
	
	public Proceso(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public void run() {
		
		int saldoAntes = cuenta.getSaldo();
		System.out.println("Saldo actual: " + saldoAntes);
		int saldoRetirar = (int) (Math.random() * 100);
		
		System.out.println("Saldo retirado:" + saldoRetirar);
		int saldoActual = (int) (saldoAntes - saldoRetirar );
		cuenta.setSaldo(saldoActual);
		System.out.println("Saldo despues de proceso: " + cuenta.getSaldo());
		
	}
	
	
}
