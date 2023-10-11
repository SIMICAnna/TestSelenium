// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your

import java.io.Console;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //       Scanner scanner = new Scanner(System.in);

        //      System.out.println("unesite prvi broj");
        //      int operand2 = scanner.nextInt();

        //     System.out.println("unesite drugi broj");
        //     int operand1 = scanner.nextInt();

    //    double x = (113.0 / 112.1);

        //       System.out.println("rezultat: " + (operand1  + operand2));
        //       System.out.println("print 2 " + x);
        //       System.out.printf("print 3 %.2f", x);

        //      System.out.println("__________");
        //       System.out.println(System.currentTimeMillis());


//        int z = 10;
//        int o = 6;

        //       System.out.println(z +o);

        //   Scanner scanner = new Scanner();
        // System.out.println("unesite broj");
        //     int op1 = scanner.nextInt();

//        int modulo = op1 % 2;
        //     System.out.println("vrednost promenljive je: ");
        //     System.out.println(modulo);

        //      if (modulo == 1) {
        //         System.out.println("neparna");
        //      } else {
        //          System.out.println("parna");

        int n = 10; // Veličina tablice (od 1 do n)
        int faktori[] = {1, 2, 3}; // Faktori množenja

        for (int i = 1; i <= n; i++) {
            for (int faktor : faktori) {
                int rezultat = i * faktor;
                System.out.print(rezultat + "\t"); // "\t" dodaje tabulator između brojeva
            }
            System.out.println(); // Prelazak u novi red nakon svakog reda tablice
        }


        }

    }




