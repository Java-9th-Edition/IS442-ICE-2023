package farming.type;

import farming.type.Animal;
import farming.type.Cat;
import farming.type.Cow;
import farming.type.Dog;

import java.util.ArrayList;

public class AnimalFarm {
    private ArrayList<Animal> animals = new ArrayList<>();

    public AnimalFarm() {
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
    }

    public void makeNoise() {
        for (Animal a : animals) {
            a.makeNoise();
        }

    }
}
