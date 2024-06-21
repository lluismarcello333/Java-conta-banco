import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Nome:");
        String nome = scanner.next();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Digite o valor que gostaria de depositar na Conta Corrente:");
        double depositoCC = scanner.nextDouble();
        cc.depositar(depositoCC);

        System.out.println("Gostaria de transferir o valor para a Poupança?");
        System.out.println("Digite [1] para transferir");
        System.out.println("Digite [2] para não transferir");

        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Digite o valor que gostaria de transferir para a Conta Poupança:");
            double transferencia = scanner.nextDouble();
            cc.transferir(transferencia, poupanca);
        } else {
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
