import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        int Numero;
        double Saldo;
        String agencia, nomeCliente;
        Scanner entradas = new Scanner(System.in).useLocale(Locale.US);
        
        // Pede ao usuário digitar o nome
        System.out.print("Por favor, digite o Nome do Cliente: ");
        nomeCliente = entradas.nextLine();

        // Pede ao usuário digitar o número da conta (Numero)
        System.out.print("Por favor, digite o Número da conta: ");
        Numero = entradas.nextInt();

        // Pede ao usuário digitar a Agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = entradas.next();

        // Pede ao usuário digitar o Saldo
        System.out.print("Por favor, digite o Saldo da conta: ");
        Saldo = entradas.nextDouble();


        // Imprimindo os resultados
        System.err.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + Numero + " e seu saldo de R$" + Saldo + " já está disponível para saque.");
        
        // Encerra Scanner de entrada
        entradas.close();
    }
}
