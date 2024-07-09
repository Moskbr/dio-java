package edu.luiz.collections.set.Pesquisa;

import java.util.Objects;// Objects.hash()

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String Descricao) {
        this.concluida = false;
        this.descricao = Descricao;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {// para bool -> isVARIABLE() ao inves de get..
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // o atributo 'descricao' é o atributo de valor único para comparação
    // por isso é necessário sobrecarregar os métodos equals() e hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(this.getDescricao());
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;// se ambos forem o mesmo objeto, verdadeiro
        if(!(obj instanceof Tarefa tarefa)) return false;// se obj não for do tipo 'Tarefa', falso
        // DETALHE: o 'instanceof' da linha acima verifica o tipo e se for true, faz o auto-casting: tarefa = (Tarefa) obj;
        return Objects.equals(this.getDescricao(), tarefa.getDescricao());// assim pode-se comparar as variáveis únicas
    }

    // para impressão correta:
    @Override
    public String toString() {
        if(concluida) return this.getDescricao() + " [X]";
        else return this.getDescricao() + " [ ]";
    }
}
