
package filereaderexcercise;


public class Libro extends Soporte{
    private String isbn;
    private int numeroPaginas;
    
    public Libro(String isbn, String titulo) {
        super(titulo);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getNumPaginas() {
        return numeroPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numeroPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() +"isbn=" + isbn + "numero paginas=" + numeroPaginas + '}';
    }
    
    
    
}
