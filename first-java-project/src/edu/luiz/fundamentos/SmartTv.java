package edu.luiz.fundamentos;

public class SmartTv {// basicamente C++ mas atencao na nomenclatura
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){// metodos no verbo infinitivo, estilo 'camelCase'
        volume++;
        System.out.println("Novo volume: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Novo volume: " + volume);
    }
    public void ligar(){
        ligada = true;
        System.out.println("TV Ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("TV Desligada");
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }
}
