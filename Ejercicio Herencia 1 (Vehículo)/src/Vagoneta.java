
public class Vagoneta extends Vehiculo{
	
	private int cantPasajeros;

	public Vagoneta(int numSerieMotor, String marca, int a�o, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, a�o, precio);
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public String toString() {
		return "Vagoneta:\nCantidad de Pasajeros: " + cantPasajeros + "\nN�mero de serie del Motor: " + numSerieMotor + "\nMarca:" + marca
				+ "\nA�o: " + a�o + "\nPrecio: " + precio + "\n";
	}
	

}
