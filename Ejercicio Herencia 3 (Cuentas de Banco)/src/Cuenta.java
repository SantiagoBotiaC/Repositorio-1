
public class Cuenta {
	protected int numeroDeCuenta;
	protected String nombreCliente;
	protected double saldo;
	
	
	
	public Cuenta(int numeroDeCuenta, String nombreCliente, double saldo) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
	}
	
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(int dinero)
	{
		this.saldo -= dinero;
		System.out.println("Depósito exitoso");
	}
	
	public void retirar(int dinero)
	{
		if (this.saldo < dinero)
		{
			System.out.println("No hay saldo sufuciente en la cuenta:");
		}
		else
		{
			this.saldo += dinero;
			System.out.println("Retiro exisoso");
		}
	}
		
}
