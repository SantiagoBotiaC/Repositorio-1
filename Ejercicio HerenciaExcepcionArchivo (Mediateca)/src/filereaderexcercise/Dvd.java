/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderexcercise;

import java.util.Arrays;

public class Dvd extends Soporte{
    private int duracion;
    private Autor [] actores;
    
    public Dvd(String titulo, int duracion, Autor autor, Autor[] actores){
        super(titulo);
        super.setAutor(autor);
        this.duracion = duracion;
        this.actores = actores;
        
    }

    public int getDuracion() {
        return duracion;
    }

    public Autor[] getActores() {
        return actores;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setActores(Autor[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Dvd{"+ super.toString() + "duracion=" + duracion + ", actores=" + Arrays.deepToString(actores) + '}';
    }   
}
