
package agenziaimmobiliare;
import java.util.ArrayList;
import java.util.Iterator;


public class ListaAppuntamenti {
    
    private static ArrayList<Appuntamento> appuntamenti;
    
    public ListaAppuntamenti() {
        appuntamenti = new ArrayList<Appuntamento>();
    }
    
    public Appuntamento cerca(String nomeCliente) {
        Iterator<Appuntamento> itr= appuntamenti.iterator();
        while (itr.hasNext()) {
            Appuntamento corrente = itr.next();
            if (corrente.getNome() == nomeCliente) {
                return corrente;
            }
        }
        return null;
    }
    
    public ArrayList<Appuntamento> cercaPerGiorno(int giorno) {
        ArrayList<Appuntamento> risultati = new ArrayList<>();
        Iterator<Appuntamento> itr = appuntamenti.iterator();
        while (itr.hasNext()) {
            Appuntamento corrente = itr.next();
            if (corrente.getData().getGiorno() == giorno) {
                risultati.add(corrente);
            }
        }
        return risultati;
    }
    
    
    public void addAppuntamento(Appuntamento a) {
        Iterator<Appuntamento> itr= appuntamenti.iterator();
        while (itr.hasNext()) {
            Appuntamento corrente = itr.next();
            if (corrente.isDataLibera(a) == false) {
                System.out.println("Data occupata");
                System.exit(0);
            }
        }
        appuntamenti.add(a);
    }
    
    public void deleteAppuntamento(Appuntamento a) {
        Iterator<Appuntamento> itr= appuntamenti.iterator();
        while (itr.hasNext()) {
            Appuntamento corrente = itr.next();
            if (corrente.equals(a) == true) {
                appuntamenti.remove(a);
            }
        }
        
    }
  
}
