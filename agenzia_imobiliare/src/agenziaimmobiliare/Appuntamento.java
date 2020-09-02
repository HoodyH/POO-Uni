    
package agenziaimmobiliare;


public class Appuntamento {
    
    private String nomeCliente;
    private Abitazione abitazione;
    private Data data;
    
    public Appuntamento(String nomeCliente, Abitazione abitazione, Data data) {
        this.nomeCliente = nomeCliente;
        this.abitazione = abitazione;
        this.data = data;
    }
    
    public Data getData() {
        return data;
    }
    
    public String getNome() {
        return nomeCliente;
    }
    
    public boolean isDataLibera(Appuntamento b) {
        if (data.getGiorno() == b.getData().getGiorno() && data.getOra() == b.getData().getOra()) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean equals(Appuntamento b) {
        if (data.getGiorno() == b.getData().getGiorno() && data.getOra() == b.getData().getOra()) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
