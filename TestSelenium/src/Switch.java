import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextDouble();

        System.out.println("Unesite operator: ");
        String operator = scanner.next();

        switch (operator) {
            case "+":{
                System.out.println("Rezultat sabiranje je: " + (operand1 + operand2));
        }break;
            case "-":{
                System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
            }break;
            case "*": {
                System.out.println("Rezultat mnozenja je: " + (operand1 * operand2));
            }break;
            case "/":{
                if (operand2 != 0) {
                    System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
                } else {
                    System.out.println("Deljenje sa nulom nije dozvoljeno");
        }}break;
            default: {
                System.out.println("Greska!");
            }

        }

    }




}