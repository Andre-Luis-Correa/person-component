package unioeste.geral.pessoa.bo.sexo;

import java.io.Serializable;

public class Sexo implements Serializable {

    private String sigla;
    private String nome;

    public Sexo(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
