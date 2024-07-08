package edu.luiz.collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaInteiros;

    public OrdenacaoNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.listaInteiros);
        if (!listaInteiros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.listaInteiros);
        if (!listaInteiros.isEmpty()) {
            Collections.sort(numerosDescendente, Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
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
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(101);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(87);
        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordem Crescente: " + ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordem Decrescente: " + ordenacaoNumeros.ordenarDescendente());
        ordenacaoNumeros.exibirNumeros();
    }
}
