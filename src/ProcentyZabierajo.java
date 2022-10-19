import java.util.Scanner;
public class ProcentyZabierajo {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
    double podatekstanowy = 0.04;
    double podateklokalny = 0.02;
    int Cena;
        System.out.println("Podaj cene:");
        Cena = klawiatura.nextInt();
        klawiatura.nextLine();
    double stan = podatekstanowy * Cena;
        System.out.println("\nPodatek stanowy wynosi:"+ stan);
    double lokal = podateklokalny * Cena;
        System.out.println("\nPodatek lokalny wynosi:"+ lokal);
    double uff = stan + lokal + Cena;
        System.out.println("\nCena laczna:"+ uff);
    }
}

