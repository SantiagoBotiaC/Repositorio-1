
public class Camioneta extends Vehiculo{
	
	private double capacCarga;
	private int cantEjes;
	private int cantRodadas;
	
	public Camioneta(int numSerieMotor, String marca, int año, double precio, double capacCarga, int cantEjes, int cantRodadas) 
	{
		super(numSerieMotor, marca, año, precio);
		this.capacCarga = capacCarga;
		this.cantEjes = cantEjes;
		this.cantRodadas = cantRodadas;
	}

	@Override
	public String toString() {
		return "Camioneta:\nCapacidad de Carga: " + capacCarga + "\nCantidad de ejes: " + cantEjes + "\nCantidad de Rodadas: " + cantRodadas
				+ "\nNúmero de serie del motor: " + numSerieMotor + "\nMarca: " + marca + "\nAño: " + año + "\nPrecio: " + precio + "\n";
	}
	
	

}
