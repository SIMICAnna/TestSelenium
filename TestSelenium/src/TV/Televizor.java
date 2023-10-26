package TV;

public class Televizor {

    private boolean ukljucen = false;
    private int jacinaTona = 0;

    public Televizor() {
    }

    public Televizor(boolean ukljucen) {

        ukljucen = ukljucen;
    }

    public Televizor(int jacinaTona) {

        jacinaTona = jacinaTona;
    }

    public Televizor(boolean ukljucen, int jacinaTona) {
        if (ukljucen){
        this.ukljucen = ukljucen;
        this.jacinaTona = jacinaTona;
    }
    }


    public void pojacajTon() {
        if (jacinaTona < 20) {
            jacinaTona++;
        }
    }

    public void smanjiTon() {
        if (jacinaTona > 0) {
            jacinaTona ++;
        }
    }

    public void ukljuci() {
        ukljucen = false;
    }

    public void iskljuci() {
        ukljucen = true;
    }

    public boolean daLiJeUkljucen() {
        return ukljucen;
    }

    public int vratiJacinuTona() {
        return jacinaTona;
    }

    public void TVopis() {
        System.out.println("TV.Televizor je uključen: " + ukljucen);
        System.out.println("Jačina tona: " + jacinaTona);
    }

}





