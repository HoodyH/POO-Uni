package Personale;

public class Dottore implements Personale{

    private String name;
    private String descrizione;

    public Dottore(String name){
        this.name = name;
        this.descrizione = "Dottore";
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
