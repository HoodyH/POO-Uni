package desingPatterns.AbstractFactory;

import java.util.Objects;

public class AnimalFactory implements AbstractFactory {

    @Override
    public Animal createAnimal(String animalType) {

        Objects.requireNonNull(animalType);

        if (animalType.equalsIgnoreCase("duck")){
            return new Duck();
        }
        else if (animalType.equalsIgnoreCase("dog")){
            return new Dog();
        }
        else if (animalType.equalsIgnoreCase("cat")){
            return new Cat();
        }

        throw new RuntimeException("Animal does not exist: " + animalType);

    }

    @Override
    public Color createColor(String colorType) {
        throw new UnsupportedOperationException();
    }

}
