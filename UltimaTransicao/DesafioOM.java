// import java.util.Scanner;

// public class Desafio {
    
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     // Lê a entrada do usuário
//     String entrada = scanner.nextLine();

//     // Divide a entrada usando a vírgula como delimitador
//     String[] partes = entrada.split(",");

//     // Verifica se há partes suficientes para criar uma transação
//     if (partes.length == 4) {
//         // Extrai os valores das partes
//         String data = partes[0];
//         String hora = partes[1];
//         String descricao = partes[2];
//         double valor = Double.parseDouble(partes[3]);

//         // Cria uma instância da classe Transacao
//         Transacao transacao = new Transacao(data, hora, descricao, valor);

//         // Imprime as informações da transação
//         transacao.imprimir();
//     } else {
//         System.out.println("Entrada inválida. Certifique-se de fornecer os valores corretos.");
//     }
//   }
// }

// class Transacao {
//   private String data;
//   private String hora;
//   private String descricao;
//   private double valor;

//   public Transacao(String data, String hora, String descricao, double valor) {
//     this.data = data;
//     this.hora = hora;
//     this.descricao = descricao;
//     this.valor = valor;
//   }
  
//   public void imprimir() {
//     System.out.println(this.descricao);
//     System.out.println(this.data);
//     System.out.println(this.hora);
//     System.out.printf("%.2f", this.valor);
//   }
// }
