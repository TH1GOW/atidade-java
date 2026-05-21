public class Main {

    public static void main(String[] args) {


        Time brasil = new Time("Brasil");


        Jogador j1 = new Jogador("Neymar", "Atacante");
        Jogador j2 = new Jogador("wesley França", "Lateral");
        Jogador j3 = new Jogador("Alisson", "Goleiro");


        brasil.adicionarJogador(j1);
        brasil.adicionarJogador(j2);
        brasil.adicionarJogador(j3);


        brasil.exibirElenco();
    }
}