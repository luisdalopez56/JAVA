package PoolHilos;

public class ClaseCallable implements java.util.concurrent.Callable<String> {

	int valor;
	
	public ClaseCallable(int valor) {
		super();
		this.valor = valor;
	}

	public String call() throws Exception {
		String menor = null;
		if(valor < 10) {
			menor = "El valor " + valor + "menor que 10";
		}else {
			menor = "El valor " + valor + "es mayor que 10";
		}
		return menor;
	}

	
	
}
