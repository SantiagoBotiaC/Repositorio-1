
public class Cheques extends Cuenta{
	
	protected double comisionPorChequera;
	protected double comisionPorSaldoInsuficiente;
	
	public Cheques(int numeroDeCuenta, String nombreCliente, double saldo, double comisionPorChequera, double comisionPorSaldoInsuficiente) {
		super(numeroDeCuenta, nombreCliente, saldo);
		this.comisionPorChequera = comisionPorChequera;
		this.comisionPorSaldoInsuficiente = comisionPorSaldoInsuficiente;
		// TODO Auto-generated constructor stub
	}

	public void retirar(int cheque)
	{
		if (this.saldo < cheque)
		{
			System.out.println("No hay saldo suficiente en la cuenta"
					+ "\n por lo tanto se cobrará una comisión de " + comisionPorSaldoInsuficiente + " pesos");
			this.saldo -= comisionPorSaldoInsuficiente;
		}
		
		else
		{
			this.saldo -= cheque;
		}
	}
}
