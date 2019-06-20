package Paziente;

public class Paziente {

    private String nome;
    private String data_aggiunta;
    private String dettagli;

    public Paziente(PazienteBuilder pazienteBuilder){
        this.nome = pazienteBuilder.nome;
        this.data_aggiunta = pazienteBuilder.data_aggiunta;
        this.dettagli = pazienteBuilder.dettagli;
    }

    public String getNome(){
        return this.nome;
    }

    public String getData(){
        return this.data_aggiunta;
    }

    public String getDettagli(){
        return this.dettagli;
    }


    public class PazienteBuilder {

        public String nome;
        public String data_aggiunta;
        public String dettagli;


        public PazienteBuilder(String nome, String data) {
            this.nome = nome;
            this.data_aggiunta = data_aggiunta;
        }

        public PazienteBuilder addDettagli(String dettagli) {
            this.dettagli = dettagli;
            return this;
        }
    }
}
