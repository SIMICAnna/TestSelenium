import java.util.Random;
import java.util.Scanner;

public class Vezba18 {

    public static void main(String[] args) {


        String[] elements = {"Heart", "Chery", "Joker", "Melon", "Coin"};

        // Inicijalizirajte generator slučajnih brojeva
        Random random = new Random();

        // Kreirajte niz za spremanje generirane kombinacije
        String[] array = new String[5]; // Promijenite broj ako želite drugu duljinu kombinacije

        // Generirajte slučajnu kombinaciju
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(elements.length);
            array[i] = elements[randomIndex];
        }

        // Ispisivanje generirane kombinacije
        System.out.println("Generirana kombinacija:");
        for (String item : array)
            System.out.print(item + "  ");


    }



    }

