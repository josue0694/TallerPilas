package tallerpilas;

/**
 *
 * @author handelenriquez
 */

public class Historial {
    private int id;
    private String nom;

    public Historial(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Dato{" + "id=" + id + ", nom=" + nom + '}';
    }

}