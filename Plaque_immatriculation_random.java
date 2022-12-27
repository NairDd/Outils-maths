import java.util.Scanner;
import java.util.Random;

public class Plaque_immatriculation_random {
    
	public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        Random rand = new Random();
        String chars = "ABCDEFGHJKLMNPQRSTVWXYZ"; 
        String chaine1 = "";
        String chaine2 = "";
        String triplet = "";
        int x,y;
        for(int i = 0; i<=1; i++){
            x = rand.nextInt(23);
            y = rand.nextInt(23);
            chaine1 += chars.charAt(x);
            chaine2 += chars.charAt(y);
        }
        for(int i = 0; i<=2; i++){
            x = rand.nextInt(10);
            triplet += (x);
        }

        System.out.println(chaine1 + "-" + triplet + "-"  + chaine2);
        clavier.nextLine();
        Plaque_immatriculation_random.main(null);
    }
}
