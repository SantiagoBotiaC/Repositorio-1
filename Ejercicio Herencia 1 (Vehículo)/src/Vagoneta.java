
public class Vagoneta extends Vehiculo{
	
	private int cantPasajeros;

	public Vagoneta(int numSerieMotor, String marca, int año, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, año, precio);
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public String toString() {
		return "Vagoneta:\nCantidad de Pasajeros: " + cantPasajeros + "\nNúmero de serie del Motor: " + numSerieMotor + "\nMarca:" + marca
				+ "\nAño: " + año + "\nPrecio: " + precio + "\n";
	}
	

}
