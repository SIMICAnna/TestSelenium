public class Profesor extends Person{
    private String predmet;

    public Profesor(String ime, String prezime, String email, Adresa adresa, String predmet) {
        super(ime, prezime, email, adresa);
        this.predmet = predmet;
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                "predmet=" + predmet+
                '}';
    }
}



