public class Vezba19 {
    public static void main(String[] args) {

        String [] objects = {"BMW", "BMX", "Samsung"};
        String [] names = {"Car", "Bike", "Mobile"};
        Double [] prices = new Double[]{20000.0,2000.0, 200.0};

        // Provjerite jesu li svi nizovi iste duljine
        if (objects.length == names.length && names.length == prices.length) {
            for (int i = 0; i < objects.length; i++) {
                String object = objects[i];
                String name = names[i];
                Double price = prices[i];

                System.out.println("Objekat: " + object);
                System.out.println("Tip: " + name);
                System.out.println("Cena: " + price);
                System.out.println();
            }
        } else {
            System.out.println("Nizovi nisu iste duzine. Ne mogu prikazati podatke o pojmovima.");
        }
       // Ovaj kod prvo provjerava jesu li svi nizovi iste duljine. Ako jesu, tada koristi petlju za iteraciju kroz sve elemente nizova i prikazuje podatke o svakom pojmu (objektu, nazivu i cijeni). Ako nizovi nisu iste duzine, ispisuje se odgovarajuća poruka o grešci.









    }

}
