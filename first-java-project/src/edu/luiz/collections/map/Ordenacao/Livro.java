package edu.luiz.collections.map.Ordenacao;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String Titulo, String Autor, double Preco) {
        this.titulo = Titulo;
        this.autor = Autor;
        this.preco = Preco;
    }

    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return titulo + " - " + autor + " - R$" + preco;
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(this.getPreco(), l.getPreco());
    }

}
