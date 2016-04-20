
public class Alien {
	
	protected String color;
	protected int numOjos;
	protected int numVidas;
	protected int numExtremidades;
	protected String alimentacion;
	
	public Alien(String color, int numOjos, int numVidas, int numExtremidades, String alimentacion) {
		this.color = color;
		this.numOjos = numOjos;
		this.numVidas = numVidas;
		this.numExtremidades = numExtremidades;
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Alien\nColor: " + color + "\nNúmero de Ojos: " + numOjos + "\nNúmero de vidas: " + numVidas + 
				"\nNúmero de extremidades: " + numExtremidades + "\nTipo de alimentación: " + alimentacion;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNumOjos(int numOjos) {
		this.numOjos = numOjos;
	}

	public void setNumVidas(int numVidas) {
		this.numVidas = numVidas;
	}

	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	
	
}
