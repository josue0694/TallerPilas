
package tallerpilas;
import javax.swing.JOptionPane;
/**
 *
 * @author jomas
 */
public class Pila {
   private Nodo top; //nodo mas reciente 
   
   private boolean esVacia() {
     return top == null;
   }
   
   public Pila() {
       top = null;
   }
    
    //Metodo apilar 
   public void apilar(Pagina nuevaPagina) {
       Nodo n = new Nodo(nuevaPagina);
       if (esVacia()){
          top = n; 
       } else {
            n.setSig(top);
            top = n;
       }
       JOptionPane.showMessageDialog(null, "Pagina agregada: " + nuevaPagina.getContenido());
   }

  //Desapilar 
   public Pagina desapilar(){
       if (esVacia()) {
           JOptionPane.showMessageDialog(null, "El historial esta vacio, no se puede retroceder.");
            return null;
       }
       Pagina eliminada = top.getDato();
       top = top.getSig();
       JOptionPane.showMessageDialog(null, "Se retrocedio, eliminando: " + eliminada.getContenido());
       return eliminada;
   
   }
    
    //Mostrar historial
   public void mostrarHistorial() {
     if (esVacia()) {
         JOptionPane.showMessageDialog(null, "Historial vacio.");
     } else {
       String historial = "Historial de navegacion: \n";
       Nodo aux = top;
       while (aux != null) {
            historial = historial +  "-" + aux.getDato().getContenido() + "\n";
           aux = aux.getSig();
       }
       JOptionPane.showMessageDialog(null, historial);
     }
   }
}
