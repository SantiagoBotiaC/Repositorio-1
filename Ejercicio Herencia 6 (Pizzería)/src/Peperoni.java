import java.util.Arrays;

public class Peperoni implements PrepPizza{
	private String masa;
	private String salsa;
	private String[] ingredientes;
	
	public Peperoni() {
		super();
		this.masa = "Regular";
		this.salsa = "Tomate";
		this.ingredientes = new String[3];
		this.ingredientes[0] = "Rodajas de pepperoni";
		this.ingredientes[1] = "Rodajas de cebolla";
		this.ingredientes[2] = "Queso parmesano rallado";
	}

	public void preparar(){
		System.out.println("Ingredientes:");
		System.out.println(this.toString());
		this.ornear();
		this.cortar();
		this.empacar();	
	}
	
	public void ornear(){
		System.out.println("Tiempo de ornear: 30 min \nTemperatura: 360ºF");
	}
	
	public void cortar(){
		System.out.println("Tipo de corte: tajada rectangular");
	}
	
	public void empacar(){
		System.out.println("Tipo de empaque: Caja de carton rectangular\nAdicional un pack de servilletas");
	}

	public String getMasa() {
		return masa;
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Peperoni [masa=" + masa + ", salsa=" + salsa + ", ingredientes=" + Arrays.toString(ingredientes) + "]";
	}
	
	

}
