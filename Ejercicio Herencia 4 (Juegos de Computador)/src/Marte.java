
public class Marte extends Alien{

	public Marte() {
		super("Verde", 2, 3, 4, "Carn�voro");
	}

	@Override
	public String toString() {
		return "Marciano\nColor: " + color + "\nN�mero de Ojos: " + numOjos + "\nN�mero de vidas: " + numVidas + 
				"\nN�mero de extremidades: " + numExtremidades + "\nTipo de alimentaci�n: " + alimentacion;
	}
	
	
	
}
