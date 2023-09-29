package ContaPoupanca.src;


public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        // Chama o construtor da classe pai
        super(numero, titular, saldo);
        // Inicializa o atributo específico da classe filha
        this.taxaJuros = taxaJuros;
    }

    // Sobrescreva o método exibirInformacoes
    @Override
    public void exibirInformacoes() {
        // Chama o método da classe pai para exibir as informações comuns
        super.exibirInformacoes();
        // Adiciona informações específicas da classe filha
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
