
public class AutoCompacto extends Auto{

	public AutoCompacto(int numSerieMotor, String marca, int año, double precio, int cantPasajeros) {
		super(numSerieMotor, marca, año, precio, cantPasajeros);
	}

	@Override
	public String toString() {
		return "Auto Compacto:\nCantidad de Pasajeros: " + cantPasajeros + "\nNúmero de serie del motor: " + numSerieMotor + "\nMarca: " + marca
				+ "\nAño: " + año + "\nPrecio: " + precio + "\n";
	}
	
	
	
	
}
