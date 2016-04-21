import java.util.Arrays;

public class Vegetariana implements PrepPizza{
	private String masa;
	private String salsa;
	private String[] ingredientes;
	
	public Vegetariana() {
		super();
		this.masa = "Regular";
		this.salsa = "Tomate";
		this.ingredientes = new String[6];
		this.ingredientes[0] = "Mozzarella";
		this.ingredientes[1] = "Parmesano rallado";
		this.ingredientes[2] = "Cebolla picada";
		this.ingredientes[3] = "Hongos en rebanadas";
		this.ingredientes[4] = "Pimientaroja en rodajas";
		this.ingredientes[5] = "Aceitunas negras rebanadas";		
	}
	
	public void preparar(){
		System.out.println("Ingredientes:");
		System.out.println(this.toString());
		this.ornear();
		this.cortar();
		this.empacar();		
	}
	
	public void ornear(){
		System.out.println("Tiempo de ornear: 15 min \nTemperatura: 300ºF");
	}
	
	public void cortar(){
		System.out.println("Tipo de corte: Tajada circular");
	}
	
	public void empacar(){
		System.out.println("Tipo de empaque: bolsa de aluminio con recubrimiento plastico \nAdicional un pack de servilletas");
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
		return "Vegetariana [masa=" + masa + ", salsa=" + salsa + ", ingredientes=" + Arrays.toString(ingredientes)
				+ "]";
	}
}
