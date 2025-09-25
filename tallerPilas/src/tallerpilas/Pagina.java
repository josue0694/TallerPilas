package tallerpilas;
/**
 *
 * @author handelenriquez
 */

public class Pagina {
    private String contenido;
    private Pagina siguiente;

    // Constructor de la clase Pagina
    public Pagina(String contenido) {
        this.contenido = contenido;
    }

    // Getters y Setters
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Pagina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pagina siguiente) {
        this.siguiente = siguiente;
    }

    // toString

    @Override
    public String toString() {
        return "Pagina{" + "contenido=" + contenido + '}';
    }

}