package edu.luiz.fundamentos;   // src/edu/luiz/fundamentos
public class Usuario {
    public static void main(String[] args) throws Exception {// 'Exception' -> pode gerar execao/erro
        
        SmartTv smartTv = new SmartTv();// cria novo objeto com new Classe() -> construtor

        System.out.println("TV Ligada: " + smartTv.ligada);// System = classe do 'sistema'
        smartTv.ligar();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(10);

        // ademais: #define em C vira: final <type> VAR_NAME = x;

    }
}
