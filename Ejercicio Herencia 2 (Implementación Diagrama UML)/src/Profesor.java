
public class Profesor extends Empleado{
	
	private String carrera;
	
	public void ense�ar()
	{
		System.out.println("Ense�a");
	}

	public Profesor(String nombre, String domicilio, String horario, String jefe, String carrera) {
		super(nombre, domicilio, horario, jefe);
		this.carrera = carrera;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Profesor [carrera=" + carrera + ", jefe=" + jefe + ", nombre=" + nombre + ", domicilio=" + domicilio
				+ ", horario=" + horario + "]";
	}


	

}
