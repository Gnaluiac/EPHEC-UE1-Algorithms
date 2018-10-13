// @Author Gianluca Lucchesi

public class ExoBocal{
  public static void main (String[] args){
    int i = 13; // valeur initiale bocal
    int choixUtilisateur = 0;
    int choixPC = 0;
   
    while (i>1)
    {
      System.out.println("Entrez un nombre entre 1 et 3.");
      choixUtilisateur = Clavier.lireInt();
      if (choixUtilisateur <1 || choixUtilisateur > 3)
      {
        System.out.println("Le nombre n'est pas correct. Entrez un nombre entre 1 et 3. Recommencez.");
      } else {
          System.out.println("L'utilisateur a choisi le nombre " + choixUtilisateur + ".");
          choixPC = (4 - choixUtilisateur);
          System.out.println("L'ordinateur a choisi le nombre " + choixPC + ".");
          i = (i - choixUtilisateur - choixPC);
          if (i == 1)
          {
          System.out.println("Il reste " + i + " dans le bocal.");
          System.out.println("L'ordinateur a gagné.");
          }else{
            System.out.println("Il reste " + i + " dans le bocal.");
          }
          {
        }
      }
    }
  }
}