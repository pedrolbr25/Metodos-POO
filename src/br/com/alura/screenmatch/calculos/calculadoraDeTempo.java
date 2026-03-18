package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

/*    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        this.tempoTotal  += titulo.getDuracaoEmMinutos();
        System.out.println("add em duração em minutos de " + titulo);
    }
}
