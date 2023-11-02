// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Ecole E =new Ecole("soukra");

        Etudiant etudiant1=(Etudiant) new Etudiant3eme(1,"yass","othmani",20f,"A");
        Etudiant etuduiant2 =(Etudiant) new Etudiant3eme(2,"SUIIII","WIW",10.5f,"A");


        Etudiant3eme etudiant3 =new Etudiant3eme(3,"L","M",19.5f,"A");
        Etudiant3eme etudiant4=new Etudiant3eme(5,"K","w",17.8f,"A");


        EtudiantAlternance etudiant5 =new EtudiantAlternance(4,"salah","zkiwi",12.9f,299);
        Etudiant etudiant6 =(Etudiant)new EtudiantAlternance(5,"ss","uuu",9.5f,20);

        try {
            E.addEtudiant(etudiant3);
        } catch (EtudiantExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            E.addEtudiant(etudiant1);
        } catch (EtudiantExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            E.addEtudiant(etudiant4);
        } catch (EtudiantExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            E.addEtudiant(etudiant5);
        } catch (EtudiantExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            E.addEtudiant(etudiant6);
        } catch (EtudiantExistException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(E.moyenneSalaireAlternants());

        E.changerEcole(etudiant1,E);
        System.out.println(E.getMoyenneDes3A());

        System.out.println(E.toString());

        System.out.println(E.toString());
    }
}


