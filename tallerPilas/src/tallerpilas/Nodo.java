package tallerpilas;

/**
 *
 * @author jomas
 */
public class Nodo {

    private Pagina dato;
    private Nodo sig;

    public Nodo(Pagina dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Pagina getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
