public class Desenvolvedor extends Funcionario implements Programador {
    private Computador computador;

    public Desenvolvedor(String nome, double salarioBase, Computador computador){
        super(nome, salarioBase);
        this.computador = computador;
    }
    @Override
    public void programar() {
        System.out.println(nome + " estar programando em java");
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("salario: " + salarioBase);
        computador.exibirConfiguracao();
        System.out.println("-------------------------------------");
    }
}
