package Ambulatorio;

import Paziente.Appuntamento;
import Paziente.Paziente;
import Personale.Personale;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Ambulatorio {

    private List<Personale> personale;
    private List<Stanza> stanze;
    private List<Appuntamento> appuntamenti;
    private List<Paziente> pazienti;

    public Ambulatorio(){

    }

    public void addRoom(){

    }

    public void creaPianoTerapeutico(){

    }

    public String findRoom(Date data, Time ora, int tempo){

        for (Stanza stanza : stanze){
            for(Appuntamento appuntamento : appuntamenti){
                //controlla l'ora
                return "";
            }
        }
        return "";
    }

    public Boolean medicoLibero(Personale medico, Date data, Time tempo){
        for(Appuntamento appuntamento : appuntamenti){
            if(appuntamento.getData() == data && appuntamento.getOra().compareTo(tempo) == 0)
            for(Personale personale : appuntamento.getPersonale()){
                if (personale == medico){
                    return false;
                }
            }
        }
        return true;
    }

}
