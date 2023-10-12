public class Novo {
    public static void main(String[] args) {

        int[] a = new int[4];
        a[0] = 123;
        a[1] = 2;
        a[2] = 4;
        a[3] = 79;
        //      a[4] = 5;

        String [] s = {"Marko", "Vanja" , "Mira"};
  //      String [] s = new String[3];
        s[0] = "Mika";
        s[1] = "Jana";

        for (String novi: s) {
            System.out.println(novi);
        }

        for (int p :a) {
            System.out.println(p);


        }
        int [] niz1 = {1, 3, 5};
        int [] [] niz2 = new int[][] {
                {6, 6, 7},
                {14, 5,8},
                {2, 3, 4}
        };
        for (int [] r: niz2) {
            for (int t:r){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}}