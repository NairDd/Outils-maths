import java.util.Arrays;
import java.util.Scanner;
public class Calcul_PGCD {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

<<<<<<< HEAD
        System.out.println("Quel est le degré du polynôme P1");
        int degre_polynome_diviseur = clavier.nextInt() + 1;
        System.out.println("Quel est le degré du polynôme P2");
        int degre_polynome_dividende = clavier.nextInt() + 1;
        int degre_quotient, deg_reste;
        int[] polynome_diviseur = new int[degre_polynome_diviseur];
        int[] polynome_dividende = new int[degre_polynome_dividende];
=======
    System.out.println("Quel est le degré du premier polynôme");
    int deg_P1 = clavier.nextInt();
    System.out.println("Quel est le degré du deuxième polynôme");
    int deg_P2 = clavier.nextInt();
    int deg_reste;
    int[] P1 = new int[deg_P1];
    int[] P2 = new int[deg_P2];
>>>>>>> da711ceda4cc4f347e28411658e871100100d2c0

        for(int i =0; i < degre_polynome_diviseur; i++){
            System.out.println("Quelle est la valeur dans P1 de x^ " + i);
            polynome_diviseur[i] = clavier.nextInt();
        }
        System.out.println(Arrays.toString(polynome_diviseur));
        for(int j =0; j < degre_polynome_dividende; j++){
            System.out.println("Quelle est la valeur dans P2 de x^ " + j);
            polynome_dividende[j] = clavier.nextInt();
        }
        System.out.println(Arrays.toString(polynome_dividende));

        if(degre_polynome_diviseur > degre_polynome_dividende){
            int[] temp = new int[degre_polynome_diviseur];
            temp = polynome_dividende;
            polynome_dividende = polynome_diviseur;
            polynome_diviseur = temp;

            degre_quotient = degre_polynome_diviseur - degre_polynome_dividende;
        }

        int[] quotient = new int[degre_quotient];
        //on a le diviseur, le dividende, et le quotient, comment trouver le reste
        //méthode pour trouver le reste, à chaque étape 

        

    }
}
