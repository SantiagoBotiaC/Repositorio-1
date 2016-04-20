public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		boolean salir = false;
		
		System.out.println("En el siguiente programa podrá crear aliens con las características que desee"
				+ "\ny además podrá crear marcianos y jupiterianos, sin embargo estos ya tiene características predeterminadas:\n");
		
		int numAlien = 0;
		
		while (salir == false)
		{
			System.out.println("\nSi desea continuar presione 1, si deasea salir presione 2");
			int opcion = scan.nextInt();
			if (opcion ==1)
			{
				System.out.println("Menú de opciones:\n1.Crear Alien\n2.Crear Marciano\n3.Crear Jupiteriano"
						+ "\nPresione el numero de la opcion que desea realizar\n");
				int opcion2 = scan.nextInt();
				if (opcion2 == 1)
				{	
					if (numAlien < 1){
					System.out.println("Ingrese los datos para el alien:\n");
					System.out.println("Color: ");
					String color = scan.next();
					System.out.println("Numero de ojos: ");
					int numOjos = scan.nextInt();
					System.out.println("Numero de vidas: ");
					int numeroVidas = scan.nextInt();
					System.out.println("Numero de Extremidades: ");
					int numExtremidades = scan.nextInt();
					System.out.println("Tipo de alimentacion: ");
					String tipoDeAlimentacion = scan.next();
					Alien alien = new Alien(color,numOjos,numeroVidas,numExtremidades,tipoDeAlimentacion);
					System.out.println("El alien que ha creado tiene las siguientes características:\n");
					System.out.println(alien.toString());
					numAlien++;
					}
					else
					{
						System.out.println("Ya ha creado un alien, por favor seleccione otra opcion:\n");
					}
				}
				else if (opcion2 == 2)
				{
					Marte marciano = new Marte();
					System.out.println("El marciano que ha creado tiene las siguientes características:\n" + marciano.toString());
				}
				else if (opcion2 == 3)
				{
					Jupiter jupiteriano = new Jupiter();
					System.out.println("El Jupiteriano que ha creado tiene las siguientes características:\n" + jupiteriano.toString());
				}
			}
			else
			{
				salir = true;
			}
		}
		
		System.out.println("El programa ha finalizado");
		scan.close();
	}

}
