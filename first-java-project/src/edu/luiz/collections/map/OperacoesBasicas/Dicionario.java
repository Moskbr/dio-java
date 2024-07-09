package edu.luiz.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dict;

    public Dicionario() {
        this.dict = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dict.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(dict.isEmpty()){
            System.out.println("Dicionario vazio!");
            return;
        }
        this.dict.remove(palavra);
    }

    public void exibirPalavras(){
        if(dict.isEmpty()){
            System.out.println("Dicionario vazio!");
            return;
        }
        System.out.println(dict);
    }

    public String pesquisarPorPalavra(String palavra){
        if(dict.containsKey(palavra))
            return dict.get(palavra);
        return "Não consta no dicionário";
    }

    public static void main(String[] args) {// main copiado do repo github/cami-la
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
