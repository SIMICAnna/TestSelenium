public class Student extends Person{
    private String brojIndexa;


    public Student(String ime, String prezime, String email, Adresa adresa, String brojIndexa) {
        super(ime, prezime, email, adresa);
        this.brojIndexa = brojIndexa;


    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                "brojIndexa=" + brojIndexa +
                '}';
    }
}
