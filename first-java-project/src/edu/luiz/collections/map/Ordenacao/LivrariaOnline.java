package edu.luiz.collections.map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livraria;// linkAmazon=Livro

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(livraria.isEmpty()){
            System.out.println("Livraria vazia");
            return;
        }
        for (Map.Entry<String, Livro> entrada : livraria.entrySet()){
            if(entrada.getValue().getTitulo() == titulo){
                livraria.remove(entrada.getKey());
                break;
            }
        }
        
    }

    public Livro obterLivroMaisCaro(){
        double maiorValor = Double.MIN_VALUE;
        Livro l = null;
        if(!livraria.isEmpty()){
            for (Map.Entry<String, Livro> entrada : livraria.entrySet()){
                if(entrada.getValue().getPreco() > maiorValor){
                    maiorValor = entrada.getValue().getPreco();
                    l = entrada.getValue();
                }
            }
        } else throw new RuntimeException("Livraria vaiza");
        return l;
    }

    public Livro obterLivroMaisBarato(){
        double menorValor = Double.MAX_VALUE;
        Livro l = null;
        if(!livraria.isEmpty()){
            for (Map.Entry<String, Livro> entrada : livraria.entrySet()){
                if(entrada.getValue().getPreco() < menorValor){
                    menorValor = entrada.getValue().getPreco();
                    l = entrada.getValue();
                }
            }
        } else throw new RuntimeException("Livraria vaiza");
        return l;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livraria.isEmpty()){
            for(Livro l : livraria.values()){
                if(l.getAutor().equalsIgnoreCase(autor))
                    livrosAutor.add(l);
            }
        } else throw new RuntimeException("Livraria vaiza");
        return livrosAutor;
    }

    public void exibirLivrosOrdenadosPorPreco(){
        if(livraria.isEmpty()){
            System.out.println("Livraria vazia");
            return;
        }
        // com a Livro implementando compareTo() do Comparable baseando-se no preco, só criar a List
        List<Livro> ordenadoPorPreco = new ArrayList<>(livraria.values());
        Collections.sort(ordenadoPorPreco);

        System.out.println("Livros Ordenados por preço: ");
        for(Livro l : ordenadoPorPreco){
            System.out.println(l);
        }
    }

    public static void main(String[] args) {// copiado do repo cami-la
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}
