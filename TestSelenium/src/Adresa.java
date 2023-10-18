public class Adresa {
    public Adresa(String ulica, int brojUlice, String grad) {
        this.ulica = ulica;
        this.brojUlice = brojUlice;
        this.grad = grad;
    }

    private String ulica;
    private int brojUlice;
    private String grad;

    @Override
    public String toString() {
        return "Adresa{ " +
                "ulica='" + ulica + '\'' +
                ", brojUlice=" + brojUlice +
                ", grad='" + grad + '\'' +
                '}';
    }
}
