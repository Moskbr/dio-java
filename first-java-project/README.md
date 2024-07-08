# Projeto para Anotações

Esse projeto possui implementações para exercitar conceitos aprendidos no Bootcamp Java da DIO.

O pacote `edu.luiz.fundamentos` possui algumas anotações sobre a linguagem Java, como a classe *Scanner*.
A Classe `edu.luiz.projeto2.App` possui apenas algumas anotações gerais comentadas também sobre a classe *Scanner* do Java.

## *Collections*

Interface da qual é implementada por algumas estruturas de dados. A seguir, anotações das aulas da DIO:
- `List`: Comprimento dinâmico; Permite elementos duplicados;
- `Set`:
- `Map`:

A estrutura de dados `Queue` também implementa a interface *Collections*.

## *Comparator* X *Comparable*

Utilizados para comparações e **ordenação** de objeto do tipo *Collections*

*Comparable*: Implementada pelas classes (`Collections.sort(Collection<T> coll)`).

*Comparator*: Necessita ser implementada por uma classe exclusiva (`Collections.sort(Collection<T> coll, Comparator<T> comp)`).

Observações:
- ***Class Object***: Classe mãe de todas as outras classes em Java.
- "***diamond operator***": tipo genérico "*Object*\<*Element*>".
- ***Wrapper Class***: Classes que englobam os tipos primitivos de variáveis para adicionar métodos e funcionalidades (por exemplo, todos *wrapper* implementam a função "*.compare()*" da *Comparable*).

### Atividades

O pacote `edu.luiz.collections` implementa atividades propostas pela DIO para cada uma das estrutura de dados (*List*,*Set* e *Map*) divididas em três tópicos: `OperacoesBasicas`, `Odenacao` e `Pesquisa`, uma atividade cada.