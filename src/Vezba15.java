import java.util.Scanner;

public class Vezba15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite marku vozila: ");
        String carMark = scanner.next();

        if (carMark.equalsIgnoreCase("Ford")) {
            System.out.println("Unesite broj vrata: ");
            int doors = scanner.nextInt();

            if (doors == 2) {
                System.out.println("Ovo je Ford sa 2 vrata");
            } else if (doors == 3) {
                System.out.println("Ovo je Ford sa 3 vrata");
            } else if (doors == 4) {
                System.out.println("Ovo je Ford sa 4 vrata");
            } else {
                System.out.println("Nepoznat broj vrata za Ford automobil.");
            }
        } else {
            System.out.println("Ovo nije Ford automobil, ne možete uneti broj vrata.");
        }
    }}
