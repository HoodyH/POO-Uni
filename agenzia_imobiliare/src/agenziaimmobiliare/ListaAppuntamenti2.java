
package agenziaimmobiliare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListaAppuntamenti2 {
    
    private static ArrayList<Appuntamento> appuntamenti;
    
    public ListaAppuntamenti2() {
        appuntamenti = new ArrayList<Appuntamento>();
    }
    
    public static Iterator<Appuntamento> ritornaIteratore() {
        Iterator<Appuntamento> itr = appuntamenti.iterator();
        return itr;
    }
    
    public static void add(Appuntamento a) {
        appuntamenti.add(a);
    }
    
    public static List<Appuntamento> getList() {
        return appuntamenti;  
    }
    
}
