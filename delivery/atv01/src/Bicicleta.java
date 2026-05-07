public class Bicicleta extends Veiculo implements Entregavel {

    public Bicicleta(String modelo, double velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
    }

    @Override
    public void realizarEntrega(String destino) {
        System.out.println("Entrega realizada de bicicleta para: " + destino);
    }
}