package Paziente;

import Ambulatorio.Stanza;
import Personale.Personale;
import Trattamento.Trattamento;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Appuntamento {

    private Date data;
    private Time ora;
    private String dettagli;
    private Stanza stanza;
    private Trattamento trattamento;
    private Paziente paziente;

    public Appuntamento(AppuntamentoBuilder appuntamentoBuilder){
        this.data = appuntamentoBuilder.data;
        this.ora = appuntamentoBuilder.ora;
        this.dettagli = appuntamentoBuilder.dettagli;
        this.stanza = appuntamentoBuilder.stanza;
        this.trattamento = appuntamentoBuilder.trattamento;
        this.paziente = appuntamentoBuilder.paziente;
    }


    public Date getData(){
        return this.data;
    }

    public Time getOra(){
        return this.ora;
    }

    public String getDettagli(){
        return this.dettagli;
    }

    public Stanza getStanza(){
        return this.stanza;
    }

    public int getCosto(){
        return this.trattamento.getCosto();
    }

    public int getDurata(){
        return this.trattamento.getDurata();
    }

    public List<Personale> getPersonale(){
        return this.trattamento.getPersonale();
    }

    public Paziente getPaziente() {
        return this.paziente;
    }

    public class AppuntamentoBuilder {

        public Date data;
        public Time ora;
        public String dettagli;
        public Stanza stanza;
        public Trattamento trattamento;
        public Paziente paziente;

        public AppuntamentoBuilder(Date data, Time ora) {
            this.data = data;
            this.ora = ora;
        }

        public AppuntamentoBuilder addDettagli(String dettagli) {
            this.dettagli = dettagli;
            return this;
        }

        public AppuntamentoBuilder addStanza(Stanza stanza) {
            this.stanza = stanza;
            return this;
        }

        public AppuntamentoBuilder addTrattamento(Trattamento trattamento) {
            this.trattamento = trattamento;
            return this;
        }

        public AppuntamentoBuilder addTrattamento(Paziente paziente) {
            this.paziente = paziente;
            return this;
        }
    }
}
