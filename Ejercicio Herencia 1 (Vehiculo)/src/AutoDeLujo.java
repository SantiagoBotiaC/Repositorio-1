
public class AutoDeLujo extends Auto{

	public AutoDeLujo(int numSerieMotor, String marca, int año, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, año, precio, cantPasajeros);
	}

	@Override
	public String toString() {
		return "Auto de lujo:\nCantidad de Pasajeros: " + cantPasajeros + "\nNúmero de serie del motor: " + numSerieMotor + "\nMarca: " + marca
				+ "\nAño: " + año + "\nPrecio: " + precio + "\n";
	}
	
	

	
}
