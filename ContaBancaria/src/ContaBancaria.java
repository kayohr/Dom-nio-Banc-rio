


public class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getTitular() {
    return this.titular;
  }

  public double getSaldo() {
    return this.saldo;
  }
}
