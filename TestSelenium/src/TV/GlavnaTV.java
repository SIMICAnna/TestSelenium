package TV;

public class GlavnaTV extends Televizor {

    public static void main (String[] args ){

    Televizor mojTelevizor = new Televizor();

        System.out.println("Da li je televizor uključen: " + mojTelevizor.daLiJeUkljucen());
        mojTelevizor.iskljuci();
        System.out.println("Da li je televizor uključen: " + mojTelevizor.daLiJeUkljucen());
        mojTelevizor.ukljuci();
        System.out.println("Da li je televizor uključen: " + mojTelevizor.daLiJeUkljucen());
        mojTelevizor.smanjiTon();
        System.out.println("Jačina tona: " + mojTelevizor.vratiJacinuTona());
        mojTelevizor.pojacajTon();
        System.out.println("Jačina tona: " + mojTelevizor.vratiJacinuTona());

    }

}

