
package agenziaimmobiliare;


public class Caldaia {
    
    private String marca;
    private int classeEnergia;
    
    public Caldaia(String marca, int classeEnergia) {
        this.marca = marca;
        this.classeEnergia = classeEnergia;
    }
    
    public int getClasse() {
        return classeEnergia;
    }
    
    public String getMarca() {
        return marca;
    }
    
    
}
