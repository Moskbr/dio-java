package edu.luiz.collections.list.OperacoesBasicas;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Item(String Nome, double Preco, int qtd){
        this.nome = Nome;
        this.preco = Preco;
        this.quantidade = qtd;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    // Sobrecarga do método toString() para imprimir corretamente a list
    @Override
    public String toString() {
        return (String)(nome+" - "+"R$"+preco+" "+quantidade+" un");
    }
}