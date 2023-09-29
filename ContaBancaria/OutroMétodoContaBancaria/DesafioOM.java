package ContaBancaria.OutroMétodoContaBancaria;
import java.util.Scanner;

public class DesafioOM {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    // Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancariaOM conta = new ContaBancariaOM(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    // Imprimir as informações da conta usando o objeto criado acima.
    conta.imprimirInformacoes();
  }
}

class ContaBancariaOM {
  int numero;
  String titular;
  double saldo;

  public ContaBancariaOM(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void imprimirInformacoes() {
    System.out.println("Conta: " + numero);
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: R$ " + saldo);
  }
}
