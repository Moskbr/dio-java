package edu.luiz.collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(palavras.contains(palavra))
            palavras.remove(palavra);
        else
            System.out.println("Palavra não existe neste conjunto.");
    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(palavras.isEmpty()) return;
        System.out.print("Palavras Unicas: ");
        for(String p : palavras)
            System.out.print(p + " ");
        System.out.print('\n');
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("PORTA");
        conjunto.adicionarPalavra("COPO");
        conjunto.adicionarPalavra("CALENDARIO");
        conjunto.adicionarPalavra("AMOR");
        conjunto.adicionarPalavra("AVENGERS");
        System.out.println("Remove AVIAO (Não contém)");
        conjunto.removerPalavra("AVIAO");

        conjunto.exibirPalavrasUnicas();

        System.out.println("Contém COPO: " + conjunto.verificarPalavra("COPO"));
        System.out.println("Remove COPO");
        conjunto.removerPalavra("COPO");
        conjunto.exibirPalavrasUnicas();
    }
}