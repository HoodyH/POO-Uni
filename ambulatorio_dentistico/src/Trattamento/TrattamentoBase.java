package Trattamento;

import Personale.Personale;

import java.util.ArrayList;
import java.util.List;

public class TrattamentoBase implements Trattamento {

    private int costo = 10;
    private String desctizione = "Controllo pre trattamento";

    public TrattamentoBase() {

    }

    @Override
    public String getDescrizioneTrattamento() {
        return desctizione;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public List<Personale> getDoctor() {
        return new ArrayList<Personale>();
    }

    @Override
    public int getNAssistenti() {
        return 0;
    }

    @Override
    public int getDurata() {
        return 10;
    }
}

