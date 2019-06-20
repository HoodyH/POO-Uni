package Trattamento;


import Personale.*;
import java.util.List;

public interface Trattamento {

    public String getDescrizioneTrattamento();
    public int getCosto();
    public List<Personale> getPersonale();
    public int getNAssistenti();
    public int getDurata();
}
