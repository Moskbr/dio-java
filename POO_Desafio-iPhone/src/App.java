public class App {
    public static void main(String[] args) {
        
        iPhone celular = new iPhone();

        // iPhone como um Aparelho Telefonico
        celular.ligar("+55 45 99999998");
        celular.atender();
        celular.iniciarCorreioVoz();

        // iPhone como um Repodutor Musical
        celular.selecionarMusica("Confortably Numb - Pink Floyd");
        celular.tocar();
        celular.pausar();

        // iPhone como um Navegador de Internet
        celular.exibirPagina("www.google.com");
        celular.atualizarPagina();
        celular.adicionarNovaAba();
    }
}
