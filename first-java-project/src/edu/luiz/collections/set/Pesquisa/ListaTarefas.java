package edu.luiz.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Lista de Tarefas vazia!");
            return;
        }
        Tarefa tarefaRemover = new Tarefa(descricao);
        if(tarefas.contains(tarefaRemover))
            tarefas.remove(tarefaRemover);
        else
            System.out.println("Essa Tarefa não existe neste conjuto");
    }

    public void exibirTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Lista de Tarefas vazia!");
            return;
        }
        System.out.println("Lista de Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if(!tarefas.isEmpty()){
            Set<Tarefa> tarefasConlcuidas = new HashSet<>();
            for (Tarefa t : tarefas) {
                if(t.isConcluida())
                    tarefasConlcuidas.add(t);
            }
            return tarefasConlcuidas;
        } else {
            throw new RuntimeException("Lista de Tarefas Vazia!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        if(!tarefas.isEmpty()){
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for (Tarefa t : tarefas) {
                if(!t.isConcluida())
                tarefasPendentes.add(t);
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Lista de Tarefas Vazia!");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Lista de Tarefas vazia!");
            return;
        }
        Tarefa tarefaConcluida = new Tarefa(descricao);

        if(!tarefas.contains(tarefaConcluida)){
            System.out.println("Essa Tarefa não existe neste conjunto");
            return;
        }
        for (Tarefa t : tarefas) {
            if(t.equals(tarefaConcluida))
                t.setConcluida(true);
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Lista de Tarefas vazia!");
            return;
        }
        Tarefa tarefaPendente = new Tarefa(descricao);

        if(!tarefas.contains(tarefaPendente)){
            System.out.println("Essa Tarefa não existe neste conjunto");
            return;
        }
        for (Tarefa t : tarefas) {
            if(t.equals(tarefaPendente))
                t.setConcluida(false);
        }
    }

    public void limparListaTarefas(){
        this.tarefas.removeAll(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");
        listaTarefas.adicionarTarefa("tarefa 4");
        listaTarefas.adicionarTarefa("tarefa 5");
        listaTarefas.adicionarTarefa("tarefa 6");

        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("tarefa 6");
        listaTarefas.marcarTarefaConcluida("tarefa 2");
        listaTarefas.marcarTarefaConcluida("tarefa 3");
        listaTarefas.marcarTarefaConcluida("tarefa 5");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("tarefa 5");
        listaTarefas.marcarTarefaPendente("tarefa 6");// nao consta
        listaTarefas.exibirTarefas();

        Set<Tarefa> temp = listaTarefas.obterTarefasConcluidas();
        System.out.println("Tarefas Concluidas: " + temp);
        temp = listaTarefas.obterTarefasPendentes();
        System.out.println("Tarefas Pendentes: " + temp);

        System.out.println("Quantidade de Tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.limparListaTarefas();
        System.out.println("Quantidade de Tarefas: " + listaTarefas.contarTarefas());
    }
}