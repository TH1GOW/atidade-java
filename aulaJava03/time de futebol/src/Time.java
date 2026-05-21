import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nomeTime;
    private List<Jogador> jogadores;


    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<>();
    }


    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }


    public void exibirElenco() {

        System.out.println("Time: " + nomeTime);

        for (Jogador j : jogadores) {
            System.out.println("- " + j.getNome() +
                    " (" + j.getPosicao() + ")");
        }
    }
}