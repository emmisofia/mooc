
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int asti = Integer.parseInt(lukija.nextLine());
        System.out.println("Mistä lähtien");
        int alku = Integer.parseInt(lukija.nextLine());
        
        while ( alku <= asti ) {
            System.out.println(alku);
            alku++;
        }
        
    }
}
