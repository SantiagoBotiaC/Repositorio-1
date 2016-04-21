/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderexcercise;

import java.util.Arrays;

public class Cd extends Soporte {
    private int duracion;
    private Autor [] musicos;
    private String genero;
    
    public Cd(String titulo, int duracion, Autor autor, Autor[] musicos, String genero){
        super(titulo);
        super.setAutor(autor);
        this.duracion = duracion;
        this.musicos = musicos;
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void getMusicos() {
    	for (Autor a : musicos){
    		System.out.println(a.toString());
    		System.out.println(a.toString());
    	}
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setMusicos(Autor[] musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "Cd{"+ super.toString() + "duracion=" + duracion + ", musicos=" + Arrays.deepToString(musicos) + ", genero=" + genero + '}';
    }  
    
    
    
}
