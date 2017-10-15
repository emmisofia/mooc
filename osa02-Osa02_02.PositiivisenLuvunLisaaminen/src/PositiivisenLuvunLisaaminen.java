
import java.util.Scanner;

public class PositiivisenLuvunLisaaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = Integer.parseInt(lukija.nextLine());
        
        if (luettu > 0) {
        summa += summa + luettu;
        }
        
        int luettu = Integer.parseInt(lukija.nextLine());
        
        
        System.out.println("Summa: " + summa);
    }
}
