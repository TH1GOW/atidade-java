import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Computador pc = new Computador("Ryzen 5", "16 GB");

        Desenvolvedor dev =
                new Desenvolvedor("Thiago", 1000000.0, pc);

        GerenteTecnico gerente =
                new GerenteTecnico("thigo", 1000000.0);

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(dev);
        lista.add(gerente);

        for (Funcionario f : lista) {
            f.exibirInformacoes();
        }

        dev.programar();
        gerente.programar();
        gerente.liderarEquipe();
    }
}