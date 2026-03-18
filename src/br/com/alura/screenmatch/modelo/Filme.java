package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

//HERÂNÇA... A CLASS FILME TEM TUDO QUE UM TITULO TEM!
public final class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getClassificacao(){
    return (int) pegaMedia() /2;
    }
}
