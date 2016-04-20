
public abstract class Vehiculo {
	
	protected int numSerieMotor;
	protected String marca;
	protected int año;
	protected double precio;
	
	
	public Vehiculo(int numSerieMotor, String marca, int año, double precio) {
		this.numSerieMotor = numSerieMotor;
		this.marca = marca;
		this.año = año;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Vehiculo [numSerieMotor:" + numSerieMotor + "\nmarca:" + marca + "\naño:" + año + "\nprecio:" + precio
				+ "]";
	}
	
	
	
}
