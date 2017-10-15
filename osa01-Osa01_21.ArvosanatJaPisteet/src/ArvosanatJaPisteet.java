
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]");
        int luku1 = Integer.parseInt(lukija.nextLine());
        if (luku1 < 0) {
            System.out.println("mahdotonta!");
        } else if ( luku1 <= 50 ) {
            System.out.println("hylätty");
        } else if ( luku1 <= 60 ) {
            System.out.println("1");
        } else if ( luku1 <= 70) {
            System.out.println("2");
        } else if ( luku1 <=80 ) {
            System.out.println("3");
        } else if ( luku1 <= 90 ) {
            System.out.println("4");
        } else if ( luku1 <= 100) {
            System.out.println("5");
        } else if ( luku1 > 100) {
            System.out.println("uskomatonta!");
            
        }
    }
}
