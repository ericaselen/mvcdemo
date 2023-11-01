package br.edu.fatecrl.mvcdemo.models;

public class Filmes {

    private String titulo;
    private String genero;
    private double avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Filmes(String titulo, String genero, double avaliacao){
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }
}
