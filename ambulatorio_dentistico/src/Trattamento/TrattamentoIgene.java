package Trattamento;

import Personale.*;
import java.util.List;

public class TrattamentoIgene extends TrattamentoDecorator{

    public TrattamentoIgene(Trattamento t){
        super(t);
    }

    @Override
    public String getDescrizioneTrattamento() {
        return super.getDescrizioneTrattamento() + ", Igenizzazione";
    }

    @Override
    public int getCosto() {
        return super.getCosto() + 10;
    }

    @Override
    public List<Personale> getDoctor() {
        super.getDoctor().add(new Igenista());
        return super.getDoctor();
    }

    @Override
    public int getNAssistenti() {
        return super.getNAssistenti();
    }

    @Override
    public int getDurata() {
        return super.getDurata() + 50;
    }
}
