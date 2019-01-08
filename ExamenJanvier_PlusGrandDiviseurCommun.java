// @Author Gianluca Lucchesi

public class ExamenJanvier_PlusGrandDiviseurCommun {
    public static void main(String[] args) {
        int valeur1 = 299;
        int valeur2= 130;
        int reste = 1, resultat = 0;

        while (reste != 0){
            reste = valeur1%valeur2;
            if (reste == 0){
                System.out.println("Le plus grand diviseur est " + valeur2);
                break;
            } else {
                resultat = valeur1/valeur2;
                valeur1 = valeur2;
                valeur2 = reste;
            }
        }
    }
}
