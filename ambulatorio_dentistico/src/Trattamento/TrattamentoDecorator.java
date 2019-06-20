package Trattamento;

import Personale.Personale;

import java.util.ArrayList;
import java.util.List;

public class TrattamentoDecorator implements Trattamento {

    private Trattamento trattamentoDecorated;

    public TrattamentoDecorator(Trattamento t) {
        trattamentoDecorated = t;
    }

    @Override
    public String getDescrizioneTrattamento() {
        return this.trattamentoDecorated.getDescrizioneTrattamento();
    }

    @Override
    public int getCosto() {
        return this.trattamentoDecorated.getCosto();
    }

    @Override
    public List<Personale> getDoctor() {
        return this.trattamentoDecorated.getDoctor();
    }

    @Override
    public int getNAssistenti() {
        return this.trattamentoDecorated.getNAssistenti();
    }

    @Override
    public int getDurata() {
        return this.trattamentoDecorated.getDurata();
    }
}


