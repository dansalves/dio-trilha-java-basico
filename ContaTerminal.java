import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    int agencia;
    String numero;
    String nomeCliente;
    double saldo;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a agencia: ");
    agencia = scanner.nextInt();
    System.out.println("Digite o numero da conta: ");
    numero = scanner.next();
    System.out.println("Digite o nome do cliente: ");
    nomeCliente = scanner.next();
    System.out.println("Digite o saldo: ");
    saldo = scanner.nextDouble();

    System.out.println("Olá, " + nomeCliente + " sua conta é " + agencia + " " + numero + " e seu saldo de $" + saldo
        + " já esta disponivel para saque.");

  }

}