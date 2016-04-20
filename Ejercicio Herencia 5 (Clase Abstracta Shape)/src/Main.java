import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("En el siguiente prgrama podrá crear rectángulos y triángulos "
				+ "ingresando su alto y su ancho. \nPosteriormente se le indicará el área y el perímetro de cada uno:\n");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		ArrayList<Rectangle> rectangulos = new ArrayList<Rectangle>();
		ArrayList<Triangle> triangulos = new ArrayList<Triangle>();
		
		boolean salir = false;
		while(salir == false)
		{
			System.out.println("\nPresione 1 para crear un rectángulo o 2 para crear un triángulo y 3 para salir\n");
			int opcion = scan.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Ingrese la altura del rectángulo:\n");
				double height = scan.nextDouble();
				System.out.println("Ingrese el ancho del rectángulo:\n");
				double width = scan.nextDouble();
				Shape rectangulo = new Rectangle(width, height);
				rectangulos.add((Rectangle)rectangulo);
				for(int i = 0; i < rectangulos.size(); i++)
				{
					System.out.println("El área del rectángulo " + (i+1) + " es: " + rectangulos.get(i).getArea());
					System.out.println("El perimetro del rectángulo " + (i+1) + " es: " + rectangulos.get(i).getPerimeter() + "\n");
				}
				break;
			case 2:
				System.out.println("Ingrese la altura del triángulo:\n");
				double height1 = scan.nextDouble();
				System.out.println("Ingrese el ancho del Triangulo:\n");
				double width1 = scan.nextDouble();
				Shape triangulo = new Triangle(width1, height1);
				triangulos.add((Triangle)triangulo);
				for(int i = 0; i < triangulos.size(); i++)
				{
					System.out.println("El área del triangulo " + (i+1) + " es: " + triangulos.get(i).getArea());
					System.out.println("El perimetro del triangulo " + (i+1) + " es: " + triangulos.get(i).getPerimeter()+ "\n");
				}
				break;
			case 3:
				System.out.println("El programa ha finalizado");
				salir = true;
				break;
			}
		}
		
		scan.close();
	}

}
