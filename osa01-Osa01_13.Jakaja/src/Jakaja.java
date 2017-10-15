
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
        System.out.println("Anna ensimmäinen luku:");
        int yksi = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int kaksi = Integer.parseInt(lukija.nextLine());
        double tulos = (double) yksi / kaksi; 
        
        System.out.println("Jakolasku:" + yksi + "/" + kaksi + "=" + tulos);
        
    }
}
