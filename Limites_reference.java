import java.util.Scanner;
import java.util.Random;

public class Limites_reference {

    public static int combo_bonnes_rep = 0;

	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        boolean bonne_rep = true;
        String reponse = "";
        int limite = 0;
        while(bonne_rep){
            
            limite = rand.nextInt(11);

            if(limite == 0){
                System.out.println("Quelle est la limite en 0 de (ln(1+x))/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("1")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 1){
                System.out.println("Quelle est la limite en 1 de (ln(x))/(x-1) ?");
                reponse = inp.nextLine();
                if(reponse.matches("1")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 2){
                System.out.println("Quelle est la limite en +inf de (ln(x))/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("0")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("0");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 3){
                System.out.println("Quelle est la limite en 0 de x*ln(x) ?");
                reponse = inp.nextLine();
                if(reponse.matches("0")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("0");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 4){
                System.out.println("Quelle est la limite en 0 de (sin(x))/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("1")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 5){
                System.out.println("Quelle est la limite en 0 de (tan(x))/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("1")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 6){
                System.out.println("Quelle est la limite en 0 de (cos(x) - 1)/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("0")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("0");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 7){
                System.out.println("Quelle est la limite en 0 de (1 - cos(x))/x² ?");
                reponse = inp.nextLine();
                if(reponse.matches("1/2")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1/2");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 8){
                System.out.println("Quelle est la limite en +inf de (exp(x))/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("inf")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("inf");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 9){
                System.out.println("Quelle est la limite en 0 de (exp(x) - 1)/x ?");
                reponse = inp.nextLine();
                if(reponse.matches("1")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("1");
                    combo_bonnes_rep = 0;
                }
            }else if(limite == 10){
                System.out.println("Quelle est la limite en -inf de x*exp(x) ?");
                reponse = inp.nextLine();
                if(reponse.matches("0")){
                    System.out.println("Bravo");
                    combo_bonnes_rep += 1;
                    System.out.println("Vous avez " + combo_bonnes_rep + " bonnes réponses d'affilée");
                }else{
                    System.out.println("0");
                    combo_bonnes_rep = 0;
                }
            }
        }
	}
}