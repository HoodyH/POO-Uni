package Trattamento;

import Personale.Dottore;
import Personale.Personale;

import java.util.List;

public class TrattamentoCarie extends TrattamentoDecorator{

    public TrattamentoCarie(Trattamento t){
        super(t);
    }

    @Override
    public String getDescrizioneTrattamento() {
        return super.getDescrizioneTrattamento() + ", Cura Carie";
    }

    @Override
    public int getCosto() {
        return super.getCosto() + 100;
    }

    @Override
    public List<Personale> getDoctor() {
        super.getDoctor().add(new Dottore());
        return super.getDoctor();
    }

    @Override
    public int getNAssistenti() {
        return super.getNAssistenti() + 1;
    }

    @Override
    public int getDurata() {
        return super.getDurata() + 100;
    }
}
