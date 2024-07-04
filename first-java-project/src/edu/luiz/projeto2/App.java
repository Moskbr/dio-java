package edu.luiz.projeto2;

import java.util.Locale;// "Convencao de escrita dos dados" como 2.5 (US) ou 2,5 (br)
import java.util.Scanner;// aka scanf()

public class App {
    
    public static void main(String[] args){
        // ----------- Scanner -----------------------------
        // System.out.println("Heloooooooo" + args[0]);// --> com launch.json
        // scanner = entradas do usuario no sistema (System.in) na convencao americana
        // entradas separadas por espaço ou enter, igual scanf
        Scanner buffer = new Scanner(System.in).useLocale(Locale.US);
        // next retorna string, "proximo" move o ponteiro do buffer
        // converte entrada para int; outro: .nextDouble(), ...

        // ---------- Colletions (List, Queue, Set, Map) --- Comparate X Comparable

        buffer.close();// fechar buffer de entrada*
    }
}
