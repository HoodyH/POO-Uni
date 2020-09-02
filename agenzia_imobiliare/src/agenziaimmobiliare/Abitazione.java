
package agenziaimmobiliare;


public class Abitazione {
    
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
    
    public Abitazione(String tipo, String via, Caldaia caldaia, Citta citta, int numeroStanze, int numeroPiani, int annoCostruzione, int annoRevisione, int id, int prezzo) {
        this.tipo = tipo;
        this.via = via;
        this.caldaia = caldaia;
        this.citta = citta;
        this.numeroStanze = numeroStanze;
        this.numeroPiani = numeroPiani;
        this.annoCostruzione = annoCostruzione;
        this.annoRevisione = annoRevisione;
        this.id = id;
        this.prezzo = prezzo;  
    }
    
    public int getPrezzo() {
        return prezzo;
    }
    
    public boolean equals(Abitazione b) {
        int uguali = 0;
        if (b.prezzo != 0) {
            if (b.prezzo != prezzo) {
                uguali = uguali + 1;
            }
        }
        if (b.tipo != null) {
            if (b.tipo != tipo) {
                uguali = uguali + 1;
            }
        }
        if (b.annoCostruzione != 0) {
            if (b.annoCostruzione != annoCostruzione) {
                uguali = uguali + 1;
            }
        }
        if (b.via != null) {
            if (b.via != via) {
                uguali = uguali + 1;
            }
        }
        if (b.citta != null) {
            if (b.citta != citta) {
                uguali = uguali + 1;
            }
        }
        if (b.numeroPiani != 0) {
            if (b.numeroPiani != numeroPiani) {
                uguali = uguali + 1;
            }
        }
        if (b.numeroStanze != 0) {
            if (b.numeroStanze != numeroStanze) {
                uguali = uguali + 1;
            }
        }
        if (b.annoRevisione != 0) {
            if (b.annoRevisione != annoRevisione) {
                uguali = uguali + 1;
            }
        }
        if (b.caldaia != null) {
            if (b.caldaia != caldaia) {
                uguali = uguali + 1;
            }
        }
        if (uguali == 0) {
            return true;
        } else {
            return false;
        }
    } 
    
    
    
}
