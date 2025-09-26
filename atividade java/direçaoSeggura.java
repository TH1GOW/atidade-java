public class direçaoSeggura {
    public static double distanciaRegra2s(double velocidade_kmh) {
        double v = velocidade_kmh / 3.6; // m/s
        return v * 2.0;
    }
    // Distância total de parada = reação + frenagem
    public static double distanciaParada(double velocidade_kmh, double tempoReacao_s, double desaceleracao_mps2) {
        double v = velocidade_kmh / 3.6; // m/s
        double reacao = v * tempoReacao_s;
        double frenagem = (v * v) / (2.0 * Math.abs(desaceleracao_mps2));
        return reacao + frenagem;
    }
    public static void main(String[] args) {
        double vel = 60.0; // km/h
        System.out.println("Distância pela regra dos 2s: " + distanciaRegra2s(vel) + " m");
        System.out.println("Distância de parada com reação 1s e desaceleração 6 m/s²: " +
                distanciaParada(vel, 1.0, 6.0) + " m");
    }
}
