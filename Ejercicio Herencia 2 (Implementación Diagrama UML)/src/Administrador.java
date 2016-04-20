
public class Administrador extends Empleado{
	
	private String puesto;
	
	public void  administrar()
	{
		System.out.println("Administra");
	}

	public Administrador(String nombre, String domicilio, String horario, String jefe, String puesto) {
		super(nombre, domicilio, horario, jefe);
		this.puesto = puesto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrador [puesto=" + puesto + ", jefe=" + jefe + ", nombre=" + nombre + ", domicilio=" + domicilio
				+ ", horario=" + horario + "]";
	}

	
	

}
