import java.util.Arrays;
import java.util.Objects;

public class Ecole {

    Etudiant[] etudiants = new Etudiant[500];

String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ecole(String nom) {
        this.nom= nom;
    }

    private int taille;

    /*public boolean ajouterEtudiant(Etudiant E) {
        if (rechercherEtudiant(E) != -1) {
            System.out.println("etudiant exist");

            return false;
        } else if (taille < 500) {
            etudiants[taille] = E;
            taille++;

        }
        return true;
    }

     */



    public int rechercherEtudiant(Etudiant etudiant) {
        int index = -1;
        for (int i = 0; i < taille; i++) {
            if (etudiant.getIdentifiant() == etudiants[i].getIdentifiant())
                return i;
        }
        return index;
    }


    public float getMoyenneDes3A() {
        float moy;
        float somme = 0;
        int nbretudiant = 0;
        for (int i = 0; i < taille; i++) {

            if (etudiants[i] instanceof Etudiant3eme) {
                if (((Etudiant3eme) etudiants[i]).getBranche().equals("A")) {
                    somme =somme+ etudiants[i].getMoyenne();
                    nbretudiant++;
                }
            }
        }
        moy = somme / nbretudiant;
        return moy;
    }

   public float moyenneSalaireAlternants() {
       float salaire;
       float somme = 0;
       int nbretudiant = 0;
       for (int i = 0; i < taille; i++) {

           if (etudiants[i] instanceof EtudiantAlternance) {
                   somme = somme + ((EtudiantAlternance) etudiants[i]).getSalaire() ;
                   nbretudiant++;
               }
           }
       salaire = somme / nbretudiant;
       return salaire;
   }

    @Override
    public String toString() {
        return "Ecole{" +
                "etudiants=" + Arrays.toString(etudiants) +
                ", nom='" + nom + '\'' +
                '}';
    }

    public boolean removeEtudiant(Etudiant e) {
        int index = rechercherEtudiant(e);
        if (index == -1)
            return false;
        for (int i = index; i <taille; i++) {
            etudiants[i] = etudiants[i + 1];
        }
        etudiants[taille] = null;
        this.taille--;
        return true;
    }

    public void changerEcole(Etudiant etd, Ecole e){
        if (e.getNom().equals(this.nom)){
            if(rechercherEtudiant(etd)!=-1){
                        removeEtudiant(etd);
                }
            }
        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ecole ecole = (Ecole) o;
        return taille == ecole.taille && Arrays.equals(etudiants, ecole.etudiants) && Objects.equals(nom, ecole.nom);
    }


    //add modified
    public void addEtudiant(Etudiant etudiant) throws EtudiantExistException{
        if (rechercherEtudiant(etudiant) != -1)
           throw new  EtudiantExistException ("This student already exist");
        if (taille==500) {
            System.out.println("ecole is full");
        }
        else if (taille < 500) {
            etudiants[taille] = etudiant;
            taille++;

        }
    }
}