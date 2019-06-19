
package agenziaimmobiliare;
 
public class Data {
    
    private static int giorno;
    private static int ora;
    
    public Data(int giorno, int ora) {
        Data.giorno = giorno;
        Data.ora = ora;
    }
    
    public int getGiorno() {
        return giorno;
    }
    
    public int getOra() {
        return ora;
    }
}
