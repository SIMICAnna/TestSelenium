package Animals;

public class Zoo {
public static  void moveAnimals (Animal[] animals){
    for (int i = 0; i < animals.length; i++) {
        animals[i].move();
    }
}
    public static void main(String[] args) {

    Bird bird = new Bird("Eagle", 3, "M", 8);

    Animal cat = new Cat("Lion", 5,"F", 60);

    Animal fish = new Fish("Shark", 2, "F", 120);

    Animal [] animals = {bird,fish,cat};

    bird.move();
    cat.move();
    fish.move();
    bird.fly();
    moveAnimals(animals);
    }
}
