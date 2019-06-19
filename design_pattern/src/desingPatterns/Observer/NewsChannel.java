package desingPatterns.Observer;

public class NewsChannel implements Observer {

    String name;

    public NewsChannel (String name){
        this.name = name;
    }

    @Override
    public void update( Object data ) {
        System.out.format("\nSono %s: ricevuto la news %s", this.name, data );
    }

}
