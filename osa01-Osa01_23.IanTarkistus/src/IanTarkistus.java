
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka vanha olet?");
        int luku1 = Integer.parseInt(lukija.nextLine());
        
        boolean suurempiTaiYhtaSuuriKuinNolla = luku1 >= 0;
        boolean pienempiTaiYhtaSuuriKuinSataKakskyt = luku1 <= 120;
        boolean totuus = suurempiTaiYhtaSuuriKuinNolla && pienempiTaiYhtaSuuriKuinSataKakskyt;

        if (totuus) {
            System.out.println("OK");
        } else {
            System.out.println("Mahdotonta!");
        } 

    }
}
