
public class AutoDeLujo extends Auto{

	public AutoDeLujo(int numSerieMotor, String marca, int a�o, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, a�o, precio, cantPasajeros);
	}

	@Override
	public String toString() {
		return "Auto de lujo:\nCantidad de Pasajeros: " + cantPasajeros + "\nN�mero de serie del motor: " + numSerieMotor + "\nMarca: " + marca
				+ "\nA�o: " + a�o + "\nPrecio: " + precio + "\n";
	}
	
	

	
}
