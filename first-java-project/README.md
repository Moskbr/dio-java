# Projeto para Anotações

Esse projeto possui implementações para exercitar conceitos aprendidos no Bootcamp Java da DIO.

O pacote `edu.luiz.fundamentos` possui algumas anotações sobre a linguagem Java, como a classe *Scanner*.
A Classe `edu.luiz.projeto2.App` possui apenas algumas anotações gerais comentadas também sobre a classe *Scanner* do Java.

## *Collections*

Interface da qual é implementada por algumas estruturas de dados. A seguir, anotações das aulas da DIO:
- `List`: Comprimento dinâmico; Permite elementos duplicados; EDs: *ArrayList<>()*, *LinkedList*, *Vector* (pouco utilizado); Exercícios com *ArrayList<>()*.
- `Set`: Exercícios com *HashSet<>()*:
    > O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

    Então como o *HashSet* utiliza indexação baseada na função *hash()*, não é possível manter uma sequência definida. Portanto, para ordenação de um conjunto é necessário utilizar *TreeSet()*:

    > O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

    Em uma Classe T com vários atributos, deve-se decidir qual deles será o valor único (ID/*Private Key*) pelo qual o *Set\<T\>* deverá se basear. Para isso, deve sobrecarregar os métodos `equals()` e `hashCode()`.
- `Map`: chave única/valor (Dicionário); EDs: *HashMap*,*TreeMap*,*LinkedHashMap*; Não herda da interface *Iterator*;

A estrutura de dados `Queue` também implementa a interface *Collections*.

## *Comparator* X *Comparable*

Utilizados para comparações e **ordenação** de objeto do tipo *Collections*

***Comparable***: Implementada pelas classes (`Collections.sort(Collection<T> coll)`). Necessita sobreescrita do `compareTo()`

***Comparator***: Necessita ser implementada por uma classe exclusiva auxiliar (`Collections.sort(Collection<T> coll, Comparator<T> comp)`). Essa classe deve sobrescrever o método `compare()`

Observações:
- ***Class Object***: Classe mãe de todas as outras classes em Java.
- "***diamond operator***": tipo genérico "*Object*\<*Element*>".
- ***Wrapper Class***: Classes que englobam os tipos primitivos de variáveis para adicionar métodos e funcionalidades (por exemplo, todos *wrapper* implementam a função "*.compare()*" da *Comparable*).

### Atividades

O pacote `edu.luiz.collections` implementa atividades propostas pela DIO para cada uma das estrutura de dados (*List*,*Set* e *Map*) divididas em três tópicos: `OperacoesBasicas`, `Odenacao` e `Pesquisa`, uma atividade cada.