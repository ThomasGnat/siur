public class Dom {
    public static void main(String[] args) {

        int pomieszczenie1 = 4;
        int scianychyba1 = 3;
        int pomieszczenie2 = 4;
        int scianychyba2 = 3;
        int pomieszczenie3 = 2;
        int scianychyba3 = 3;
        int pomieszczenie4 = 2;
        int scianychyba4 = 2;
        int wymiar1 = pomieszczenie1 * scianychyba1;
        int wymiar2 = pomieszczenie2 * scianychyba2;
        int wymiar3 = pomieszczenie3 * scianychyba3;
        int wymiar4 = pomieszczenie4 * scianychyba4;
        int suma = wymiar1 + wymiar2 + wymiar3 + wymiar4;
        System.out.print("\npierwsze pomieszczenie\n"+wymiar1);

        System.out.print("\ndrugie pomieszczenie\n"+wymiar2);

        System.out.print("\ntrzecie pomieszczenie\n"+wymiar3);

        System.out.print("\nczwarte pomieszczenie\n"+wymiar4);

        System.out.print("\nCaly dom ma\n"+suma);



    }
}
