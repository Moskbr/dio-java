package edu.luiz.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> qtdPalavras;

    public ContagemPalavras() {
        this.qtdPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        qtdPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(qtdPalavras.containsKey(palavra))
            qtdPalavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        if(!qtdPalavras.isEmpty())
            System.out.println(qtdPalavras);
        else System.out.println("Dicionario vazio");
    }

    public void encontrarPalavraMaisFrequente(){
        int maiorContagem = Integer.MIN_VALUE;// menor valor possível para iniciar comparação
        String p = null;
        if(!qtdPalavras.isEmpty()){
            for(Map.Entry<String, Integer> entrada : qtdPalavras.entrySet()){// para cada entry no conjunto (Set) par <string,int>
                if(entrada.getValue() > maiorContagem){
                    maiorContagem = entrada.getValue();// pega a contagem mais alta
                    p = entrada.getKey();// pega a sua respectiva palavra
                }
            }
        }
        else throw new RuntimeException("Dicionario vazio");
        System.out.println("Palavra mais usada: " + p + " Contagem: " + maiorContagem);
    }

    public static void main(String[] args) {// copiado do repositorio da cami-la
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        contagemLinguagens.encontrarPalavraMaisFrequente();
    }
}
