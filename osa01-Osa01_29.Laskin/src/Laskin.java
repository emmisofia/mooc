
import java.util.Scanner;

public class Laskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku");
        int luku1 = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(lukija.nextLine());
        double tulos1 = (double) luku1/luku2;
        
        System.out.println("Anna operaatio");
        String operaatio = lukija.nextLine();
        
        if (operaatio.equals("+")) {
            System.out.println(luku1 + "+" + luku2 + "=" + (luku1 + luku2));
            
        } else if (operaatio.equals("-")) {
            System.out.println(luku1 + "-" + luku2 + "=" + (luku1 - luku2));
            
        } else if (operaatio.equals("*")) {
            System.out.println(luku1 + "*" + luku2 + "=" + (luku1 * luku2));
            
        } else if (operaatio.equals("/")) {
            System.out.println(luku1 + "/" + luku2 + "=" + (tulos1)); 
            
            
            
            
            
            
            
        }
        
        
        

    }
}
