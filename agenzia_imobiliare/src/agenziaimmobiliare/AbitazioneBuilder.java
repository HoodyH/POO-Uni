
package agenziaimmobiliare;


public class AbitazioneBuilder {
    
    private String tipo;
    private String via;
    private Caldaia caldaia;
    private Citta citta;
    private int numeroStanze;
    private int numeroPiani;
    private int annoCostruzione;
    private int annoRevisione;
    private int id;
    private int prezzo;
    
    public Abitazione build() {
        return new Abitazione(tipo, via, caldaia, citta, numeroStanze, numeroPiani, annoCostruzione, annoRevisione, id, prezzo);
    }
    
    private AbitazioneBuilder(int id) {
        this.id = id;    
    }
    
    public static AbitazioneBuilder newBuilder(int id) {
        return new AbitazioneBuilder(id);
    }
    
    public AbitazioneBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public AbitazioneBuilder via(String via) {
        this.via = via;
        return this;
    }
    
    public AbitazioneBuilder caldaia(Caldaia caldaia) {
        this.caldaia = caldaia;
        return this;
    }
    
    public AbitazioneBuilder citta(Citta citta) {
        this.citta = citta;
        return this;
    }
    
    public AbitazioneBuilder numeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
        return this;
    }
    
    public AbitazioneBuilder numeroPiani(int numeroPiani) {
        this.numeroPiani = numeroPiani;
        return this;
    }
    
    public AbitazioneBuilder annoCostruzione(int annoCostruzione) {
        this.annoCostruzione = annoCostruzione;
        return this;
    } 
    
    public AbitazioneBuilder annoRevisione(int annoRevisione) {
        this.annoRevisione = annoRevisione;
        return this;
    }   
    
    public AbitazioneBuilder prezzo(int prezzo) {
        this.prezzo = prezzo;
        return this;
    }
}
