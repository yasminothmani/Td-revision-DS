
public class Etudiant3eme extends Etudiant{
    String branche;

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public Etudiant3eme(int identifiant, String nom, String prenom, float moyenne, String branche) {
        super(identifiant, nom, prenom, moyenne);
        this.branche=branche;
    }

    public void ajouterUneAbsence() {
        float newmoy = 0f;
        newmoy = getMoyenne() - 0.5f;
        System.out.println("moyenne=" + newmoy);

    }


}
