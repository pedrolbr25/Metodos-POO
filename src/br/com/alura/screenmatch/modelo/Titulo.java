package br.com.alura.screenmatch.modelo;

public class Titulo {
    public String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasVariacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //ESSE METODO NAO DEVOLVE NADA "VAZIO"
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Data de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }
    public void avalia(double nota) {
        somaDasVariacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasVariacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;

    }
}
