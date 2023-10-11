import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Vezba14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int a = 10;
//        int b = 3;

//        System.out.println("Unesite prvi broj: ");
//        int x = scanner.nextInt();
//
//        System.out.println("Unesite drugi broj: ");
//        int y = scanner.nextInt();
//
//        System.out.println("Unesite operator: ");
//        String operator = scanner.next();

 //       if (resultat!=0) {
//            System.out.println("Ostatak je: "+ resultat);
//        }
//
//        if (resultat > 1000) {
//            System.out.println("Ostatak je"+ resultat +">1000" );
//        } else if (resultat<1000) {
//            System.out.println("Ostatak je" + resultat + "<1000");
//
//        }


            System.out.println("Unesi prvi broj: ");
            int a = scanner.nextInt();

            System.out.println("Unesi drugi broj: ");
            int b = scanner.nextInt();

            int drugiRezultat = (a % b);

        if (drugiRezultat == 0) {
            System.out.println("Nema ostatka");
        } else {
            System.out.println("Ostatak je: " + drugiRezultat);

            if (drugiRezultat > 1000) {
                System.out.println("ostatak je " + drugiRezultat + ">1000");
            } else if (drugiRezultat < 1000) {
                System.out.println("ostatak je " + " " + drugiRezultat + " i to je <1000");
            }
        }
        {

        }}}