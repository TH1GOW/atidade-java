public class GerenteTecnico extends Funcionario implements Programador, Lider {

    public GerenteTecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void programar() {
        System.out.println(nome + " está programando em Java.");
    }

    @Override
    public void liderarEquipe() {
        System.out.println(nome + " está liderando a equipe de desenvolvimento.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salarioBase);
        System.out.println("------------------------");
    }
}