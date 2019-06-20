package Personale;

public class Igenista implements Personale{

    private String name;
    private String descrizione;

    public Igenista(String name){
        this.name = name;
        this.descrizione = "Igenista";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return descrizione;
    }
}

