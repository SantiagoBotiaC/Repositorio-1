
public class AutoCompacto extends Auto{

	public AutoCompacto(int numSerieMotor, String marca, int a�o, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, a�o, precio, cantPasajeros);
	}

	@Override
	public String toString() {
		return "Auto Compacto:\nCantidad de Pasajeros: " + cantPasajeros + "\nN�mero de serie del motor: " + numSerieMotor + "\nMarca: " + marca
				+ "\nA�o: " + a�o + "\nPrecio: " + precio + "\n";
	}
	
	
	
	
}
