import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona administrador = new Administrador("Carlos", "Calle 98-65", "9am - 5pm", "Alejandro", "Tesorero");
		Persona profesor = new Profesor("Pedro", "Carrera74-94", "7am - 4pm", "Felipe", "Ingenieria");
		Persona estudiante = new Estudiante("Daniel", "Calle 56-37", "7am - 3pm", 10, 'A');
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(administrador);
		personas.add(profesor);
		personas.add(estudiante);
		
		
		for (Persona persona : personas)
		{
			persona.asistir();
			System.out.println(persona.toString());
			if(persona.getClass().getSuperclass() == Empleado.class)
			{
				((Empleado)persona).cobrar();
				if (persona.getClass() == Administrador.class)
				{
					((Administrador)persona).administrar();
				}
				else
				{
					((Profesor)persona).enseñar();
				}
			}
			if(persona.getClass() == Estudiante.class)
			{
				((Estudiante)persona).estudiar();
			}
		}
		
		

	}

}
