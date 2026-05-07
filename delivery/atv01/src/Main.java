import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto("Honda CG fan 160", 120.0, new Motor(160));
        Bicicleta bike = new Bicicleta("Bicicleta",20.0);

        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(moto);
        lista.add(bike);

        for (Veiculo v : lista) {
            v.exibirInformacoes();

            if (v instanceof Entregavel) {
                ((Entregavel) v).realizarEntrega("boa vista");
            }

            System.out.println("----------------------");
        }
    }
}