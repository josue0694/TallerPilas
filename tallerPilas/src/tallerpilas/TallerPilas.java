/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerpilas;

import javax.swing.JOptionPane;

/**
 *
 * @author handelenriquez
 */
public class TallerPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();
        int opc;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Seleccione una opción:
                                                               1) Agregar una página al historial
                                                               2) Retroceder a la página anterior
                                                               3) Ver historial completo
                                                               4) Salir del programa
                                                               """));

            switch (opc) {
                case 1 -> {
                    String nombrepagina = JOptionPane.showInputDialog("Digite el nombre o URL de la página:");
                    Pagina nuevapagina = new Pagina(nombrepagina);
                    pila.apilar(nuevapagina);
                }
                case 2 ->
                    pila.desapilar();
                case 3 ->
                    pila.mostrarHistorial();
                case 4 ->
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción incorrecta. Intente de nuevo o mas tarde.");
            }
        } while (opc != 4);
    }
}
