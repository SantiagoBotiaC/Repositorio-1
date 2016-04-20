
public class Jupiter extends Alien{
	
	public Jupiter() {
		super("Gris", 3	, 4, 6, "Herbívoro");
	}

	@Override
	public String toString() {
		return "Jupiteriano\nColor: " + color + "\nNúmero de Ojos: " + numOjos + "\nNúmero de vidas: " + numVidas + 
				"\nNúmero de extremidades: " + numExtremidades + "\nTipo de alimentación: " + alimentacion;
	}
	
	

}
