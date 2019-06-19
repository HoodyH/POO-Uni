
package agenziaimmobiliare;
import java.util.ArrayList;


public interface Agenzia {
    
    public int prezzoMedio(Abitazione key);
    
    public ArrayList<Abitazione> cerca(Abitazione key);
    
    public void prenota(Abitazione keyTot, int giorno, int ora);
   
}
