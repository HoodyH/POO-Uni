
package agenziaimmobiliare;
import java.util.ArrayList;

public class MiaAgenzia {
    
    ListaAppuntamenti appuntamenti = new ListaAppuntamenti();
    ListaAppartamenti abitazioni = new ListaAppartamenti();

    
    public int prezzoMedio(Abitazione key) {
        ArrayList<Abitazione> result = ListaAppartamenti.cercaA(key);
        int prezzoMedio = ListaAppartamenti.prezzoMedioA(result);
        return prezzoMedio;    
    } 

    public ArrayList<Abitazione> cerca(Abitazione key) {
        ArrayList<Abitazione> cercate = ListaAppartamenti.cercaA(key);
        return cercate;
    }

    
    public void prenota(Abitazione keyTot, int giorno, int ora, String nomeCliente) {
        Abitazione trovata = ListaAppartamenti.cercaSpecifica(keyTot);
        Data data = new Data(giorno, ora);
        Appuntamento nuovo = new Appuntamento(nomeCliente, trovata, data);
        appuntamenti.addAppuntamento(nuovo);
    }
    
   
}
