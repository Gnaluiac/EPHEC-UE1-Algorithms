// @Author Gianluca Lucchesi

public class ExamenJanvier_ConversionSecondes {
 public static void main (String [] args) {

 int valeur, jours, heures, minutes, secondes = 0; 
 
 valeur = 3667;

 jours = valeur/(3600*24);
 valeur = valeur-(3600*24*jours);
 heures = valeur/(3600);
 valeur = valeur-(3600*heures);
 minutes = valeur/(60);
 valeur = valeur-(60*minutes);
 secondes = valeur;

 System.out.println(jours + "j " + heures + "h " + minutes + "m " + secondes + "s");
 }
} 