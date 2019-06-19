
import desingPatterns.AbstractFactory.*;
import desingPatterns.Builder.*;
import desingPatterns.Observer.*;
import desingPatterns.Decorator.*;

public class Client {

    private static void ClientFactory(){

        FactoryProvider fp = new FactoryProvider();

        AbstractFactory theAnimalFactory = fp.getFactory( "Animal" );
        AbstractFactory theColorFactory = fp.getFactory( "Color" );

        Animal toy = theAnimalFactory.createAnimal( "Dog" );
        Color color = theColorFactory.createColor( "Brown" );

        System.out.format( "\n%s (sound %s); %s", toy.getAnimalName(), toy.makeSound(), color.getColor() );

        toy = theAnimalFactory.createAnimal( "cat" );
        color = theColorFactory.createColor( "white" );

        System.out.format( "\n%s (sound %s); %s", toy.getAnimalName(), toy.makeSound(), color.getColor() );
    }

    private static void ClientBuilder(){

        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("John", "22738022275")
                .withEmail("john@example.com")
                .wantNewsletter(true)
                .build();
        System.out.println("Name: " + newAccount.getName());
        System.out.println("AccountNumber: " + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want Newsletter: " + newAccount.isNewsletter());
    }

    private static void ClientObserver() {
        // la news agency produce le notizie
        NewsAgency agency = new NewsAgency();

        // il canale televisivo le osserva, rilancia
        agency.addObserver( new NewsChannel( "rai1") );
        agency.addObserver( new NewsChannel( "rai2") );

        agency.setNews( "30 e lode a tutti" );
        agency.setNews( "Data test" );
    }

    public static void ClientDecorator() {
        Car car = new LuxuryCar(new SportCar(new BasicCar()));
        car.assemble();



    }

    public static void main(String[] args) {
        ClientFactory();
        System.out.println("\n");
        ClientBuilder();
        System.out.println("\n");
        ClientObserver();
        System.out.println("\n");
        ClientDecorator();
    }
}
