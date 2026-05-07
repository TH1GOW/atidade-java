public class Moto extends Veiculo implements Entregavel {

    private Motor motor;

    public Moto(String modelo, double velocidadeMaxima, Motor motor) {
        super(modelo, velocidadeMaxima);
        this.motor = motor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        motor.exibirMotor();
    }

    @Override
    public void realizarEntrega(String destino) {
        System.out.println("Entrega realizada de moto para: " + destino);
    }
}