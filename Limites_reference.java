import java.util.Scanner;
import java.util.Random;

public class Limites_reference {

    public static int combo_bonnes_rep = 0;
    
	public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random rand = new Random();

        boolean boucle = true;
        String bonne_rep ="", lim = "";
        String reponse = "";
        int limite = 0;

        System.out.print("\033[H\033[J");
        System.out.flush();

        while(boucle){
            
            limite = rand.nextInt(11);

            if(limite == 0){
                bonne_rep = "1";
                lim = "0 de (ln(1+x))/x";
            }else if(limite == 1){
                bonne_rep = "1";
                lim = "1 de (ln(x))/(x-1)";
            }else if(limite == 2){
                bonne_rep = "0";
                lim = "+inf de (ln(x))/x";
            }else if(limite == 3){
                bonne_rep = "0";
                lim = "0 de x*ln(x)";
            }else if(limite == 4){
                bonne_rep = "1";
                lim = "0 de (sin(x))/x";
            }else if(limite == 5){
                bonne_rep = "1";
                lim = "0 de (tan(x))/x";
            }else if(limite == 6){
                bonne_rep = "0";
                lim = "0 de (cos(x) - 1)/x";
            }else if(limite == 7){
                bonne_rep = "1/2";
                lim = "0 de (1 - cos(x))/x²";
            }else if(limite == 8){
                bonne_rep = "inf";
                lim = "+inf de (exp(x))/x";
            }else if(limite == 9){
                bonne_rep = "1";
                lim = "0 de (exp(x) - 1)/x";
            }else if(limite == 10){
                bonne_rep = "0";
                lim = "-inf de x*exp(x)";
            }
            System.out.println("Quelle est la limite en " + lim);
            reponse = clavier.nextLine();
            System.out.print("\033[H\033[J");
            System.out.flush();
            if(reponse.matches(bonne_rep)){
                System.out.println("Bravo");
                combo_bonnes_rep += 1;
                System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
            }else if(reponse.matches("arret")){
                boucle = false;
            }
            else{
                System.out.println(bonne_rep);
                combo_bonnes_rep = 0;
            }
        }
        clavier.close();
        System.exit(0);
	}
}