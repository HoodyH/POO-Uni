package desingPatterns.AbstractFactory;

import java.util.Objects;

public class Factory {

    Color color;
    Animal animal;

    public Factory(String animal, String color){

        Objects.requireNonNull(animal);
        Objects.requireNonNull(color);

        this.animal = new AnimalFactory().createAnimal(animal);
        this.color = new ColorFactory().createColor(color);

    }
}
