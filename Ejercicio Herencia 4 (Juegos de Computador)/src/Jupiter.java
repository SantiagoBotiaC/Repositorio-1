
public class Jupiter extends Alien{
	
	public Jupiter() {
		super("Gris", 3	, 4, 6, "Herb�voro");
	}

	@Override
	public String toString() {
		return "Jupiteriano\nColor: " + color + "\nN�mero de Ojos: " + numOjos + "\nN�mero de vidas: " + numVidas + 
				"\nN�mero de extremidades: " + numExtremidades + "\nTipo de alimentaci�n: " + alimentacion;
	}
	
	

}
