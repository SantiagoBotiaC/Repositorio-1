
public abstract class Auto extends Vehiculo{
	
	protected int cantPasajeros;

	public Auto(int numSerieMotor, String marca, int a�o, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, a�o, precio);
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public String toString() {
		return "Auto [cantPasajeros=" + cantPasajeros + ", numSerieMotor=" + numSerieMotor + ", marca=" + marca
				+ ", a�o=" + a�o + ", precio=" + precio + "]";
	}
	
	
}
