import java.util.Random;
import java.util.Scanner;

public class Vezba17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean igra = true;

        while (igra) {
            int zamisljenBroj = random.nextInt(10) + 1; // Zamisli broj između 1 i 10
            boolean brojJePogodjen = false;

            System.out.println("Zamislio sam broj između 1 i 10. Pogodi ga!");

            while (!brojJePogodjen) {
                System.out.print("Unesi svoj broj: ");
                int unetiBroj = scanner.nextInt();

                if (unetiBroj == zamisljenBroj) {
                    System.out.println("Bravo! Pogodili ste broj " + zamisljenBroj);
                    brojJePogodjen = true;
                } else {
                    System.out.println("Niste pogodili. Pokušajte ponovo.");
                }break;
            }}}}


            


