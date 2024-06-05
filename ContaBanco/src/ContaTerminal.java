import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o valor que gostaria de depositar:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
