
public class Marte extends Alien{

	public Marte() {
		super("Verde", 2, 3, 4, "Carnívoro");
	}

	@Override
	public String toString() {
		return "Marciano\nColor: " + color + "\nNúmero de Ojos: " + numOjos + "\nNúmero de vidas: " + numVidas + 
				"\nNúmero de extremidades: " + numExtremidades + "\nTipo de alimentación: " + alimentacion;
	}
	
	
	
}
