import java.util.Scanner;

public class Algo_Devoir1Resistance {

    public static void main(String[] args) {
        String couleur1 = "", couleur2 = "", couleur3 = "", couleur4 = "", tolerence = "";
        double valeur1 = 0, valeur2 = 0.1, multiplicateur = 0, resistance = 0;

        Scanner sc = new Scanner(System.in);
        while (valeur1 == 0) {
            System.out.println("Entrez la 1ère couleur de la résistance à 4 bandes");
            couleur1 = sc.next();

            switch (couleur1) {
                case "marron":
                    valeur1 = 10;
                    break;
                case "rouge":
                    valeur1 = 20;
                    break;
                case "orange":
                    valeur1 = 30;
                    break;
                case "jaune":
                    valeur1 = 40;
                    break;
                case "vert":
                    valeur1 = 50;
                    break;
                case "bleu":
                    valeur1 = 60;
                    break;
                case "violet":
                    valeur1 = 70;
                    break;
                case "gris":
                    valeur1 = 80;
                    break;
                case "blanc":
                    valeur1 = 90;
                default:
                    System.out.println("Couleur non valable.");
            }
        }

        while (valeur2 == 0.1) {
            System.out.println("Entrez la 2ème couleur de la résistance à 4 bandes");
            couleur2 = sc.next();
            switch (couleur2) {
                case "noir":
                    valeur2 = 0;
                    break;
                case "marron":
                    valeur2 = 1;
                    break;
                case "rouge":
                    valeur2 = 2;
                    break;
                case "orange":
                    valeur2 = 3;
                    break;
                case "jaune":
                    valeur2 = 4;
                    break;
                case "vert":
                    valeur2 = 5;
                    break;
                case "bleu":
                    valeur2 = 6;
                    break;
                case "violet":
                    valeur2 = 7;
                    break;
                case "gris":
                    valeur2 = 8;
                    break;
                case "blanc":
                    valeur2 = 9;
                    break;
                case "or":
                    valeur2 = 0;
                    break;
                case "argent":
                    valeur2 = 0;
                    break;
                default:
                    System.out.println("Couleur non valable.");
            }
        }

        while (multiplicateur == 0) {
            System.out.println("Entrez la 3ème couleur de la résistance à 4 bandes");
            couleur3 = sc.next();
            switch (couleur3) {
                case "noir":
                    multiplicateur = 1;
                    break;
                case "marron":
                    multiplicateur = 10;
                    break;
                case "rouge":
                    multiplicateur = 100;
                    break;
                case "orange":
                    multiplicateur = 1000;
                    break;
                case "jaune":
                    multiplicateur = 10000;
                    break;
                case "vert":
                    multiplicateur = 100000;
                    break;
                case "bleu":
                    multiplicateur = 1000000;
                    break;
                case "violet":
                    multiplicateur = 10000000;
                    break;
                case "gris":
                    multiplicateur = 100000000;
                    break;
                case "blanc":
                    multiplicateur = 1000000000;
                    break;
                case "or":
                    multiplicateur = 0.1;
                    break;
                case "argent":
                    multiplicateur = 0.01;
                    break;
                default:
                    System.out.println("Couleur non valable.");
            }
        }

        while (tolerence == "") {
            System.out.println("Entrez la 4ème couleur de la résistance à 4 bandes");
            couleur4 = sc.next();
            switch (couleur4) {
                case "noir":
                    tolerence = "0%";
                    break;
                case "marron":
                    tolerence = "+/- 1%";
                    break;
                case "rouge":
                    tolerence = "+/- 2%";
                    break;
                case "orange":
                    tolerence = "+/- 3%";
                    break;
                case "jaune":
                    tolerence = "+/- 4%";
                    break;
                case "vert":
                    tolerence = "+/- 0.5%";
                    break;
                case "bleu":
                    tolerence = "+/- 0.25%";
                    break;
                case "violet":
                    tolerence = "+/- 0.1%";
                    break;
                case "gris":
                    tolerence = "+/- 0.01%";
                    break;
                case "blanc":
                    tolerence = "0%";
                    break;
                case "or":
                    tolerence = "+/- 5%";
                    break;
                case "argent":
                    tolerence = "+/- 10%";
                    break;
                default:
                    System.out.println("Couleur non valable.");
            }
        }

        resistance = (valeur1 + valeur2) * multiplicateur;

        if (resistance >= 1000 && resistance < 1000000){
        resistance = resistance / 1000;
        System.out.println("La résistance est de " + resistance + " KΩ" + "  avec une tolérence de " + tolerence + ".");
         } else if (resistance >= 1000000){
                resistance = resistance/1000000;
                System.out.println("La résistance est de " + resistance + " MΩ" + "  avec une tolérence de " + tolerence + ".");
            }
            else {
            System.out.println("La résistance est de " + resistance + " Ω" + "  avec une tolérence de " + tolerence + ".");
        }

    }
}
