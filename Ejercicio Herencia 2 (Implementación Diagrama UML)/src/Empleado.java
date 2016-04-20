
public abstract class Empleado extends Persona{
	protected String jefe;
	
	public void cobrar()
	{
		System.out.println("Cobró");
	}

	public Empleado(String nombre, String domicilio, String horario, String jefe) {
		super(nombre, domicilio, horario);
		this.jefe = jefe;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Empleado [jefe=" + jefe + ", nombre=" + nombre + ", domicilio=" + domicilio + ", horario=" + horario
				+ "]";
	}

	
	
}
