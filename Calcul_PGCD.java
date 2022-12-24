import java.util.Scanner;
public class Calcul_PGCD {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);

    System.out.println("Quel est le degré du polynôme P1");
    int deg_P1 = clavier.nextInt();
    System.out.println("Quel est le degré du polynôme P2");
    int deg_P2 = clavier.nextInt();
    int deg_reste;
    int[] P1 = new int[deg_P1];
    int[] P2 = new int[deg_P2];

    for(int i =0; i <= deg_P1; i++){
        System.out.println("Quelle est la valeur dans P1 de x^ " + i);
        P1[i] = clavier.nextInt();
    }
    for(int j =0; j <= deg_P1; j++){
        System.out.println("Quelle est la valeur dans P2 de x^ " + j);
        P2[j] = clavier.nextInt();
    }

    boolean P1_diviseur;

    if(deg_P1 < deg_P2){
        deg_reste = deg_P2 - deg_P1;
        P1_diviseur = true;
    }else{
        deg_reste = deg_P1 - deg_P2;
        P1_diviseur = false;
    }

    int[] reste = new int[deg_reste];

    }
}
