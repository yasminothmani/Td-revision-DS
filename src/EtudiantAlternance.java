public class EtudiantAlternance extends Etudiant{

    int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public EtudiantAlternance(int identifiant, String nom, String prenom, float moyenne, int salire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire=salaire;
    }


    public void ajouterUneAbsence(){

int newsal=0;
newsal=salaire-50;
        System.out.println("new salire="+newsal);

    }


    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                '}';
    }
}
