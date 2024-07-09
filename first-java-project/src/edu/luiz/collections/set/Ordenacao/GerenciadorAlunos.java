package edu.luiz.collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        if(alunos.isEmpty()){
            System.out.println("Conjunto vazio!");
            return;
        }
        for (Aluno a : alunos) {
            if(a.getMatricula() == matricula){
                alunos.remove(a);
                break;
            }
        }
    }

    public void exibirAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Conjunto de Alunos vazio!");
            return;
        }
        System.out.println("Conjunto de Alunos: ");
        System.out.println("NOME | MATRICULA | MEDIA");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNome(){// ordenação por NOME com Comparable
        if(alunos.isEmpty()){
            System.out.println("Conjunto de Alunos vazio!");
            return;
        }

        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);// utilizando TreeSet para manter ordenação
        // TreeSet automaticamente organiza os dados em ordem crescente (nesse caso, alfabética)
        System.out.println("Por Nome: ");
        System.out.println("NOME | MATRICULA | MEDIA");
        for (Aluno a : alunosPorNome) {
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNota(){// ordenação utilizando Comparator
        if(alunos.isEmpty()){
            System.out.println("Conjunto de Alunos vazio!");
            return;
        }
        // o argumento do TreeSet<>(arg) indica a maneira com que os dados serão organizados (sobrecarga)
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunos);

        System.out.println("Por Nome: ");
        System.out.println("NOME | MATRICULA | MEDIA");
        for (Aluno a : alunosPorNota) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {// main copiada do repo github/cami-la
        // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    gerenciadorAlunos.exibirAlunos();

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    gerenciadorAlunos.exibirAlunos();

    // Exibindo alunos ordenados por nome
    gerenciadorAlunos.exibirAlunosPorNome();

    // Exibindo alunos ordenados por nota
    gerenciadorAlunos.exibirAlunosPorNota();
    }
}
