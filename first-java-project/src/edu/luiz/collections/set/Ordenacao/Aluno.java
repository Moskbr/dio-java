package edu.luiz.collections.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;// chave primária (para sobrecarregar equals() e hashCode())
    private double media;

    public Aluno(String Nome, Long Matricula, double Media) {
        this.matricula = Matricula;
        this.nome = Nome;
        this.media = Media;
    }
    // Getters
    public Long getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }

    // equals() e hashCode() com base no atributo 'matricula'
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Aluno aluno)) return false;
        return Objects.equals(this.getMatricula(), aluno.getMatricula());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getMatricula());
    }

    @Override
    public String toString() {
        return nome + " | " + matricula + " | " + media;
    }
    @Override// ordenação por NOME com Comparable
    public int compareTo(Aluno a) {
        return this.getNome().compareToIgnoreCase(a.getNome());
    }
}

// A fim de exercitar o conceito, a ordenação por NOTA feita por Comparator:
class ComparatorNota implements Comparator<Aluno> {// necessário classe auxiliar

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
    
}
