package edu.luiz.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;

    // Construtor
    public CarrinhoDeCompras(){
        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        // Considerando que uma List pode contem vários elementos repetidos
        // para remover todos que tenham o parâmetro nome, deve-se primeiro
        // obter todos os objetos na lista correspondentes
        List<Item> itensParaRemover = new ArrayList<>();

        // errata: faltou tratar o caso em que a lista esta vazia
        if(listaItems.isEmpty()){
            System.out.println("Seu carrinho esta vazio!");
            return;
        }

        for(Item i:listaItems){// for each
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        // Remove todos os objetos contidos em "itensParaRemover" de "listaItens"
        listaItems.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        // errata: faltou tratar o caso em que a lista esta vazia
        if(listaItems.isEmpty()){
            System.out.println("Seu carrinho esta vazio!");
            return 0;
        }

        for(Item i:listaItems){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens(){

        // errata: faltou tratar o caso em que a lista esta vazia
        if(listaItems.isEmpty()){
            System.out.println("Seu carrinho esta vazio!");
            return;
        }

        // Uitlizando o token "this", em sysout(this), resulta na chamada do método de sobrecarga "toString()::CarrinhoDeCompras"
        // implementado logo abaixo, pois o parâmetro do .println() é um objeto da classe "CarrinhoDeCompras"
        // ou seja, .println(this::CarrinhoDeCompras). Se ao invés do "this", fosse o atributo "listaItens"
        // o pseudocódigo seria .println(listaItens::List), e não chamaria o método "toString()::CarrinhoDeCompras".
        System.out.println(this);
        // ENTRETANTO, para que a impressão ocorra da forma correta
        // é necessário sobrecarregar o método "ToString():String"
        // na classe "ITEM"!!
    }

    // Sobrecarga do metodo para impressao mais personalizada
    @Override
    public String toString() {
        return ("Carrinho de Compras: " + listaItems);
    }

    //main
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // testes
        carrinho.adicionarItem("PlayStation5", 5000, 1);
        carrinho.adicionarItem("Controle PS5", 400, 2);
        carrinho.adicionarItem("Controle PS5", 600, 1);

        carrinho.exibirItens();
        System.out.println("Valor Total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Controle PS5");
        carrinho.adicionarItem("Guitarra", 1500, 1);
        
        carrinho.exibirItens();
        System.out.println("Valor Total: " + carrinho.calcularValorTotal());

    }
}
