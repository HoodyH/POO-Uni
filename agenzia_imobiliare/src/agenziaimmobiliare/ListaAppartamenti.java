
package agenziaimmobiliare;
import java.util.ArrayList;
import java.util.Iterator;


public class ListaAppartamenti {
    
    private static ArrayList<Abitazione> abitazioni;
    
    public ListaAppartamenti() {
        abitazioni = new ArrayList<Abitazione>();
    }
    
    public void addAbitazione(Abitazione a) {
        abitazioni.add(a);
    }
    
    public static ArrayList<Abitazione> cercaA(Abitazione key) {
        ArrayList<Abitazione> risultati = new ArrayList<Abitazione>();
        Iterator<Abitazione> itr = abitazioni.iterator();
        while (itr.hasNext()) {
            Abitazione corrente = itr.next();
            if (corrente.equals(key)) {
                risultati.add(corrente);
            }
        }
        return risultati;
    }
    
    public static int prezzoMedioA(ArrayList<Abitazione> scelte) {
        int prezzoTotale = 0;
        int numeroCase = 0;
        Iterator<Abitazione> itr = scelte.iterator();
        while (itr.hasNext()) {
            Abitazione corrente = itr.next();
            prezzoTotale = prezzoTotale + corrente.getPrezzo();
            numeroCase = numeroCase + 1;
        }
        return prezzoTotale / numeroCase;    
    }
    
    public static Abitazione cercaSpecifica(Abitazione key) {
        Iterator<Abitazione> itr = abitazioni.iterator();
        while (itr.hasNext()) {
            Abitazione corrente = itr.next();
            if (corrente.equals(key)) {
                return corrente;
            }
        }
        return null;
    }
    
    
}
