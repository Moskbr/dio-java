public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    // Implementando NavegadorInternet
    public void adicionarNovaAba(){
        System.out.println("Uma nova aba foi aberta.");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página...\tPágina Atualizada.");
    }

    // Implementando AparelhoTelefonico
    public void atender(){
        System.out.println("Ligação atendida.");
    }
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    // Implementando ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando música.");
    }
    public void pausar(){
        System.out.println("Musica pausada.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecinando musica " + musica);
    }
}
