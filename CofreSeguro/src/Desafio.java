package CofreSeguro.src;
import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
        int senha = scanner.nextInt();
        int confirmacaoSenha = scanner.nextInt();

        CofreDigital cd = new CofreDigital(senha);

    if(cd.validarSenha(confirmacaoSenha)) {
        System.out.println("Tipo: Cofre Digital");
        System.out.println("Metodo de abertura: Senha");
        System.out.println("Cofre aberto!");
    }else {
        System.out.println("Tipo: Cofre Digital");
        System.out.println("Metodo de abertura: Senha");
        System.out.println("Senha incorreta!");
    } 
  }else if (tipoCofre.equalsIgnoreCase("fisico")) {
    CofreFisico cofreFisico = new CofreFisico();
    cofreFisico.imprimirInformacoes();
  }
}
}