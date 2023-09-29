package CofreSeguro.src;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}


//comando para visualizar
// cd /home/est/Dio/projetos-Dio/DominioBancarioJava/
// javac CofreSeguro/src/CofreSeguro/src/Cofre.java
// java CofreSeguro.src.Cofre
