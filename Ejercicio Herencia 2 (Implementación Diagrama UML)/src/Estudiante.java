
public class Estudiante extends Persona{
	
	private int grado;
	private char grupo;
	
	public void estudiar()
	{
		System.out.println("Estudia");
	}

	public Estudiante(String nombre, String domicilio, String horario, int grado, char grupo) {
		super(nombre, domicilio, horario);
		this.grado = grado;
		this.grupo = grupo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Estudiante [grado=" + grado + ", grupo=" + grupo + ", nombre=" + nombre + ", domicilio=" + domicilio
				+ ", horario=" + horario + "]";
	}
	
	


}
