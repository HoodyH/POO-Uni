package desingPatterns.AbstractFactory;

import java.util.Objects;

public class ColorFactory implements AbstractFactory {

    @Override
    public Color createColor(String colorType) {

        Objects.requireNonNull(colorType);

        if (colorType.equalsIgnoreCase("white")){
            return new White();
        }
        else if (colorType.equalsIgnoreCase("brown")){
            return new Brown();
        }
        else if (colorType.equalsIgnoreCase("black")){
            return new Black();
        }

        throw new RuntimeException("This color does not exist: " + colorType);

    }

    @Override
    public Animal createAnimal(String animalType) {
        throw new UnsupportedOperationException();
    }
}
