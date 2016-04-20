
public class Camioneta extends Vehiculo{
	
	private double capacCarga;
	private int cantEjes;
	private int cantRodadas;
	
	public Camioneta(int numSerieMotor, String marca, int a�o, double precio, double capacCarga, int cantEjes, int cantRodadas) 
	{
		super(numSerieMotor, marca, a�o, precio);
		this.capacCarga = capacCarga;
		this.cantEjes = cantEjes;
		this.cantRodadas = cantRodadas;
	}

	@Override
	public String toString() {
		return "Camioneta:\nCapacidad de Carga: " + capacCarga + "\nCantidad de ejes: " + cantEjes + "\nCantidad de Rodadas: " + cantRodadas
				+ "\nN�mero de serie del motor: " + numSerieMotor + "\nMarca: " + marca + "\nA�o: " + a�o + "\nPrecio: " + precio + "\n";
	}
	
	

}
