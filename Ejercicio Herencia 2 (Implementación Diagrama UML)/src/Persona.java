
public abstract class Persona {
	protected String nombre;
	protected String domicilio;
	protected String horario;
	
	public void asistir()
	{
		System.out.println("Asistió");
	}

	public Persona(String nombre, String domicilio, String horario) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", domicilio=" + domicilio + ", horario=" + horario + "]";
	}
	
	
	
	
}