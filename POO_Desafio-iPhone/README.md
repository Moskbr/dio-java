# POO Desafio: iPhone

Desafio do Bootcamp de Java da DIO para exercício dos conceitos de POO.

## Diagrama UML

``` mermaid

classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +atender()
        +ligar(String numero)
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +exibirPagina(String url)
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

---

Na pasta `src` consta os arquivos das classes apresentadas no diagrama UML.

Considerando que a classe `iPhone.java` implementa as funcionalidades de três outras classes, elas foram declaradas como *interfaces*.

