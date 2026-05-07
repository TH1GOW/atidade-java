public abstract class Veiculo {

    protected String modelo;
    protected double velocidadeMaxima;

    public Veiculo(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void exibirInformacoes();
}