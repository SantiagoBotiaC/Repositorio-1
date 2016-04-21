import java.util.Arrays;

public class Queso implements PrepPizza{
	private String masa;
	private String salsa;
	private String[] ingredientes;
	
	public Queso() {
		super();
		this.masa = "Corteza regular";
		this.salsa = "Tomate";
		this.ingredientes = new String[2];
		this.ingredientes[0] = "Queso Mozzarella fresco";
		this.ingredientes[1] = "Parmesano";
	}
	
	public void preparar(){
		System.out.println("Ingredientes:");
		System.out.println(this.toString());
		this.ornear();
		this.cortar();
		this.empacar();	
	}
	
	public void ornear(){
		System.out.println("Tiempo de ornear: 20 min\nTemperatura: 250ºF");
	}
	
	public void cortar(){
		System.out.println("Tipo de corte: tajada cuadrada");
	}
	
	public void empacar(){
		System.out.println("Tipo de empaque: caja de carton con bolsa de aluminio\nAdicional un pack de serviletas");
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
		return "Queso [masa=" + masa + ", salsa=" + salsa + ", ingredientes=" + Arrays.toString(ingredientes) + "]";
	}
	
	

}
