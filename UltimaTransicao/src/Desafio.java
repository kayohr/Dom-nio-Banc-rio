package UltimaTransicao.src;

import java.util.Scanner;

public class Desafio {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
    if(partes.length == 4){
      String data = partes[0];
      String hora = partes[1];
      String descricao = partes[2];
      double valor = Double.parseDouble(partes[3]);

      Transacao transacao = new Transacao(data, hora, descricao, valor);

      transacao.imprimir();
    }else {
      System.out.println("Entrada inválida. Certifique-se de fornecer os valores corretos.");
  }
  }
}


