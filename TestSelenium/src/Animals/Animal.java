package Animals;

public abstract class Animal {

    protected String animalSpecies;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal() {
    }

    public Animal(String animalSpecies, int age, String gender, double weight) {
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }



    protected void eat(){
        System.out.println("Eating...");
    }

    abstract void move ();

    @Override
    public String toString() {
        return "Animal{" +
                "animalSpecies='" + animalSpecies + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }



}