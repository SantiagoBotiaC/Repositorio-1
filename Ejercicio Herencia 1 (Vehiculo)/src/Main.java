import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto autoLujo = new AutoDeLujo(1234, "Ferrari", 2016, 850000.40, 5);
		Auto autoCompacto = new AutoCompacto(9876, "Renault", 2014, 30000.50, 5);
		Vehiculo camioneta = new Camioneta(5678, "Ford,",	2013, 40000.60, 1500.70, 2,2);
		Vehiculo vagoneta = new Vagoneta (9376, "Toyota", 2014, 45000.40, 6);
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(autoLujo);
		vehiculos.add(autoCompacto);
		vehiculos.add(camioneta);
		vehiculos.add(vagoneta);
		
		
		for(Vehiculo i : vehiculos)
		{
			System.out.println(i.toString());
		}
		
	}

}
