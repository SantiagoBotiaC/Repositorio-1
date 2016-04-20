
public abstract class Auto extends Vehiculo{
	
	protected int cantPasajeros;

	public Auto(int numSerieMotor, String marca, int año, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, año, precio);
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public String toString() {
		return "Auto [cantPasajeros=" + cantPasajeros + ", numSerieMotor=" + numSerieMotor + ", marca=" + marca
				+ ", año=" + año + ", precio=" + precio + "]";
	}
	
	
}
