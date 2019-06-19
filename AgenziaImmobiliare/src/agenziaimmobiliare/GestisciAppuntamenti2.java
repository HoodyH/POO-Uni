
package agenziaimmobiliare;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class GestisciAppuntamenti2 {
    
    public Appuntamento cerca(String nomeCliente) {
        Iterator<Appuntamento> itr = ListaAppuntamenti2.ritornaIteratore();
        while (itr.hasNext()) {
            Appuntamento corrente = itr.next();
            if (corrente.getNome() == nomeCliente) {
                return corrente;
            }
        }
        return null;
    }
    
    public void addAppuntamento(Appuntamento a) {
        ListaAppuntamenti2.add(a);
    }
    
    public List<Appuntamento> cercaPerData(Data data, ListaAppuntamenti la) {
        List<Appuntamento> cercati = ListaAppuntamenti2.getList().stream().filter(p-> p.getData().equals(data)).collect(Collectors.toList());
        return cercati;       
    }
    
}
