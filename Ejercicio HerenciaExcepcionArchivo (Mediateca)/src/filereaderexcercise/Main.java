
package filereaderexcercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class Main {
    
    static ArrayList<Soporte> soportes = new ArrayList<>();
    
    public static void main(String[] args) {
       	java.util.Scanner sc = new java.util.Scanner(System.in);
       	
        //Cargar data
        cargarDatos();
        
        
        boolean indicador = false;
        int contador = 0;
        
        while(indicador == false){
 
            System.out.println("\nBienvenido a la mediateca");
            System.out.println("Opciones: \n1. Buscar soporte por titulo \n2. Buscar soporte por autor \n3. Alquilar soporte"
            		+ "\nPresione el número de la opcion que desea realizar\n");
            
            String opcion = sc.next();
            
            switch(opcion)
            {
            case "1":
	                System.out.println("Ingrese el titulo");
	                String titulo = null;
	                titulo = sc.next();
	                Soporte soporte = buscarSoporte(titulo);
	                if(soporte !=null)
	                    System.out.println(soporte.toString());
	                else{
	                    System.out.println("No existe");
	                }
	                break;
              
             case "2":
            	 
	            	System.out.println("Ingrese el nombre del autor");
	            	String nombre = sc.next();
	            	System.out.println("Ingrese el apellido del autor");
	              	String apellido = sc.next();
	            	Autor autor = new Autor(nombre,apellido);
	            	Soporte soporte1 = buscarSoporte(autor);
	            	if(soporte1 !=null)
	                    System.out.println(soporte1.toString());
	                else{
	                    System.out.println("No existe");
	                }
	                
	            	break;
              
              case "3":
            	  
	            	if (contador >= 3)
	            	{
	            		System.out.println("No puede solicitar más préstamos");
	            	}
	            	else
	            	{
		            	System.out.println("Ingrese el Titulo del ejemplar que desea alquilar:");
		                String titulo1 = sc.next();
		                Soporte soporte2 = buscarSoporte(titulo1);
		                if(soporte2 !=null){
		                    System.out.println(soporte2.toString());
		                    System.out.println("¿Desea alquilar el ejemplar?");
		                    System.out.println("1. Sí\n2. No");
		                    int opcionSeleccionada = Integer.parseInt(sc.next());
		                    if (opcionSeleccionada == 1){
		                    	System.out.println("El ejemplar ha sido alquilado exitosamente");
		                    	contador++;
		                    }
		                }
		                else{
		                    System.out.println("No existe");
		                }
	            	}
	            	break;
            
            default:
	                System.out.println("Opcion invalida");
	                break;
	                }
                
            
            System.out.println("Desea continuar...1. Si 2. No");
            int opcion1 = sc.nextInt();
            if(opcion1 != 1){
               indicador = true;
            	System.out.println("El programa ha finalizado");
            }
        }
        
        
    }
    
    
    public static void cargarDatos(){
        String fileName = "DataFile.txt";
        
        // We will be using a try-with-resource block
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            // Access the data from the file
            // Read line-by-line
            String line = reader.readLine();
            // While there comes a new line, execute this
            while(line != null) {
                // Add these lines to the String builder
                String[] properties = line.split(",");
                try {
                	switch (properties[0]){
                    case "Libro":
                        Soporte libro = cargarLibro(properties);
                        soportes.add(libro);
                        break;
                    case "DVD":
                        Soporte dvd = cargarDvd(properties);
                        soportes.add(dvd);
                        break;
                    case "CD":
                        Soporte cd = cargarCd(properties);
                        soportes.add(cd);
                        break;
                    default:
                    break;
                	}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
                
                // Read the next line
                line = reader.readLine();
            }
        } catch (Exception er) {
            // Since there was an error, you probably want to notify the user
            // For that error. So return the error.
        	System.out.println(er.getMessage());
        }
        
    }
    
    public static Autor cargarAutor(String[] properties) {
	Autor autor = null;
	String nombre = properties[2].trim();
        String apellido = properties[3].trim();
        autor = new Autor(nombre, apellido);
        return autor;
    }
    
        
    public static Libro cargarLibro(String[] properties) throws LibroException{
	Libro libro = null;
	String titulo = properties[1].trim();
	int numeroPaginas = Integer.parseInt(properties[4].trim());
	
        if(titulo.length()> 100 || numeroPaginas < 10){
           throw new LibroException("\nEl Titulo no puede tener mas de 100 caracteres, por lo tanto"
           		+ "\nel libro con titulo " + titulo + " no ha sido cargado");
        }
        else if (numeroPaginas < 10)
        {
        	throw new LibroException("\nEl libro no puede tener menos de 10 páginas, por lo tanto"
        			+ "\nel libro con titulo" + titulo + "que tiene " + numeroPaginas + "paginas no ha sido cargado" );
        }
        Autor autor = cargarAutor(properties);
        String isbn = properties[5].trim();	
        libro = new Libro(isbn, titulo);
        libro.setNumPaginas(numeroPaginas);
        libro.setAutor(autor);
         
        return libro;
    }
    
    private static Soporte cargarDvd(String[] properties) throws DVDException{
    	Autor autor = cargarAutor(properties);
        Autor[] actores = new Autor[2]; 
        int duracion = Integer.parseInt(properties[8].trim());
        String titulo = properties[1].trim();
        if(autor == null|| actores.length > 5){
        	throw new DVDException("\nUn DVD debe tener al menos un autor y máximo 5, por lo tanto"
        			+ "\nel DVD con el titulo " + titulo + " no ha sido cargado");
        }
        else if (duracion < 20)
        {
        	throw new DVDException("\nLa duración de un dvd no pude ser menos de 20 minutos, por lo tanto"
        			+ "\nel DVD con el titulo " + titulo + " no ha sido cargado");
        }
        actores[0] = new Autor(properties[4].trim(), properties[5].trim());
        actores[1] = new Autor(properties[6].trim(), properties[7].trim());
        Dvd dvd = new Dvd(titulo, duracion, autor, actores);
        return dvd;
    }
    
    private static Soporte cargarCd(String[] properties) throws CdException{
        int duracion = Integer.parseInt(properties[9].trim());
    	String titulo = properties[1].trim();
        if (duracion < 10 || duracion > 200){
        	throw new CdException("\nEl Cd debe durar entre 10 y 20 minutos, por lo tanto el CD"
        			+ "\ncon el titulo " + titulo + " no ha sido cargado");
        }
        Autor autor = cargarAutor(properties);
        Autor[] musicos = new Autor[2]; 
        musicos[0] = new Autor(properties[4].trim(), properties[5].trim());
        musicos[1] = new Autor(properties[6].trim(), properties[7].trim());
        String genero = properties[8].trim();
        Cd cd = new Cd(titulo, duracion, autor, musicos, genero);
        return cd;
   } 
    
    private static Soporte buscarSoporte(String titulo){
        for (Soporte soporte : soportes) {
            if (soporte.getTitulo().equalsIgnoreCase(titulo)){
                return soporte;
            }
        }
        return null;
    }
    
    private static Soporte buscarSoporte(Autor autor){
        for (Soporte soporte : soportes) {
        	Autor tempAutor = soporte.getAutor();
            if (tempAutor.getNombre().equalsIgnoreCase(autor.getNombre()) && tempAutor.getApellido().equalsIgnoreCase(autor.getApellido())){
                return soporte;
            }
        }
        return null;
    }
    
}
