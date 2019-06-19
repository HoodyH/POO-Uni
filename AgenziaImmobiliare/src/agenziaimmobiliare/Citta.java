
package agenziaimmobiliare;


public class Citta {
    
    private String nome;
    private String provincia;
    private int cap;
    
    public Citta(String nome, String provincia, int cap) {
        this.nome = nome;
        this.provincia = provincia;
        this.cap = cap;
    }
    
    public int getCap() {
        return cap;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    
}
