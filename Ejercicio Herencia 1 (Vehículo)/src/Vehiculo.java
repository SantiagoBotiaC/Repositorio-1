
public abstract class Vehiculo {
	
	protected int numSerieMotor;
	protected String marca;
	protected int a�o;
	protected double precio;
	
	
	public Vehiculo(int numSerieMotor, String marca, int a�o, double precio) {
		this.numSerieMotor = numSerieMotor;
		this.marca = marca;
		this.a�o = a�o;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Vehiculo [numSerieMotor:" + numSerieMotor + "\nmarca:" + marca + "\na�o:" + a�o + "\nprecio:" + precio
				+ "]";
	}
	
	
	
}
