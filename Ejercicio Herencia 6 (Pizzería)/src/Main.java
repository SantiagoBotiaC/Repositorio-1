import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		PrepPizza veg = new Vegetariana();
		PrepPizza pep = new Peperoni();
		PrepPizza qso = new Queso();
		char isGoing = 'y';
		int pizzaChoice = 0;
		while(isGoing == 'y'){
			System.out.println("Estas son las opciones de pizza para preparar. Por favor seleccione un tipo:");
			System.out.println("1. " + veg.toString());
			System.out.println("2. " + pep.toString());
			System.out.println("3. " + qso.toString());
			pizzaChoice= read.nextInt();
			switch(pizzaChoice){
			case 1:
				System.out.println("Su opcion ha sido verificada y validada por el sistema. A continuacion se presenta el proceso de preparacion del alimento");
				veg.preparar();
				break;
			case 2:
				System.out.println("Su opcion ha sido verificada y validada por el sistema. A continuacion se presenta el proceso de preparacion del alimento");
				pep.preparar();
				break;
			case 3:
				System.out.println("Su opcion ha sido verificada y validada por el sistema. A continuacion se presenta el proceso de preparacion del alimento");
				qso.preparar();
				break;
			default:
				System.out.println("Opcion invalidada. intente de nuevo si quiere pedir una orden de comida");					
			}
			System.out.println("Desea realizar un nuevo pedido? (y/n)");
			isGoing = read.next().charAt(0);
		}
		read.close();		
	}

}
