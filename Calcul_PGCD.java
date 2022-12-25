import java.util.Arrays;
import java.util.Scanner;
public class Calcul_PGCD {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Quel est le degré du polynôme P1");
        int degre_polynome_diviseur = clavier.nextInt() + 1;
        System.out.println("Quel est le degré du polynôme P2");
        int degre_polynome_dividende = clavier.nextInt() + 1;
        int degre_quotient;
        int[] polynome_diviseur = new int[degre_polynome_diviseur];
        int[] polynome_dividende = new int[degre_polynome_dividende];

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
        }else{
            degre_quotient = degre_polynome_dividende - degre_polynome_diviseur;
        }

        int[] quotient = new int[degre_quotient];
        //on a le diviseur, le dividende, et le quotient, comment trouver le reste
        //méthode pour trouver le reste, à chaque étape 



    }
}
