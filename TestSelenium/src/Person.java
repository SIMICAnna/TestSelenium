public class Person {
    protected String ime;
    protected String prezime;
    protected String email;

    protected Adresa adresa;

    public Person(String ime, String prezime, String email, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.adresa = adresa;

    }

    @Override
    public String toString() {
        return "Person{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}

