package edu.luiz.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma() {
        if(listaInteiros.isEmpty()) return 0;

        int soma = 0;
        for(Integer i:listaInteiros)
            soma += i;

        return soma;
    }

    public int encotrarMaiorNumero() {
        int maiorNumero = 0;
        if(listaInteiros.isEmpty()) return 0;

        for(Integer i: listaInteiros){
            if(maiorNumero < i)
                maiorNumero = i;
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if(listaInteiros.isEmpty()) return 0;

        for(Integer i: listaInteiros){
            if(menorNumero > i)
                menorNumero = i;
        }
        
        return menorNumero;
    }

    public void exibirNumeros() {
        if(!listaInteiros.isEmpty()){
            System.out.print("listaInteiros: ");

            for (Integer i : listaInteiros) {
                System.out.print(i + " ");
            }
            System.out.print('\n');
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(101);
        somaNumeros.adicionarNumero(90);

        somaNumeros.exibirNumeros();

        System.out.println("Maior numero: " + somaNumeros.encotrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Soma: " + somaNumeros.calcularSoma());
    }
}
