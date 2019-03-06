package Hilos;

public class CuentaBancaria {
	
	int CodigoTarjeta;
	int Saldo;
	String nombrePropietario;
	
	public CuentaBancaria(int codigoTarjeta, int saldo, String nombrePropietario) {
		super();
		CodigoTarjeta = codigoTarjeta;
		Saldo = saldo;
		this.nombrePropietario = nombrePropietario;
	}

	public int getCodigoTarjeta() {
		return CodigoTarjeta;
	}

	public void setCodigoTarjeta(int codigoTarjeta) {
		CodigoTarjeta = codigoTarjeta;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	
	

}
