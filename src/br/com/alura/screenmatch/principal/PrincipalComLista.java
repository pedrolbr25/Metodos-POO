package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vigadores", 2012);
        meuFilme.avalia(9);
        Filme outroFillme = new Filme("Jesus", 2021);
        outroFillme.avalia(9);
        var filmeDoPedro = new Filme("Avatar", 2023);
        filmeDoPedro.avalia(9);
        Serie lost = new Serie("lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFillme);
        lista.add(filmeDoPedro);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }
        ArrayList<String> buscarPorNome = new ArrayList<>();
        buscarPorNome.add("Paulo");
        buscarPorNome.add("Pedro");
        buscarPorNome.add("Silva");
        System.out.println(buscarPorNome);

        Collections.sort(buscarPorNome);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorNome);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordem por ano");
        System.out.println(lista);
    }
}
